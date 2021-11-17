package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class UserManagementPage extends BaseClass {
		
	public UserManagementPage(WebDriver webDriver) {
			super(webDriver);
			PageFactory.initElements(webDriver, this);
		}
		
		@FindBy(id = "mainMenuFirstLevelUnorderedList") 
		WebElement mainMenuFirstLevel;
		
		@FindBy(id = "menu_admin_UserManagement")
		WebElement menuUserManagement;
		
		@FindBy(id = "menu_admin_viewSystemUsers")
		WebElement menuViewSystemUsers;
		
		@FindBy(id = "btnAdd")
		WebElement buttonAdd;
		
		@FindBy(xpath = "//a[.='Username']")
		WebElement Usernamelist;
		
		public void clickUserManagement() {
			menuUserManagement.click();
			menuViewSystemUsers.click();
			buttonAdd.click();
			
		}
		
		public void verifyUsernameShow()
		{
			   WaitUntilElementIsVisible(Usernamelist);
			   Usernamelist.isDisplayed();
		}

		
		
		
}

