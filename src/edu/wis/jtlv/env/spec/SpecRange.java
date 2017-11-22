package edu.wis.jtlv.env.spec;

import edu.wis.jtlv.env.Env;
import net.sf.javabdd.BDD;
import net.sf.javabdd.BDDVarSet;

/**
 * <p>
 * This node is a range node for the Real Time CTL operators.<br>
 * Simple ranges are not assigned with such a node, and are evaluated as a smv
 * expressions.<br>
 * For consistency, this is not regarded as a temporal operator in the queries.
 * Its holder should mark it as a temporal operator.
 * </p>
 *
 * <p>
 * UPDATING20170428<br/>
 * RTLTL, RTCTL and RTCTL* all have range expression,
 * this node is not need to specific just for CTL(so change name to SpecRange)
 * </p>
 * 
 * @version {@value edu.wis.jtlv.env.Env#version}
 * @author yaniv sa'ar.
 * 
 */
public class SpecRange implements Spec {
	private int from;
	private int to;
	private Spec originSpec;//the spec without translating
	private Spec originLeftSpec;//the spec without translating

	/**
	 * <p>
	 * A constructor for (Real Time) CTL range.
	 * </p>
	 * 
	 * @param from range start.
	 * @param to range end
	 */
	public SpecRange(int from, int to) {
		this.from = from;
		this.to = to;
	}

	/**
	 * <p>
	 * Get the range start.
	 * </p>
	 * 
	 * @return The range start.
	 */
	public int getFrom() {
		return this.from;
	}

	/**
	 * <p>
	 * Get the range end.
	 * </p>
	 * 
	 * @return The range end.
	 */
	public int getTo() {
		return this.to;
	}

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
		return false;
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

	public boolean hasEpistemicOperators() {
		return false;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "#[" + this.getFrom() + ".." + this.getTo() + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object other) {
		if (!(other instanceof SpecRange))
			return false;
		SpecRange otherCTLRange = (SpecRange) other;
		return ((this.from == otherCTLRange.from) && (this.to == otherCTLRange.to));
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
		throw new SpecException("Cannot convert CTL range into BDD.");
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
