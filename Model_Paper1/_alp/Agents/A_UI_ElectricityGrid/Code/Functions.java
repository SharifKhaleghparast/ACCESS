A_Logic_ElectricityGrid f_GetMyElectricityGrid()
{/*ALCODESTART::1689674136947*/
return link_MyElectricityGrid.getConnectedAgent();
/*ALCODEEND*/}

double f_Navigate(ViewArea arg_ViewArea)
{/*ALCODESTART::1690309762471*/
f_SetSelectedViewArea(arg_ViewArea);
arg_ViewArea.navigateTo();
group_Background.setPos( arg_ViewArea.getX(), arg_ViewArea.getY() );
/*ALCODEEND*/}

double f_SetSelectedViewArea(ViewArea arg_ViewArea)
{/*ALCODESTART::1690309762473*/
v_SelectedViewArea = arg_ViewArea;
/*ALCODEEND*/}

ViewArea f_GetSelectedViewArea()
{/*ALCODESTART::1690309762475*/
return v_SelectedViewArea;
/*ALCODEEND*/}

ViewArea f_GetReferenceViewArea()
{/*ALCODESTART::1690309762477*/
return v_ReferenceViewArea;
/*ALCODEEND*/}

