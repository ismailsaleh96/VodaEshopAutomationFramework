package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeliveryInfoPage extends PageBase
{

	public DeliveryInfoPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "/html/body/app-root/div/app-checkout-page-cc/div/div/div[3]/div/div/div[1]/div[3]/div/div[2]/div[2]/form/div[1]/div[1]/div/div[1]/div/input")
    WebElement StreetNameField;
	
    @FindBy(xpath = "/html/body/app-root/div/app-checkout-page-cc/div/div/div[3]/div/div/div[1]/div[3]/div/div[2]/div[2]/form/div[1]/div[1]/div/div[2]/div/input")
     WebElement BuildingNoField;
    
    @FindBy(xpath = "/html/body/app-root/div/app-checkout-page-cc/div/div/div[3]/div/div/div[1]/div[3]/div/div[2]/div[2]/form/div[1]/div[1]/div/div[3]/div/input")
    WebElement FloorNumberField;

    @FindBy(xpath = "/html/body/app-root/div/app-checkout-page-cc/div/div/div[3]/div/div/div[1]/div[3]/div/div[2]/div[2]/form/div[1]/div[1]/div/div[4]/div/input")
    WebElement AppTxtBox;

    @FindBy(xpath = "/html/body/app-root/div/app-checkout-page-cc/div/div/div[3]/div/div/div[1]/div[3]/div/div[2]/div[2]/form/div[1]/div[1]/div/div[5]/div/input")
    WebElement LandmarkField;

    @FindBy(xpath = "/html/body/app-root/div/app-checkout-page-cc/div/div/div[3]/div/div/div[1]/div[3]/div/div[2]/div[2]/form/div[1]/div[1]/div/div[6]/div/input")
    WebElement AddressNameField;

    @FindBy(xpath = "/html/body/app-root/div/app-checkout-page-cc/div/div/div[3]/div/div/div[1]/div[3]/div/div[2]/div[2]/form/div[1]/div[1]/div/div[6]/div/input")
    WebElement ContinueBtn;



    public void UserInputHisAddressInfo(String StreetName , String BuildingNo , String FloorNumber , String Appar, String Landmark , String AddressName )
    {
        StreetNameField.sendKeys(StreetName);
        BuildingNoField.sendKeys(BuildingNo);
        FloorNumberField.sendKeys(FloorNumber);
        AppTxtBox.sendKeys(Appar);
        LandmarkField.sendKeys(Landmark);
        AddressNameField.sendKeys(AddressName);


    }

    public  void ClickOnContiuneBtn()
    {
        ContinueBtn.click();
    }
   
}
