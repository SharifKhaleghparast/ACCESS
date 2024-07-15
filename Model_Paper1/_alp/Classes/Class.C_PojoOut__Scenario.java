/**
 * C_PojoOut__Scenario
 * This class store scenario output data.
 * It should be instantiated regularly.
 */	
public class C_PojoOut__Scenario implements Serializable {

	// **********VARIABLES**********
	private final A_Logic__Scenario v_MyScenario;
	
	// **********EMBEDDED STRUCTURE**********
	
	private List<C_PojoOut_Household> col_PojoOut_Households;
	private List<C_PojoOut_Community> col_PojoOut_EnergyCommunities;
	private List<C_PojoOut_GridOperator> col_PojoOut_DistributionSystemOperators;
	private List<C_PojoOut_ElectricityGrid> col_PojoOut_LVDistributionFeeders;
		
	// **********CONSTRUCTORS**********
    /**
     * Create an instance of a scenario output
     * @param p_MyScenario
     */    
    public C_PojoOut__Scenario (A_Logic__Scenario p_MyScenario) {
    	this.v_MyScenario = p_MyScenario;
    	f_CreatePojoOut__Container(this.v_MyScenario);
    }
	
	// **********GETTERS**********
	public A_Logic__Scenario f_GetMyScenario() {
		return v_MyScenario;
	}
    
    public List<C_PojoOut_Household> f_Get_PojoOut_Households() {
	    return col_PojoOut_Households;
	}
	    
	public List<C_PojoOut_Community> f_Get_PojoOut_EnergyCommunities() {
	    return col_PojoOut_EnergyCommunities;
	}
	    
	public List<C_PojoOut_GridOperator> f_Get_PojoOut_DistributionSystemOperators() {
	    return col_PojoOut_DistributionSystemOperators;
	}
	    
	public List<C_PojoOut_ElectricityGrid> f_Get_PojoOut_LVDistributionFeeders() {
	    return col_PojoOut_LVDistributionFeeders;
	}
	
	// **********OTHER METHODS**********
	private void f_CreatePojoOut__Container(A_Logic__Scenario arg_MyScenario) {
		
		// Create initial embedded objects
		
		arg_MyScenario.pop_Logic_Households.forEach(currHousehold -> col_PojoOut_Households.add(new C_PojoOut_Household(currHousehold)));
		arg_MyScenario.pop_Logic_EnergyCommunities.forEach(currCommunity -> col_PojoOut_EnergyCommunities.add(new C_PojoOut_Community(currCommunity)));
		arg_MyScenario.pop_Logic_DistributionSystemOperators.forEach(currGridOperator -> col_PojoOut_DistributionSystemOperators.add(new C_PojoOut_GridOperator(currGridOperator)));
		arg_MyScenario.pop_Logic_LVDistributionFeeders.forEach(currElectricityGrid -> col_PojoOut_LVDistributionFeeders.add(new C_PojoOut_ElectricityGrid(currElectricityGrid)));
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