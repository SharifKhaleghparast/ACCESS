double f_SetSelectedViewArea(ViewArea arg_ViewArea)
{/*ALCODESTART::1690035690544*/
v_SelectedViewArea = arg_ViewArea;
/*ALCODEEND*/}

ViewArea f_GetSelectedViewArea()
{/*ALCODESTART::1690035690546*/
return v_SelectedViewArea;
/*ALCODEEND*/}

double f_Navigate(ViewArea arg_ViewArea)
{/*ALCODESTART::1690278618575*/
f_SetSelectedViewArea(arg_ViewArea);
arg_ViewArea.navigateTo();
group_Background.setPos( arg_ViewArea.getX(), arg_ViewArea.getY() );
/*ALCODEEND*/}

List<C_PojoIn_Household> f_LoadHouseholdsData()
{/*ALCODESTART::1690399731031*/
/* Create the PojoIn list */
List<C_PojoIn_Household> pojoInList = new ArrayList<>();

/* Populate the PojoIn list */
for( int i = 0 ; i < p_HouseholdPopulation; i++ ) {
	
	pojoInList.add(new C_PojoIn_Household( String.valueOf( i )
										   , p_EnergyUsageResolution
										   , p_NumberOfDailyTimeSteps
										   , p_HouseholdsConsumptionProfiles.get( i )
										   , p_HouseholdsGridUsageTypes.get( i )
										   , p_HouseholdsProductionProfiles.get( i )
										   , null //TODO p_MyGridBus 
										   , null //TODO p_CommunityMemberType
										   , null //TODO p_MyEnergyCommunity
										 )
	);
}

return pojoInList;
/*ALCODEEND*/}

List<C_PojoIn_Community> f_LoadEnergyCommunitiesData()
{/*ALCODESTART::1690571266635*/
/* Create the PojoIn list */
List<C_PojoIn_Community> pojoInList = new ArrayList<>();

/* TODO Populate the PojoIn list */
//for( int i = 0 ; i < ? ; i++ ) {
//	pojoInList.add(new C_PojoIn_Community());
//}

return pojoInList;
/*ALCODEEND*/}

List<C_PojoIn_ElectricityGrid> f_LoadLVDistributionFeedersData()
{/*ALCODESTART::1690571574772*/
/* Create the PojoIn list */
List<C_PojoIn_ElectricityGrid> pojoInList = new ArrayList<>();

/* TODO Populate the PojoIn list */
//for( int i = 0 ; i < ? ; i++ ) {
//	pojoInList.add(new C_PojoIn_ElectricityGrid());
//}

return pojoInList;
/*ALCODEEND*/}

List<C_PojoIn_GridOperator> f_LoadDistributionSystemOperatorsData()
{/*ALCODESTART::1690571675702*/
/* Create the PojoIn list */
List<C_PojoIn_GridOperator> pojoInList = new ArrayList<>();

/* TODO Populate the PojoIn list */
//for( int i = 0 ; i < ? ; i++ ) {
//	pojoInList.add(new C_PojoIn_GridOperator());
//}

return pojoInList;
/*ALCODEEND*/}

double f_CreateScenario(ViewArea arg_SelectedViewArea,List<C_PojoIn_Household> arg_PojoIn_Households,List<C_PojoIn_Community> arg_PojoIn_EnergyCommunities,List<C_PojoIn_GridOperator> arg_PojoIn_DistributionSystemOperators,List<C_PojoIn_ElectricityGrid> arg_PojoIn_LVDistributionFeeders)
{/*ALCODESTART::1691926574974*/
/* Create initial embedded objects */

/* FIRST: PojoInScenario setup */
C_PojoIn__Scenario dataIn = new C_PojoIn__Scenario( p_EnergyUsageResolution
													, p_NumberOfDailyTimeSteps
													, p_ProsumerHouseholdRatio
													, arg_PojoIn_Households
													, arg_PojoIn_EnergyCommunities
													, arg_PojoIn_DistributionSystemOperators
													, arg_PojoIn_LVDistributionFeeders
);

//Sanity check
if(col_PojoInScenarios.size() != 0) {
	error(col_PojoInScenarios.size() + " scenario PojoIns are created");
} else {
	col_PojoInScenarios.add(dataIn);
} 
	
/* SECOND: LogicScenario setup */
A_Logic__Scenario logic = new A_Logic__Scenario();

//Sanity check
if(pop_LogicScenarios.size() != 0) {
	error( pop_LogicScenarios.size() + " scenario logics are created before scenario creation." );
} else {
	logic = add_pop_LogicScenarios( dataIn );
} 

/* THIRD: UIScenario setup */
A_UI__Scenario UI = new A_UI__Scenario();

//Sanity check
if(pop_UIScenarios.size() != 0) {
	error(pop_UIScenarios.size() + " scenario UIs are created before scenario creation.");
} else {
	UI = add_pop_UIScenarios( logic, arg_SelectedViewArea );
}


/* TODO FOURTH: PojoOutScenario setup */
/* C_PojoOut__Scenario dataOut = new C_PojoOut__Scenario( logic );

//Sanity check
if(col_PojoOutScenarios.size() != 0) {
	error( col_PojoOutScenarios.size() + " scenario PojoOuts are created before scenario creation" );
} else {
	col_PojoOutScenarios.add( dataOut );
} 
*/
/*ALCODEEND*/}

