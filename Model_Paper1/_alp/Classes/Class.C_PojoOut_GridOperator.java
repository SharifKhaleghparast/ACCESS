/**
 * C_PojoOut_GridOperator
 */	
public class C_PojoOut_GridOperator implements Serializable {

	// **********VARIABLES**********
	private final A_Logic_GridOperator v_MyGridOperator;
	
	// **********CONSTRUCTORS**********
    /**
     * Create an instance of an electricity grid operator output
     * @param p_MyGridOperator
     */
    public C_PojoOut_GridOperator(A_Logic_GridOperator p_MyGridOperator) {
    	this.v_MyGridOperator = p_MyGridOperator;
    }

	// **********GETTERS**********
    public A_Logic_GridOperator f_GetMyGridOperator() {
    	return v_MyGridOperator;
    }
    
	/**
	 * This number is here for model snapshot storing purpose<br>
	 * It needs to be changed when this class gets changed
	 */ 
	private static final long serialVersionUID = 1L;

}