A_Logic_Community f_GetMyCommunity()
{/*ALCODESTART::1689674067219*/
return link_MyCommunity.getConnectedAgent();
/*ALCODEEND*/}

double f_Navigate(ViewArea arg_ViewArea)
{/*ALCODESTART::1690309784970*/
f_SetSelectedViewArea(arg_ViewArea);
arg_ViewArea.navigateTo();
group_Background.setPos( arg_ViewArea.getX(), arg_ViewArea.getY() );
/*ALCODEEND*/}

double f_SetSelectedViewArea(ViewArea arg_ViewArea)
{/*ALCODESTART::1690309784972*/
v_SelectedViewArea = arg_ViewArea;
/*ALCODEEND*/}

ViewArea f_GetSelectedViewArea()
{/*ALCODESTART::1690309784974*/
return v_SelectedViewArea;
/*ALCODEEND*/}

ViewArea f_GetReferenceViewArea()
{/*ALCODESTART::1690309784976*/
return v_ReferenceViewArea;
/*ALCODEEND*/}

