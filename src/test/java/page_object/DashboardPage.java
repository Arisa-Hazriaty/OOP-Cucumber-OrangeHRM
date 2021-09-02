package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class DashboardPage extends BaseClass{
	
	public DashboardPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(id = "welcome")
	WebElement welcomeMessage;
	
	@FindBy(xpath = "//a[.='Dashboard']")
	WebElement dashboardPage;
	
	@FindBy(xpath = "//b[.='Admin']")
	WebElement adminMenu;
	
	public String getWelcomeMessage() {
		return welcomeMessage.getText();
		
	}
	
	public boolean getdashboardOrangeHrm() {
		WaitUntilElementIsVisible(dashboardPage);
        dashboardPage.isDisplayed();
        WaitUntilElementIsVisible(adminMenu);
        adminMenu.isDisplayed();
        return true;
		
	}
}
	

	