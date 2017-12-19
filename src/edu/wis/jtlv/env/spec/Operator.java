package edu.wis.jtlv.env.spec;

/**
 * <p>
 * All kinds of operators.
 * </p>
 * 
 * @version {@value edu.wis.jtlv.env.Env#version}
 * @author yaniv sa'ar.
 * 
 * @see edu.wis.jtlv.env.spec.SpecExp
 */
public enum Operator {
	// UNARY............
	// Prop
	NOT,
	// LTL
	FINALLY, GLOBALLY, HISTORICALLY, NEXT, NOT_PREV_NOT, ONCE, PREV,
	// RTLTL
	B_FINALLY, B_GLOBALLY,
	// CTL
	EX, EF, EG, AX, AF, AG,

	// BINARY............
	// Prop
	AND, OR, XOR, XNOR, IFF, IMPLIES,
	// LTL
	RELEASES, SINCE, TRIGGERED, UNTIL,
	// RTLTL 除去B_UNTIL0
	B_UNTIL,B_RELEASE,
	// CTL, RTCTL
	ABF, ABG, EBF, EBG, AU, EU,
	// EPISTEMIC
	KNOW, NKNOW,SKNOW,

	// TRIPLET............
	// Prop
	// LTL
	// RTCTL
	ABU, EBU;

	// Extra Prop - Binary
	// EQ, NEQ, LT, GT, LE, GE, SETIN, UNION, LSHIFT, RSHIFT, MOD, PLUS, MINUS,
	// TIMES, DIVIDE, CONCATENATION;

	// ////////////////////////////////////////////////////////////////////////
	// Groupings //////////////////////////////////////////////////////////////
	// number of operands...
	public static final Operator[] unaryOp = { NOT, FINALLY, GLOBALLY,
			HISTORICALLY, NEXT, NOT_PREV_NOT, ONCE, PREV, EX, EF, EG, AX, AF,
			AG };
	public static final Operator[] binaryOp = { AND, OR, XOR, XNOR, IFF,
			IMPLIES, RELEASES, SINCE, TRIGGERED, UNTIL, ABF, ABG, EBF, EBG, AU,
			EU, B_FINALLY, B_GLOBALLY, KNOW, NKNOW,SKNOW };
	public static final Operator[] tripletOp = { ABU, EBU, B_UNTIL, B_RELEASE };

	// is it propositional, or TL operator.
	public static final Operator[] propOp = { NOT, AND, OR, XOR, XNOR, IFF,
			IMPLIES };
	public static final Operator[] FutureLTLOp = { FINALLY, GLOBALLY, NEXT,
			RELEASES, UNTIL, B_FINALLY, B_GLOBALLY, B_UNTIL, B_RELEASE};
	public static final Operator[] PastLTLOp = { HISTORICALLY, NOT_PREV_NOT,
			ONCE, PREV, SINCE, TRIGGERED };
	public static final Operator[] CTLOp = { EX, EF, EG, AX, AF, AG, AU, EU };
	public static final Operator[] RealTimeCTLOp = { ABF, ABG, EBF, EBG, ABU,
			EBU };
	public static final Operator[] RealTimeLTLOp = { B_FINALLY, B_GLOBALLY, B_UNTIL, B_RELEASE};
	public static final Operator[] EpistemicOp = { KNOW,NKNOW,SKNOW };
	public static final Operator[] SynEpistemicOp = { SKNOW };

	private boolean in(Operator[] set) {
		for (Operator op : set)
			if (this == op)
				return true;
		return false;
	}

	// ////////////////////////////////////////////////////////////////////////

	/**
	 * <p>
	 * Is this a first order operator.
	 * </p>
	 * 
	 * @return true, if this a first order operator.
	 */
	public boolean isProp() {
		return this.in(propOp);
	}

	/**
	 * <p>
	 * Is this a LTL operator.
	 * </p>
	 * 
	 * @return true, if this a LTL operator.
	 */
	public boolean isLTLOp() {
		return this.in(FutureLTLOp) | this.in(PastLTLOp);
	}

	/**
	 * <p>
	 * Is this a Future LTL operator.
	 * </p>
	 * 
	 * @return true, if this a Future LTL operator.
	 */
	public boolean isFutureLTLOp() {
		return this.in(FutureLTLOp);
	}

	/**
	 * <p>
	 * Is this a Past LTL operator.
	 * </p>
	 * 
	 * @return true, if this a Past LTL operator.
	 */
	public boolean isPastLTLOp() {
		return this.in(PastLTLOp);
	}

	/**
	 * <p>
	 * Is this a CTL operator.
	 * </p>
	 * 
	 * @return true, if this a CTL operator.
	 */
	public boolean isCTLOp() {
		return this.in(CTLOp);
	}

	/**
	 * <p>
	 * Is this a Real Time CTL operator.
	 * </p>
	 * 
	 * @return true, if this a Real Time CTL operator.
	 */
	public boolean isRealTimeCTLOp() {
		return this.in(RealTimeCTLOp);
	}

	/**
	 * <p>
	 * Is this a Real Time LTL operator.
	 * </p>
	 *
	 * @return true, if this a Real Time LTL operator.
	 */
	public boolean isRealTimeLTLOp() {
		return this.in(RealTimeLTLOp);
	}

	/**
	 * <p>
	 * Is this an Epistemic operator.
	 * </p>
	 *
	 * @return true, if this an Epistemic operator.
	 */
	public boolean isEpistemicOp() {
		return this.in(EpistemicOp);
	}

	public boolean isSynEpistemicOp() {
		return this.in(SynEpistemicOp);
	}

	/**
	 * <p>
	 * Is this a Temporal operator.
	 * </p>
	 * 
	 * @return true, if this a Temporal operator.
	 */
	public boolean isTemporalOp() {
		return this.in(FutureLTLOp) | this.in(PastLTLOp) | this.in(CTLOp)
				| this.in(RealTimeCTLOp) | this.in(RealTimeLTLOp);
	}

	/**
	 * <p>
	 * Is this an unary operator.
	 * </p>
	 * 
	 * @return true, if this an unary operator.
	 */
	public boolean isUnary() {
		return this.in(unaryOp);
	}

	/**
	 * <p>
	 * Is this a binary operator.
	 * </p>
	 * 
	 * @return true, if this a binary operator.
	 */
	public boolean isBinary() {
		return this.in(binaryOp);
	}

	/**
	 * <p>
	 * Is this a triplet operator.
	 * </p>
	 * 
	 * @return true, if this a triplet operator.
	 */
	public boolean isTriplet() {
		return this.in(tripletOp);
	}

	/**
	 * <p>
	 * Getter for the number of operands to this operator.
	 * </p>
	 * 
	 * @return The number of operands to this operator.
	 */
	public int numOfOperands() {
		if (this.in(unaryOp))
			return 1;
		if (this.in(binaryOp))
			return 2;
		if (this.in(tripletOp))
			return 3;
		return -1;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Enum#toString()
	 */
	public String toString() {
		return super.toString();
	}

	/**
	 * <p>
	 * Parse an operator from a string.
	 * </p>
	 * 
	 * @param op_str
	 *            The operator string.
	 * @return The operator object.
	 */
	public static Operator operatorFromString(String op_str) {
		for (Operator op : unaryOp)
			if (op.toString() == op_str)
				return op;
		for (Operator op : binaryOp)
			if (op.toString() == op_str)
				return op;
		for (Operator op : tripletOp)
			if (op.toString() == op_str)
				return op;
		return null;
	}
}
