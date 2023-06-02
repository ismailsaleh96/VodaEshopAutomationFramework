package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalInfoPage extends PageBase
{

    public PersonalInfoPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "/html/body/app-root/div/app-checkout-page-cc/div/div/div[3]/div/div/div[2]/div[2]/form/div/div/div[1]/div[1]/input")
     WebElement fullNameTxt;
	
    @FindBy(xpath = "/html/body/app-root/div/app-checkout-page-cc/div/div/div[3]/div/div/div[2]/div[2]/form/div/div/div[2]/div[1]/input")
     WebElement emailTxt;
    
    @FindBy(xpath = "/html/body/app-root/div/app-checkout-page-cc/div/div/div[3]/div/div/div[2]/div[2]/form/div/div/div[1]/div[2]/input")
     WebElement MobileNumber;

    @FindBy(xpath = "/html/body/app-root/div/app-checkout-page-cc/div/div/div[3]/div/div/div[2]/div[2]/form/div/div/div[2]/div[2]/input")
     WebElement LandlineNumberTxt;


    @FindBy(tagName = "button")
     WebElement ContinueBtn;
    
    @FindBy(css = "#collapseTwo > form > div > div > div.col-md-6.col-sm-12.checkout-formControl.checkout-formControl1 > div:nth-child(1) > app-alert > div > div > div > div.alert-caption-warning.checkoutAlert > div")
    public
    WebElement FullNameAlertMessage;

    public void PersonalInfo(String fullName , String email , String mobileNumber , String  LandlineNumber )
    {
        fullNameTxt.sendKeys(fullName);
        emailTxt.sendKeys(email);
        MobileNumber.sendKeys(mobileNumber);
        LandlineNumberTxt.sendKeys(LandlineNumber);
    }


    public void ClickOnInfoCountineBtn ()
    {
        ContinueBtn.click();
    }



    public void getAlertFullNameRequiredMessage ()

    {
        FullNameAlertMessage.getText() ;
    }




	
}
