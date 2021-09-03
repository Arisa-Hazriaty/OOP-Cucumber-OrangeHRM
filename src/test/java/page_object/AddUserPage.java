package page_object;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class AddUserPage extends BaseClass{
	
	public AddUserPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(id = "UserHeading")
	WebElement AddUserPage;
	
	@FindBy(id = "systemUser_userType")
	WebElement dropDownUsertype;

	@FindBy(xpath = "//select[@id='systemUser_userType']//option")
	List<WebElement> dropDownUserTypeList;
	
	@FindBy(id = "systemUser_employeeName_empName")
	WebElement textEmployeeName;
	
	@FindBy(id = "systemUser_userName")
	WebElement textuserName;
	
	@FindBy(id = "systemUser_status")
	WebElement textUserStatus;
	
	@FindBy(xpath = "//select[@id='systemUser_status']//option")
	WebElement textUserStatusList;
	
	
	
	
	

	
}