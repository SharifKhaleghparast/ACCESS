double f_Navigate(ViewArea arg_ViewArea)
{/*ALCODESTART::1690309587154*/
f_SetSelectedViewArea(arg_ViewArea);
arg_ViewArea.navigateTo();
group_Background.setPos( arg_ViewArea.getX(), arg_ViewArea.getY() );
/*ALCODEEND*/}

double f_SetSelectedViewArea(ViewArea arg_ViewArea)
{/*ALCODESTART::1690309587156*/
v_SelectedViewArea = arg_ViewArea;
/*ALCODEEND*/}

ViewArea f_GetSelectedViewArea()
{/*ALCODESTART::1690309587158*/
return v_SelectedViewArea;
/*ALCODEEND*/}

ViewArea f_GetReferenceViewArea()
{/*ALCODESTART::1690309587160*/
return v_ReferenceViewArea;
/*ALCODEEND*/}

A_Logic_Household f_GetMyLogic()
{/*ALCODESTART::1692027544408*/
return v_MyLogic;
/*ALCODEEND*/}

