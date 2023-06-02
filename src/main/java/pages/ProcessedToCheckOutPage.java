package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProcessedToCheckOutPage extends PageBase
{
	public ProcessedToCheckOutPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="body > app-root > div > app-shoping-cart > div > div.shopingCartContainer > div.shopingCartItemCont > div.shopingCartContainer-promoCode > div.shopingCartContainer-promoCode > div > div.cart_checkout.fontLightEnAr > button")
	WebElement ProcessedToCheckOutBtn ;

	public void ClickOnProceedToCheckOutBtn()
	{
		clickButton(ProcessedToCheckOutBtn);
	}

}
