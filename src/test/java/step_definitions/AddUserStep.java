package step_definitions;

import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_object.AddUserPage;
import page_object.DashboardPage;
import page_object.UserManagementPage;

public class AddUserStep {
	

private WebDriver driver;

	private Faker faker = new Faker();
	
	public AddUserStep() {
		super();
		this.driver = Hooks.driver;
	}
	
	@Given("User login \"(.*)\" as username and \"(.*)\" as password")
	public void loginOrange(String username, String password) throws Throwable
	{
		LoginOrangesSteps loginPageStep = new LoginOrangesSteps();
		loginPageStep.user_input_valid_username_and_password(username, password);
		loginPageStep.user_see_dashboard();
	}
			
	@When("User Open Add User Page")
	public void openUserPage() {
		DashboardPage dashboard = new DashboardPage(driver);
		dashboard.hoverAdmin();
		
		UserManagementPage userpage= new UserManagementPage(driver);
		userpage.clickUserManagement();
		
	}
	@When("user set the Role")
	public void setTherRole() {
		
		AddUserPage addEmployee = new AddUserPage(driver);
		addEmployee.clickUserStatus();
		addEmployee.selectUserStatusList();
	
	}
	
	@When("User input \"(.*)\" as EmployeeName, \"(.*)\" Username")
	public void setName(String name, String username) {
		
		if (username.equalsIgnoreCase("valid")) {
			username = faker.name().username();
		}
		
		AddUserPage addUser = new AddUserPage(driver);
		addUser.setEmployeeName(name);
		addUser.setUsername(username);
	}
	
	@When("User set Status ,\"(.*)\" as Password , \"(.*)\" as ConfirmPassword")
	public void setStatusPassword(String Password, String confirmPassword) throws InterruptedException {
		AddUserPage addUserPage = new AddUserPage(driver);
		addUserPage.clickStatus();
		addUserPage.selectStatusUserList();
		addUserPage.setPassword(Password);
		addUserPage.setconfirmPassword(confirmPassword);
		
		Thread.sleep(5000);
		addUserPage.clickSave();
		
		
	}
	@Then("user see Username List Pages")
	public void saveUser() {
		//AddUserPage addUserPage1 = new AddUserPage(driver);
		
		
		UserManagementPage UserManagementPage1 = new UserManagementPage(driver);
		UserManagementPage1.verifyUsernameShow();

	}

}
