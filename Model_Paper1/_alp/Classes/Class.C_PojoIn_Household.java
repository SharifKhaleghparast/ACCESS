/**
 * C_PojoIn__Household
 */	
public class C_PojoIn_Household implements Serializable {

	/* *********FIELDS********* */
	private final OL_AgentType v_AgentType = OL_AgentType.HOUSEHOLD;
	private final String v_name;
	private final OL_EnergyUsageResolution v_EnergyUsageResolution;
	private final int v_NumberOfDailyTimeSteps;
	private final ArrayList<Double> col_InitialConsumptionProfile;
	private final OL_GridUsageType v_GridUsageType;
	private final ArrayList<Double> col_InitialProductionProfile;
	private final A_Logic_ElectricityGrid v_MyGridBus; //TODO The type should be changed.
	private final OL_CommunityMemberType v_CommunityMemberType;
	private final A_Logic_Community v_MyEnergyCommunity;
	
	/* *********CONSTRUCTORS********* */ 
	/**
     * Create an instance of a household
     * @param p_name Name of the household
     * @param p_EnergyUsageResolution An Enum
     * @param p_NumberOfDailyTimeSteps Number of daily time steps
     * @param p_InitialConsumptionProfile A collection of electricity consumption
     * @param p_GridUsageType An Enum
     * @param p_InitialProductionProfile A collection of electricity production
     * @param p_MyGridBus A reference to the connected grid bus
     * @param p_CommunityMemberType An Enum
     * @param p_MyEnergyCommunity A reference to the joined community 
     */
    public C_PojoIn_Household( String p_name
    						   , OL_EnergyUsageResolution p_EnergyUsageResolution
    						   , int p_NumberOfDailyTimeSteps
    						   , ArrayList<Double> p_InitialConsumptionProfile
    						   , OL_GridUsageType p_GridUsageType
    						   , ArrayList<Double> p_InitialProductionProfile
    						   , A_Logic_ElectricityGrid p_MyGridBus //TODO The type should be changed.
    						   , OL_CommunityMemberType p_CommunityMemberType
    						   , A_Logic_Community p_MyEnergyCommunity
    ) {
    	this.v_name = v_AgentType.name() + " " + p_name;
    	this.v_EnergyUsageResolution = p_EnergyUsageResolution;
    	this.v_NumberOfDailyTimeSteps = p_NumberOfDailyTimeSteps;
    	this.col_InitialConsumptionProfile = p_InitialConsumptionProfile;
    	this.v_GridUsageType = p_GridUsageType;
    	this.col_InitialProductionProfile = p_InitialProductionProfile;
    	this.v_MyGridBus = p_MyGridBus;
    	this.v_CommunityMemberType = p_CommunityMemberType;
    	this.v_MyEnergyCommunity = p_MyEnergyCommunity;
    }
    
    /* *********GETTERS********* */
    public String f_Get_Name() {
    	return v_name;
    }
    
    public OL_EnergyUsageResolution f_Get_EnergyUsageResolution() {
    	return v_EnergyUsageResolution;
    }
    
    public int f_Get_NumberOfDailyTimeSteps() {
    	return v_NumberOfDailyTimeSteps;
    }
    
    public ArrayList<Double> f_Get_InitialConsumptionProfile() {
    	return col_InitialConsumptionProfile;
    }

    public OL_GridUsageType f_Get_GridUsageType() {
    	return v_GridUsageType;
    }
    
    public ArrayList<Double> f_Get_InitialProductionProfile() {
    	return col_InitialProductionProfile;
    }

    public A_Logic_ElectricityGrid f_Get_MyGridBus() {
    	return v_MyGridBus;
    }
    
    public OL_CommunityMemberType f_Get_CommunityMemberType() {
    	return v_CommunityMemberType;
    }
    
    public A_Logic_Community f_Get_MyEnergyCommunity() {
    	return v_MyEnergyCommunity;
    }
    
    public OL_AgentType f_Get_AgentType() {
    	return v_AgentType;
    }
    
    /* *********SETTERS********* */
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
