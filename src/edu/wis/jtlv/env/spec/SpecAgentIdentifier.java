package edu.wis.jtlv.env.spec;

import edu.wis.jtlv.env.Env;
import net.sf.javabdd.BDD;
import net.sf.javabdd.BDDVarSet;

public class SpecAgentIdentifier implements Spec {
	private String agentName;
	private Spec originSpec;//the spec without translating
	private Spec originLeftSpec;//the spec without translating


	public SpecAgentIdentifier(String agentName) {
		this.agentName = agentName;
	}

	public String getAgentName() { return this.agentName; }

	/* (non-Javadoc)
	 * @see edu.wis.jtlv.env.spec.Spec#isPropSpec()
	 */
	public boolean isPropSpec() {
		return true;
	}

	/* (non-Javadoc)
	 * @see edu.wis.jtlv.env.spec.Spec#isCTLSpec()
	 */
	public boolean isCTLSpec() {
		return true;
	}

	@Override
	public boolean isCTLKSpec() {
		return true;
	}

	/* (non-Javadoc)
	 * @see edu.wis.jtlv.env.spec.Spec#isRealTimeCTLSpec()
	 */
	public boolean isRealTimeCTLSpec() {
		return true;
	}

	@Override
	public boolean isRealTimeCTLKSpec() {
		return true;
	}

	/* (non-Javadoc)
	 * @see edu.wis.jtlv.env.spec.Spec#isRealTimeLTLSpec()
	 */
	public boolean isRealTimeLTLSpec() {
		return true;
	}

	@Override
	public boolean isRealTimeLTLKSpec() {
		return true;
	}

	/* (non-Javadoc)
	 * @see edu.wis.jtlv.env.spec.Spec#isLTLSpec()
	 */
	public boolean isLTLSpec() {
		return true;
	}

	/* (non-Javadoc)
	 * @see edu.wis.jtlv.env.spec.Spec#isFutureLTLSpec()
	 */
	public boolean isFutureLTLSpec() {
		return true;
	}

	/* (non-Javadoc)
	 * @see edu.wis.jtlv.env.spec.Spec#isPastLTLSpec()
	 */
	public boolean isPastLTLSpec() {
		return true;
	}

	/* (non-Javadoc)
	 * @see edu.wis.jtlv.env.spec.Spec#isCTLStarSpec()
	 */
	public boolean isCTLStarSpec() {
		return true;
	}

	/* (non-Javadoc)
	 * @see edu.wis.jtlv.env.spec.Spec#hasTemporalOperators()
	 */
	public boolean hasTemporalOperators() {
		return false;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return getAgentName();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object other) {
		if (!(other instanceof SpecAgentIdentifier))
			return false;
		SpecAgentIdentifier otherCTLAgentId = (SpecAgentIdentifier) other;
		return (this.agentName.equals(otherCTLAgentId.getAgentName()));
	}

	/* (non-Javadoc)
	 * @see edu.wis.jtlv.env.spec.Spec#releventVars()
	 */
	public BDDVarSet releventVars() {
		return Env.getEmptySet();
	}

	/* (non-Javadoc)
	 * @see edu.wis.jtlv.env.spec.Spec#toBDD()
	 */
	public BDD toBDD() throws SpecException {
		throw new SpecException("Cannot convert Agent Identifier into BDD.");
	}

	public Spec getOriginSpec() {
		return originSpec;
	}

	public void setOriginSpec(Spec originSpec) {
		this.originSpec = originSpec;
	}

	public Spec getOriginLeftSpec() {
		return originLeftSpec;
	}

	public void setOriginLeftSpec(Spec originLeftSpec) {
		this.originLeftSpec = originLeftSpec;
	}
}
