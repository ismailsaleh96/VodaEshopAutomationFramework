package tests;

import org.openqa.selenium.JavascriptExecutor;
import  org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import pages.ProcessedToCheckOutPage;
import pages.UserLocationPage;
import pages.VodafoneShopHomePage;
import pages.AppleProductsPage ;
import org.openqa.selenium.support.ui.Select;


public class SelectBrandTest extends TestBase
{
    VodafoneShopHomePage VodafoneShopHomePageObject ;
    AppleProductsPage  AppleProductsPageObject ;
    ProcessedToCheckOutPage ProcessedToCheckOutPageObject ;
    UserLocationPage   UserLocationPageObject ;

    @Test(priority=1,alwaysRun=true)
    public void UserChooseLanguageSuccssfully()
    {
        VodafoneShopHomePageObject = new VodafoneShopHomePage(driver);
        VodafoneShopHomePageObject.ChooseEnglishLanguage();
    }


    @Test(priority=2 , dependsOnMethods= {"UserChooseLanguageSuccssfully"})
    public void UserChooseAppleProduct()
    {
        VodafoneShopHomePageObject = new VodafoneShopHomePage(driver);
        VodafoneShopHomePageObject.OpenAppleBrand();

        AppleProductsPageObject= new AppleProductsPage(driver);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)", "");
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

       // AppleProductsPageObject.OpenAirpods2();
        driver.navigate().to("https://eshop.vodafone.com.eg/shop/productDetails/Airpods-Pro-2nd-Generation");

        VodafoneShopHomePageObject.ClickOnAddToBasketBtn();
    }

    @Test(priority=3 )
    public void UserClickOnProcessedToCheckOut()
    {
        ProcessedToCheckOutPageObject = new  ProcessedToCheckOutPage(driver);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        ProcessedToCheckOutPageObject.ClickOnProceedToCheckOutBtn();
    }

    @Test(priority=4)
    public void UserChooseHisLocation()
    {

        UserLocationPageObject = new UserLocationPage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");



        Select city = new Select(driver.findElement(By.xpath("/html/body/app-root/div/app-checkout-page-cc/div/div/div[3]/div/div/div/div[2]/div[1]/select")));
        city.selectByValue("1");

        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

        Select Area = new Select(driver.findElement(By.cssSelector("#headingOne > div:nth-child(3) > select")));
        Area.selectByValue("4");


         UserLocationPageObject.ClickOnDeliverToMyAddressBtn();
    }



}
