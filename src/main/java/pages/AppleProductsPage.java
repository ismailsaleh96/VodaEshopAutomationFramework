package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppleProductsPage extends PageBase
{
	public AppleProductsPage(WebDriver driver) {
		super(driver);
	}



	@FindBy(className="productList-cardImage")
	WebElement AirPodsPro2 ;

	public void OpenAirpods2()
	{
		clickButton(AirPodsPro2);

	}
	


	
}
