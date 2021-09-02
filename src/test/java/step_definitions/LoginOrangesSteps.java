package step_definitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.DashboardPage;
import page_object.LoginPage;


public class LoginOrangesSteps {
	
	private WebDriver driver;
	
	public LoginOrangesSteps() {
		super();
		this.driver = Hooks.driver;
	}
	
	//Negative Case
	@Given("^user open the web page$")
	public void user_open_the_web_page() throws Throwable
	{
		LoginPage loginPage = new LoginPage(driver);
		assertTrue(loginPage.isDisplayed());

	}
	
	@When("^user input invalid username and password$")
	public void user_input_invalid_username_and_password()throws Throwable
	{ 
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUsername("errorlogin");
		loginPage.setPassword("errorlogin");
		loginPage.clickLogin();
		
	}
	
	@Then("^user see error message$")
	public void user_see_error_message() throws Throwable 
	{
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertEquals("Invalid credentials", loginPage.getErrorMessage());
	}
	
	//PositiveCase
	
	@When("user input \"(.*)\" as username and \"(.*)\" as password")
	public void user_input_valid_username_and_password(String username, String password)throws Throwable
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLogin();
	}
	
	@Then("^user see dashboard page$")
	public void user_see_dashboard() throws Throwable 
	{
		DashboardPage dashboardPage = new DashboardPage(driver);
		Assert.assertTrue(dashboardPage.getWelcomeMessage().contains("Welcome"));
		Assert.assertTrue(dashboardPage.getdashboardOrangeHrm());
		
	}
}
