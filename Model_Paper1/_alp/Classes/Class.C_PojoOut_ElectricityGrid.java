/**
 * C_PojoOut_ElectricityGrid
 */	
public class C_PojoOut_ElectricityGrid implements Serializable {

	// **********VARIABLES**********
	private final A_Logic_ElectricityGrid v_MyElectricityGrid;
	
	// **********CONSTRUCTORS**********
    /**
     * Create an instance of a electricity grid output
     * @param p_MyElectricityGrid
     */
    public C_PojoOut_ElectricityGrid(A_Logic_ElectricityGrid p_MyElectricityGrid) {
    	this.v_MyElectricityGrid = p_MyElectricityGrid;
    }

	// **********GETTERS**********
    public A_Logic_ElectricityGrid f_GetMyElectricityGrid() {
    	return v_MyElectricityGrid;
    }
    
	/**
	 * This number is here for model snapshot storing purpose<br>
	 * It needs to be changed when this class gets changed
	 */ 
	private static final long serialVersionUID = 1L;

}