package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class VodafoneShopHomePage extends PageBase
{
	public VodafoneShopHomePage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver; 
		action = new Actions(driver); 
	}
	
	@FindBy(xpath="/html/body/app-root/div/app-home-page/div/app-brand/div/div/div[1]/ul/li[7]/a/div/img")
	WebElement AppleBrand ;

	@FindBy(xpath="/html/body/app-root/div/app-header/div/div/div[1]/ul/li/ul[2]/li/a/span")
	WebElement EnglishLanguage;

	@FindBy(css="body > app-root > div > app-home-page > div > app-brand > div > div > div.backgroundMobile.brandContainer-brands.margin-btm.container > h2")
	public
	WebElement ShopByBrandText;

	@FindBy(xpath="/html/body/app-root/div/app-product-details/div/div[1]/div/div[3]/div/div/div[2]/button")
	WebElement AddToBasketBtn;

	public void ChooseEnglishLanguage()
	{
		clickButton(EnglishLanguage);
	}
	
	public void OpenAppleBrand()
	{
		clickButton (AppleBrand);
	}

	public void ClickOnAddToBasketBtn()
	{
		clickButton(AddToBasketBtn);

	}


	


	

}
