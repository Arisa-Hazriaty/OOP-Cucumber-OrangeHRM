package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class DashboardPage extends BaseClass{
	
	public DashboardPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
    private Actions actions = new Actions(webDriver);
	
	@FindBy(id = "welcome")
	WebElement welcomeMessage;
	
	@FindBy(xpath = "//a[.='Dashboard']")
	WebElement dashboardPage;
	
	@FindBy(xpath = "//b[.='Admin']")
	WebElement adminMenu;
	
	@FindBy(xpath = "//b[.='PIM']")
	WebElement pimMenu;
	
	@FindBy(xpath = "//b[.='Leave']")
	WebElement leaveMenu;
	
	@FindBy(xpath = "//b[.='Time']")
	WebElement timeMenu;
	
	@FindBy(xpath = "//b[.='Recruitment']")
	WebElement recruitmentMenu;
	
	@FindBy(xpath = "//b[.='My Info']")
	WebElement infoMenu;
	
	@FindBy(xpath = "//b[.='Performance']")
	WebElement performanceMenu;
	
	@FindBy(xpath = "//b[.='Dashboard']")
	WebElement dashboardMenu;
	
	@FindBy(xpath = "//b[.='Directory']")
	WebElement directoryMenu;
	
	@FindBy(xpath = "//b[.='Maintenance']")
	WebElement maintenanceMenu;
	
	@FindBy(xpath = "//b[.='Buzz']")
	WebElement buzzMenu;
	
	public String getWelcomeMessage() {
		return welcomeMessage.getText();
		
	}
	
	public boolean getdashboardOrangeHrm() {
		WaitUntilElementIsVisible(dashboardPage);
        dashboardPage.isDisplayed();
        WaitUntilElementIsVisible(adminMenu);
        adminMenu.isDisplayed();
        WaitUntilElementIsVisible(pimMenu);
        pimMenu.isDisplayed();
        WaitUntilElementIsVisible(leaveMenu);
        leaveMenu.isDisplayed();
        WaitUntilElementIsVisible(timeMenu);
        timeMenu.isDisplayed();
        WaitUntilElementIsVisible(recruitmentMenu);
        recruitmentMenu.isDisplayed();
        WaitUntilElementIsVisible(infoMenu);
        infoMenu.isDisplayed();
        WaitUntilElementIsVisible(performanceMenu);
        performanceMenu.isDisplayed();
        WaitUntilElementIsVisible(dashboardMenu);
        dashboardMenu.isDisplayed();
        WaitUntilElementIsVisible(directoryMenu);
        directoryMenu.isDisplayed();
        WaitUntilElementIsVisible(maintenanceMenu);
        maintenanceMenu.isDisplayed();
        WaitUntilElementIsVisible(buzzMenu);
        buzzMenu.isDisplayed();
        return true;
		
	}
	
	public void clickPIM()
	
	{
		pimMenu.click();
	}
	

	public void hoverAdmin() {
		actions.moveToElement(adminMenu).perform();
		
	}


}
	

	