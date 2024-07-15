/**
 * C_PojoOut_Community
 */	
public class C_PojoOut_Community implements Serializable {

	// **********VARIABLES**********
	private final A_Logic_Community v_MyCommunity;

	// **********CONSTRUCTORS**********
    /**
     * Create an instance of a community output
     * @param p_MyCommunity
     */
    public C_PojoOut_Community(A_Logic_Community p_MyCommunity) {
    	this.v_MyCommunity = p_MyCommunity;
    }

	// **********GETTERS**********
    public A_Logic_Community f_GetMyCommunity() {
    	return v_MyCommunity;
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