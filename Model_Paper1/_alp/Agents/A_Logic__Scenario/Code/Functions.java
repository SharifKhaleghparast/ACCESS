double f_CreateLogic(C_PojoIn__Scenario arg_MyPojoInScenario)
{/*ALCODESTART::1689346698198*/
/* Create initial embedded objects */

//Household instantiation
arg_MyPojoInScenario.f_Get_PojoIn_Households().forEach( currHouseholdData -> add_pop_Logic_Households( currHouseholdData ) );

//Energy community instantitation
arg_MyPojoInScenario.f_Get_PojoIn_EnergyCommunities().forEach(currCommunityData -> add_pop_Logic_EnergyCommunities(currCommunityData));

//Distribution system operator instantiation
arg_MyPojoInScenario.f_Get_PojoIn_DistributionSystemOperators().forEach( currGridOperatorData -> add_pop_Logic_DistributionSystemOperators( currGridOperatorData ) );

//LV distribution feeder instantiation
arg_MyPojoInScenario.f_Get_PojoIn_LVDistributionFeeders().forEach( currElectricityGridData -> add_pop_Logic_LVDistributionFeeders( currElectricityGridData ) );

/*ALCODEEND*/}

C_PojoIn__Scenario f_GetMyPojoIn()
{/*ALCODESTART::1689673620224*/
return v_MyPojoInScenario;
/*ALCODEEND*/}

OL_EnergyUsageResolution f_GetEnergyUsageResolution()
{/*ALCODESTART::1691764823038*/
return v_EnergyUsageResolution;
/*ALCODEEND*/}

double f_GetProsumerHouseholdRatio()
{/*ALCODESTART::1691765001605*/
return v_ProsumerHouseholdRatio;
/*ALCODEEND*/}

ArrayList<Double> f_GetInitialConsumptionProfile()
{/*ALCODESTART::1692040519422*/
return col_InitialConsumptionProfile;
/*ALCODEEND*/}

ArrayList<Double> f_GetInitialProductionProfile()
{/*ALCODESTART::1692040611886*/
return col_InitialProductionProfile;
/*ALCODEEND*/}

double f_SetInitialConsumptionProfile(AgentArrayList<A_Logic_Household> arg_Logic_Households,int arg_NumberOfDailyTimeSteps)
{/*ALCODESTART::1692105951609*/
for( int i = 0; i < arg_NumberOfDailyTimeSteps ; i++ ) {
	
	double aggregateConsumption = 0;
	
	for( A_Logic_Household p : arg_Logic_Households ) {
		aggregateConsumption += p.f_GetInitialConsumptionProfile().get( i );
	}
	col_InitialConsumptionProfile.add( aggregateConsumption );
}
/*ALCODEEND*/}

int f_GetNumberOfDailyTimeSteps()
{/*ALCODESTART::1692108097072*/
return v_NumberOfDailyTimeSteps;
/*ALCODEEND*/}

double f_SetInitialProductionProfile(AgentArrayList<A_Logic_Household> arg_Logic_Households,int arg_NumberOfDailyTimeSteps)
{/*ALCODESTART::1692115984379*/
for( int i = 0; i < arg_NumberOfDailyTimeSteps ; i++ ) {
	
	double aggregateProduction = 0;
	
	for( A_Logic_Household p : arg_Logic_Households ) {
		aggregateProduction += p.f_GetInitialProductionProfile().get( i );
	}
	col_InitialProductionProfile.add( aggregateProduction );
}
/*ALCODEEND*/}

