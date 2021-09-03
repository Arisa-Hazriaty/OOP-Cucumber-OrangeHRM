package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class UserManagementPage {
	public class DashboardPage extends BaseClass{
		
		public DashboardPage(WebDriver webDriver) {
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
		
		public void clickLogin() {
			mainMenuFirstLevel.click();
			menuUserManagement.click();
			menuViewSystemUsers.click();
			buttonAdd.click();
			
		}
		

		
		
		
}
}
