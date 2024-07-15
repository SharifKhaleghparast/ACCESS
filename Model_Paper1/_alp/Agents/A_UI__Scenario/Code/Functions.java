double f_CreateUI(A_Logic__Scenario arg_MyLogic,ViewArea arg_SelectedViewArea)
{/*ALCODESTART::1689353056488*/
/* Create initial embedded objects */

//Household UI instantiation
arg_MyLogic.pop_Logic_Households.forEach( household -> add_pop_UI_Households( household, arg_SelectedViewArea ) );

//Energy community UI instantitation
arg_MyLogic.pop_Logic_EnergyCommunities.forEach( community -> add_pop_UI_EnergyCommunities(community, arg_SelectedViewArea ) );

//Distribution system operator UI instantiation
arg_MyLogic.pop_Logic_DistributionSystemOperators.forEach( GridOperator -> add_pop_UI_DistributionSystemOperators( GridOperator, arg_SelectedViewArea ) );

//LV distribution feeder UI instantiation
arg_MyLogic.pop_Logic_LVDistributionFeeders.forEach( electricityGrid -> add_pop_UI_LVDistributionFeeders( electricityGrid, arg_SelectedViewArea ) );

/*ALCODEEND*/}

double f_Navigate(ViewArea arg_ViewArea)
{/*ALCODESTART::1689855523658*/
f_SetSelectedViewArea(arg_ViewArea);
arg_ViewArea.navigateTo();
group_Background.setPos( arg_ViewArea.getX(), arg_ViewArea.getY() );
/*ALCODEEND*/}

double f_SetSelectedViewArea(ViewArea arg_ViewArea)
{/*ALCODESTART::1689855996394*/
v_SelectedViewArea = arg_ViewArea;
/*ALCODEEND*/}

ViewArea f_GetSelectedViewArea()
{/*ALCODESTART::1689859102887*/
return v_SelectedViewArea;
/*ALCODEEND*/}

ViewArea f_GetReferenceViewArea()
{/*ALCODESTART::1690036603733*/
return v_ReferenceViewArea;
/*ALCODEEND*/}

A_Logic__Scenario f_GetMyLogic()
{/*ALCODESTART::1692041992772*/
return v_MyLogic;
/*ALCODEEND*/}

