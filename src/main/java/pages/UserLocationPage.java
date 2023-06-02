package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLocationPage extends PageBase
{
	public UserLocationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "/html/body/app-root/div/app-checkout-page-cc/div/div/div[3]/div/div/div/div[2]/div[1]/select")
	 WebElement CityDropDownList;

	@FindBy(xpath = "#headingOne > div:nth-child(3) > select")
	WebElement AreaDropDownList;


	@FindBy(css = "#collapseOne > div > div.checkout-DelivaryOptions.fontReg > div.row.DelivaryOptionsMirgen.justify-content-center > div:nth-child(1) > div.checkout-DelivaryOptionsInfo.checkout-DelivaryToAddress > div")
	WebElement DeliverToMyAddressBtn;

	@FindBy(css = "#collapseOne > div > div.checkout-DelivaryOptions.fontReg > div.row.DelivaryOptionsMirgen.justify-content-center > div:nth-child(2) > div > div")
	WebElement PickFromStoreBtn ;


	public void ClickOnCityDropDownList()
	{
		clickButton(CityDropDownList);
	}

	public void ClickOnAreaDropDownList()
	{
		clickButton(AreaDropDownList);

	}


	public void ClickOnDeliverToMyAddressBtn()
	{
		clickButton(DeliverToMyAddressBtn);

	}


	public void ClickOnPickFromStoreBtn()
	{
		clickButton(PickFromStoreBtn);
	}



}
