package com.mapsynq.StepDef;

import com.mapsynq.Base.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends TestBase
{

	//Tagged Hook 
	@Before("@Sanity")
	public void Setup()
	{
		TestBase.Initialization();
	}
	
	@After("@Sanity")
	public void TearDown()
	{
		TestBase.BrowserClose();
	}
	

}
