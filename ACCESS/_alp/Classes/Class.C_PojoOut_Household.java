/**
 * C_PojoOut_Household
 */	
public class C_PojoOut_Household implements Serializable {
	
	// **********VARIABLES**********
	private final A_Logic_Household v_MyHousehold;
	
	// **********CONSTRUCTORS**********
    /**
     * Create an instance of a household output
     * @param p_MyLogic
     */
    public C_PojoOut_Household(A_Logic_Household p_MyLogic) {
    	this.v_MyHousehold = p_MyLogic;
    }

	// **********GETTERS**********
    public A_Logic_Household f_GetMyHousehold() {
    	return v_MyHousehold;
    }
    
	@Override
	public String toString() {
		return super.toString();
	}

	/**
	 * This number is here for model snapshot storing purpose<br>
	 * It needs to be changed when this class gets changed
	 */ 
	private static final long serialVersionUID = 1L;

}