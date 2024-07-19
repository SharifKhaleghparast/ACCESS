A_Logic_GridOperator f_GetMyMyGridOperator()
{/*ALCODESTART::1689674102390*/
return link_MyMyGridOperator.getConnectedAgent();
/*ALCODEEND*/}

double f_Navigate(ViewArea arg_ViewArea)
{/*ALCODESTART::1690309710837*/
f_SetSelectedViewArea(arg_ViewArea);
arg_ViewArea.navigateTo();
group_Background.setPos( arg_ViewArea.getX(), arg_ViewArea.getY() );
/*ALCODEEND*/}

double f_SetSelectedViewArea(ViewArea arg_ViewArea)
{/*ALCODESTART::1690309710839*/
v_SelectedViewArea = arg_ViewArea;
/*ALCODEEND*/}

ViewArea f_GetSelectedViewArea()
{/*ALCODESTART::1690309710841*/
return v_SelectedViewArea;
/*ALCODEEND*/}

ViewArea f_GetReferenceViewArea()
{/*ALCODESTART::1690309710843*/
return v_ReferenceViewArea;
/*ALCODEEND*/}

