package edu.wis.jtlv.env.core.smv.schema;

import edu.wis.jtlv.env.Env;
import edu.wis.jtlv.env.core.smv.SMVParseException;
import edu.wis.jtlv.env.module.Module;
import edu.wis.jtlv.env.module.ModuleBDDField;
import net.sf.javabdd.BDDVarSet;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

//LXY: for MAS
// hold an agent's information
public class SMVAgentInfo {
    public String name;    // the agent's name, without "main." as its prefix
    public Module module;  // the module instance of the agent
//    private Vector<String> VisVarNames;   // the set of visible variables of the agent

    public HashSet<ModuleBDDField> VisActualParams; // visible actual arguments
    public HashSet<ModuleBDDField> VisLocalVars; // visible local variables within VAR
    public HashSet<ModuleBDDField> InvisLocalVars; // including the invisible local variables within INVISIBLEVAR.
                                                    // If a sub-module instance is within INVISIBLEVAR, then all of its
                                                    // local variables are also invisible, recursively
//    public Vector<ModuleBDDField> VisVars; // the union of visible actual arguments and visible local variables

    public SMVAgentInfo(String agent_fullname) throws SMVParseException {
        if(agent_fullname.equals("")) throw new SMVParseException("The agent's name can not be empty.");

        this.name = agent_fullname;
        this.module = Env.getModule(agent_fullname);
        VisActualParams = new HashSet<ModuleBDDField>(10);
        VisLocalVars = new HashSet<ModuleBDDField>(10);
        InvisLocalVars = new HashSet<ModuleBDDField>(10);
    }

    public String[] getModuleBDDField_fullnames(HashSet<ModuleBDDField> set) {
        String[] names = new String[set.size()];
        int i = 0;
        for (ModuleBDDField var : set) {
            String path = var.getPath();
            String name = var.getName();
            if(path.equals("")) names[i] = name;
            else names[i] = path + "." + name;
            i++;
        }
        return names;
    }

    public HashSet<ModuleBDDField> getVisVars() {
        HashSet<ModuleBDDField> vs = (HashSet<ModuleBDDField>) this.VisLocalVars.clone();
        if(vs == null)
            return this.VisActualParams;
        else { //vs is not null
            vs.addAll(this.VisActualParams);
            return vs;
        }
    }

    public String[] getVisVarNames() {
        SMVAgentInfo agentInfo = Env.getAll_agent_modules().get(this.name);
        return getModuleBDDField_fullnames(agentInfo.getVisVars());
    }

    // return the set of BDD variables for the visible variables
    public BDDVarSet getModuleBDDField_BDDVarSet(HashSet<ModuleBDDField> set) {
        BDDVarSet vs = Env.getEmptySet() ;
        for (ModuleBDDField var : set) {
            vs = vs.id().union(var.support());
        }
        return vs;
    }

    public BDDVarSet getVisVars_BDDVarSet() {
        HashSet<ModuleBDDField> visVars = this.getVisVars();
        return getModuleBDDField_BDDVarSet(visVars);
    }

}
