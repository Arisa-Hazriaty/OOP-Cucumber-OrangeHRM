package page_object;

import java.util.List;
import java.util.Random;

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
	
	private Random random = new Random();
	
	@FindBy(id = "UserHeading")
    private WebElement AddUserPage;
	
	@FindBy(id = "systemUser_userType")
	private WebElement dropDownUsertype;

	@FindBy(xpath = "//select[@id='systemUser_userType']//option")
	private List<WebElement> dropDownUserTypeList;
	
	@FindBy(id = "systemUser_employeeName_empName")
	private WebElement textEmployeeName;
	
	@FindBy(id = "systemUser_userName")
	private WebElement textuserName;
	
	@FindBy(id = "systemUser_status")
	private WebElement textUserStatus;
	
	@FindBy(xpath = "//select[@id='systemUser_status']//option")
	private List<WebElement> textUserStatusList;
	
	@FindBy(id = "systemUser_password")
	private WebElement textPassword;
	
	@FindBy(id = "systemUser_confirmPassword")
	private WebElement textConfirmPassword;
	
	@FindBy(id = "btnSave")
	private WebElement buttonSave;
	
	@FindBy (id = "btnCancel")
	private WebElement buttonCancel;
	
	public void clickUserStatus(){
        WaitUntilElementIsVisible(dropDownUsertype);
        dropDownUsertype.isDisplayed();
        WaitUntilElementIsClickable(dropDownUsertype);
        dropDownUsertype.isEnabled();
        dropDownUsertype.click();
    }

    public void selectUserStatusList() {

    	WaitUntilListElementIsVisible(dropDownUserTypeList);
        int randomPaymentType = random.nextInt(dropDownUserTypeList.size());
        randomPaymentType = 0;
        switch (randomPaymentType){
            case 0:
            	WaitUntilElementIsVisible(dropDownUserTypeList.get(0));
                WaitUntilElementIsClickable(dropDownUserTypeList.get(0));
                dropDownUserTypeList.get(0).isEnabled();
                dropDownUserTypeList.get(0).click();
                break;
            default:
                WaitUntilElementIsVisible(dropDownUserTypeList.get(randomPaymentType));
                WaitUntilElementIsClickable(dropDownUserTypeList.get(randomPaymentType));
                dropDownUserTypeList.get(randomPaymentType).isEnabled();
                dropDownUserTypeList.get(randomPaymentType).click();
                break;
        }
    }
    
    public void setEmployeeName(String EmployeeName)
    {
    	textEmployeeName.sendKeys(EmployeeName);
    }
    
    public void setUsername(String Username)
    {
    	textuserName.sendKeys(Username);
    }
    public void clickStatus(){
        WaitUntilElementIsVisible(textUserStatus);
        textUserStatus.isDisplayed();
        WaitUntilElementIsClickable(textUserStatus);
        textUserStatus.isEnabled();
        textUserStatus.click();
    }
    
    public void selectStatusUserList() {

    	WaitUntilListElementIsVisible(textUserStatusList);
        int randomPaymentType = random.nextInt(textUserStatusList.size());
        randomPaymentType = 0;
        switch (randomPaymentType){
            case 0:
            	WaitUntilElementIsVisible(textUserStatusList.get(0));
                WaitUntilElementIsClickable(textUserStatusList.get(0));
                textUserStatusList.get(0).isEnabled();
                textUserStatusList.get(0).click();
                break;
            default:
                WaitUntilElementIsVisible(textUserStatusList.get(randomPaymentType));
                WaitUntilElementIsClickable(textUserStatusList.get(randomPaymentType));
                textUserStatusList.get(randomPaymentType).isEnabled();
                textUserStatusList.get(randomPaymentType).click();
                break;
        }
    }
    public void setPassword(String Password)
    {
    	textPassword.sendKeys(Password);
    }
    
    public void setconfirmPassword(String confirmPassword)
    {
    	textConfirmPassword.sendKeys(confirmPassword);
    }
    
    public void clickSave()
    {
    	buttonSave.click();
    }
	
}