package com.mapsynq.StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.mapsynq.Base.TestBase;
import com.mapsynq.Pages.HomePage;
import com.mapsynq.Pages.SignInPage;
import com.mapsynq.Utilities.TestUtil;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInStepDef extends TestBase
{

	
	HomePage hp=new HomePage();
	SignInPage sp=new SignInPage();
	
	@Given("^User is already in the Sign In Page$")
	public void user_is_already_in_the_Sign_In_Page() throws Throwable {
		
		hp.SignInLnk.click();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PageLoadTime, TimeUnit.SECONDS);
	   	driver.manage().timeouts().implicitlyWait(TestUtil.ImplicitTime, TimeUnit.SECONDS);
	  
	  
	}

	@When("^User enter the wrong \"([^\"]*)\" And User enter the wrong \"([^\"]*)\"$")
	public void user_enter_the_wrong_And_User_enter_the_wrong(String UName, String Password) throws Throwable
	{
		sp.UserName.sendKeys(UName);
		sp.Password.sendKeys(Password);
	   
	}

	@Then("^Error message will appear$")
	public void error_message_will_appear() throws Throwable
	{
		sp.SignInBtn.click();
		Assert.assertEquals(driver.findElement(By.xpath("//p[contains(text(),'Invalid')]")).getText(),"Invalid user/password combination");
	}

	

}
