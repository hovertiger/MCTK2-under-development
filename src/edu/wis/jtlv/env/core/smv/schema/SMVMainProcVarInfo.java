package edu.wis.jtlv.env.core.smv.schema;

import edu.wis.jtlv.env.Env;
import edu.wis.jtlv.env.core.smv.SMVParseException;
import edu.wis.jtlv.env.module.ModuleBDDField;
import edu.wis.jtlv.env.module.ModuleParamHolder;
import edu.wis.jtlv.env.module.SMVModule;
import net.sf.javabdd.BDDVarSet;

import java.util.HashSet;
import java.util.Vector;

public class SMVMainProcVarInfo extends SMVContainerElementInfo {
	public SMVModuleInfo proc_desc;

	public SMVMainProcVarInfo(SMVModuleInfo proc_desc) throws SMVParseException {
		super(false,"main", null); // this module have no initiate info...
		this.proc_desc = proc_desc;
	}

	@Override
	public SMVAbstractElementInfo clone_element() throws SMVParseException {
		throw new SMVParseException(
				"Cannot have more then a single main instance.");
	}

	@Override
	public String typeString() {
		return "";
	}

	@Override
	public void mk_fix_names() throws SMVParseException {
		this.proc_desc.mk_fix_names();
	}

	@Override
	public void mk_modules_skel(SMVModule instance_holder)
			throws SMVParseException {
		String inst_full_name = this.name; // "main"
		SMVModule inst = new SMVModule(this.proc_desc, inst_full_name);
		Env.putModule(inst_full_name, inst); // registering
		this.proc_desc.mk_modules_skel(inst);
	}

	@Override
	public void mk_defines(SMVModule instance_holder) throws SMVParseException {
		String inst_full_name = this.name; // "main"
		SMVModule inst = (SMVModule) Env.getModule(inst_full_name);
		this.proc_desc.mk_defines(inst);
	}

	@Override
	public void mk_variables(SMVModule instance_holder)
			throws SMVParseException {
		String inst_full_name = this.name; // "main"
		SMVModule inst = (SMVModule) Env.getModule(inst_full_name);
		this.proc_desc.mk_variables(inst);
	}

	@Override
	public void mk_module_args(SMVModule instance_holder)
			throws SMVParseException {
		String inst_full_name = this.name; // "main"
		SMVModule inst = (SMVModule) Env.getModule(inst_full_name);
		this.proc_desc.mk_module_args(inst);
	}

	private void collect_agent_information_recur(String module_name, // the name of a module instance
												 Boolean module_visible_for_its_holder,
												 SMVAgentInfo agent_info)
			throws SMVParseException{
		SMVModule module = (SMVModule) Env.getModule(module_name);

		//(1) check each local variable of the module
		Vector<SMVAbstractElementInfo> module_lvars = module.getModuleInfo().getSub_elements();
		for (SMVAbstractElementInfo lvar : module_lvars) {
			// get the datatype of lvar
			String lvar_type = lvar.getClass().getName();
			int dot_idx = lvar_type.lastIndexOf('.');
			if(dot_idx!=-1)  lvar_type = lvar_type.substring(dot_idx+1);

			String lvar_fullname = module_name + "." + lvar.name;
			if(lvar_type.equals("SMVProcVarInfo")) {  // lvar is a module instance
				SMVProcVarInfo lvar_proc = (SMVProcVarInfo) lvar;
				if (lvar_proc.proc_desc.isAgent) {
					// the agent's local module instance lvar is also an agent, this is not allowed
					//System.out.println("The agent's local module instance " + lvar_fullname + " is also an agent, this is not allowed.");
					throw new SMVParseException("The agent's local module instance " + lvar_fullname + " is also an agent, this is not allowed.");
				}

				collect_agent_information_recur(lvar_fullname,
											module_visible_for_its_holder && lvar.visible,
												agent_info);

			}else { // lvar is a normal variable
				// find the couple of lvar
				ModuleBDDField[] all_lvar_fields = module.getAllFields();
				Boolean found = false;
				int i = 0;
				while(i<all_lvar_fields.length) {
					if (lvar_fullname.equals(all_lvar_fields[i].getPath() + "." + all_lvar_fields[i].getName())) {
						found = true;
						break;
					}
					i++;
				}
				if(!found) throw new SMVParseException("can not find out the field of local variable " + lvar_fullname);

				// collect the field of lvar_fullname
				if(module_visible_for_its_holder && lvar.visible) { // lvar is visible
					agent_info.VisLocalVars.add(all_lvar_fields[i]);
				}else{ // lvar is invisible
					agent_info.InvisLocalVars.add(all_lvar_fields[i]);
				}
			}
		}

		//(2) check each argument of the module

	}

	private void collect_agent_information(String agent_fullname) throws SMVParseException { // agentName is with path "main."
		SMVAgentInfo agent_info = new SMVAgentInfo(agent_fullname);
		SMVModule agent_module = (SMVModule) agent_info.module;

		//(1) collect visible and invisible local variables of the agent
		collect_agent_information_recur(agent_fullname, true, agent_info);

		//(2) collect visible parameters of the agent
		ModuleParamHolder[] params = agent_module.getAllParams();
		Boolean[] params_visible_list = agent_module.getModuleInfo().arg_visible_list;
		if(params.length != params_visible_list.length) {
			throw new SMVParseException("There is some problem with the number of parameters of agent " + agent_fullname);
		}

		HashSet<ModuleBDDField> visible_actual_params = new HashSet<>(10);
		for (int i = 0; i < params_visible_list.length; i++) {
			// any actual parameter can not be one of the local variables of the agent
			if (agent_info.VisLocalVars.contains(params[i].getVar()) || agent_info.InvisLocalVars.contains(params[i].getVar())) {
				throw new SMVParseException("The actual parameter " +
						params[i].getVar().getPath()+"."+params[i].getVar().getName() +
						" is a local variable of agent " + agent_fullname + ". This is not allowed.");
			}

			if(params_visible_list[i]) { //params[i] is visible
				visible_actual_params.add(params[i].getVar());
			}
		}
		agent_info.VisActualParams = visible_actual_params;
		// Till now the construction of agent_info finished

		Env.getAll_agent_modules().put(agent_fullname, agent_info);

		System.out.println("-------------------------------------------------");
		System.out.println(agent_fullname + "'s visible variables:");
		String[] vnames = agent_info.getVisVarNames();
		for (String vname : vnames) {
			System.out.println(vname);
		}

	}




	// LXY: for MAS
	// this method constructs the information of all agent module instances Env.all_agent_modules.
	// It must be executed after Env.all_modules is constructed by the above methods
	public void mk_agent_modules() throws SMVParseException {

		Vector<SMVAbstractElementInfo> main_insts = this.proc_desc.getSub_elements();
		for (SMVAbstractElementInfo main_inst : main_insts) {
			String main_inst_type;
			main_inst_type = main_inst.getClass().getName();
			int dot_idx = main_inst_type.lastIndexOf('.');
			if(dot_idx!=-1)  //found '.'
				main_inst_type = main_inst_type.substring(dot_idx+1);

			if(main_inst_type.equals("SMVProcVarInfo")) {  // the current main_inst is a Module or Agent
				SMVProcVarInfo main_inst_proc = (SMVProcVarInfo)main_inst;
				if(main_inst_proc.proc_desc.isAgent) { // main_inst is an agent, main_inst.name does not include path
					String agent_name = "main." + main_inst.name;
					collect_agent_information(agent_name);
				}

			}

		}


	}
}
