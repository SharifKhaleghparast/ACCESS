void e_InitialEnginePause()
{/*ALCODESTART::1690274864232*/
if(getEngine().pause()) {
	traceln("The engine is paused.");
} else { //sanity check
	error("The engine is not paused at the initialization of the model. The engine state is: " + getEngine().getState());
}

/*ALCODEEND*/}

void e_CyclicPojoOutContainerCreator()
{/*ALCODESTART::1690301529614*/
C_PojoOut__Scenario dataOut = new C_PojoOut__Scenario(scenario);
col_PojoOutScenarios.add(dataOut);

/*ALCODEEND*/}

