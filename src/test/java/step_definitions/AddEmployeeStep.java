package step_definitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.AddEmployeePage;
import page_object.DashboardPage;
import page_object.EmployeeDetailPage;
import page_object.EmployeeListPage;



public class AddEmployeeStep {
	
private WebDriver driver;
	
	public AddEmployeeStep() {
		super();
		this.driver = Hooks.driver;
	}

	@Given ("User already login with \"(.*)\" as username and \"(.*)\" as password")
	public void loginOrangeHRM(String username, String password) throws Throwable {
		LoginOrangesSteps loginPageStep = new LoginOrangesSteps();
		loginPageStep.user_input_valid_username_and_password(username, password);
		loginPageStep.user_see_dashboard();
	}
	
	@When("User Open Add Employee Page")
	public void openEmployeePage() {
		DashboardPage dashboard = new DashboardPage(driver);
		dashboard.clickPIM();
		
		EmployeeListPage employeeList = new EmployeeListPage(driver);
		employeeList.clickAddEmployee();
		
	}
	@When("User input \"(.*)\" as firstName, \"(.*)\" as middleName and \"(.*)\" as lastName")
	public void inputNameEmployee(String firstname, String middlename, String lastname) {
		
		AddEmployeePage addEmployee = new AddEmployeePage(driver);
		addEmployee.namaDepan(firstname);
		addEmployee.namaTengah(middlename);
		addEmployee.namaBelakang(lastname);

	}
	
	@When("User upload photo \"(.*)\"")
	public void uploadPhoto(String image) {
		
		AddEmployeePage addEmployee = new AddEmployeePage(driver);
		addEmployee.uploadPhoto(image);
		addEmployee.clickSave();
	}
	
	@Then("User \"(.*)\" already created")
	public void created(String name) {
		EmployeeDetailPage detailpage = new EmployeeDetailPage(driver);
		detailpage.employeeName();
		Assert.assertEquals(detailpage.employeeName(), name);
	}

}
