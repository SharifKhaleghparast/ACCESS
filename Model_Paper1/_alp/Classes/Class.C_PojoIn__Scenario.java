/**
 * C_PojoIn__Scenario
 * This class store scenario input data. 
 * It should be instantiated only once.
 */	
public class C_PojoIn__Scenario implements Serializable {

	// **********VARIABLES**********
	private final OL_EnergyUsageResolution v_EnergyUsageResolution;
	private final int v_NumberOfDailyTimeSteps;
	private final double v_ProsumerHouseholdRatio;
	
	// **********EMBEDDED STRUCTURE**********
	private final List<C_PojoIn_Household> col_PojoIn_Households;
	private final List<C_PojoIn_Community> col_PojoIn_EnergyCommunities;
	private final List<C_PojoIn_GridOperator> col_PojoIn_DistributionSystemOperators;
	private final List<C_PojoIn_ElectricityGrid> col_PojoIn_LVDistributionFeeders;
	
	// **********CONSTRUCTORS**********
	/**
     * Create an instance of a scenario input
     * @param p_EnergyUsageResolution Energy usage resolution
     * @param p_NumberOfDailyTimeSteps Number of daily time steps
     * @param p_ProsumerHouseholdRatio Prosumer households to all households ratio
     * @param p_PojoIn_Households A list of C_PojoIn_Household POJOs
     * @param p_PojoIn_EnergyCommunities A list of C_PojoIn_Community POJOs
     * @param p_PojoIn_DistributionSystemOperators A list of C_PojoIn_GridOperator POJOs
     * @param p_PojoIn_LVDistributionFeeders A list of C_PojoIn_ElectricityGrid POJOs
     */
    public C_PojoIn__Scenario ( OL_EnergyUsageResolution p_EnergyUsageResolution
    						    , int p_NumberOfDailyTimeSteps
    							, double p_ProsumerHouseholdRatio
    						    , List<C_PojoIn_Household> p_PojoIn_Households
    						    , List<C_PojoIn_Community> p_PojoIn_EnergyCommunities
    						    , List<C_PojoIn_GridOperator> p_PojoIn_DistributionSystemOperators
    						    , List<C_PojoIn_ElectricityGrid> p_PojoIn_LVDistributionFeeders ) {
    	this.v_EnergyUsageResolution = p_EnergyUsageResolution;
    	this.v_NumberOfDailyTimeSteps = p_NumberOfDailyTimeSteps;
    	this.v_ProsumerHouseholdRatio = p_ProsumerHouseholdRatio;
    	this.col_PojoIn_Households = p_PojoIn_Households;
    	this.col_PojoIn_EnergyCommunities = p_PojoIn_EnergyCommunities;
    	this.col_PojoIn_DistributionSystemOperators = p_PojoIn_DistributionSystemOperators;
    	this.col_PojoIn_LVDistributionFeeders = p_PojoIn_LVDistributionFeeders;
    }
    
    // **********GETTERS**********
    public OL_EnergyUsageResolution f_Get_EnergyUsageResolution() {
    	return v_EnergyUsageResolution;
    }
    
    public int f_Get_NumberOfDailyTimeSteps() {
    	return v_NumberOfDailyTimeSteps;
    }
    
    public double f_Get_ProsumerHouseholdRatio() {
    	return v_ProsumerHouseholdRatio;
    }
    
    public List<C_PojoIn_Household> f_Get_PojoIn_Households() {
    	return col_PojoIn_Households;
    }
    
    public List<C_PojoIn_Community> f_Get_PojoIn_EnergyCommunities() {
    	return col_PojoIn_EnergyCommunities;
    }
    
    public List<C_PojoIn_GridOperator> f_Get_PojoIn_DistributionSystemOperators() {
    	return col_PojoIn_DistributionSystemOperators;
    }
    
    public List<C_PojoIn_ElectricityGrid> f_Get_PojoIn_LVDistributionFeeders() {
    	return col_PojoIn_LVDistributionFeeders;
    }
    
    // **********SETTERS**********
    // All fields are final, thus no setter function exists for this class.
    
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