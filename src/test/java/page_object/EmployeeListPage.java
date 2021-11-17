package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class EmployeeListPage extends BaseClass {
	

	
public EmployeeListPage(WebDriver webDriver) {
	super(webDriver);
	PageFactory.initElements(webDriver, this);
}
	
	@FindBy(id = "menu_pim_viewEmployeeList")
	private WebElement employeeList;
	
	@FindBy(id = "menu_pim_addEmployee")
	private WebElement addEmployee;
	
	@FindBy (id = "searchSystemUser_userName")
	private WebElement searchUsername;
	
	@FindBy (id= "searchBtn")
	private WebElement ButtonsearchUsername;
	
	@FindBy (xpath = "//tr[@class='odd']/td")
	private WebElement newUsername;
	
	public void clickEmployeeList() {
		employeeList.click();
	}
	
	public void clickAddEmployee() {
		addEmployee.click();
	}
	
	public void SearchUsername(String Username)
	{
		searchUsername.sendKeys(Username);
	}
	public void getUsernameisDisplayed()
	{
		ButtonsearchUsername.click();
	}
	
	public String getUsername() {
		return newUsername.getText();
		
	}

}
