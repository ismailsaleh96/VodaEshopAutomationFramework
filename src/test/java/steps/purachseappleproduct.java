package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import pages.*;
import org.testng.Assert;
import tests.TestBase;

import java.util.concurrent.TimeUnit;

public class purachseappleproduct extends TestBase {

    VodafoneShopHomePage  VodafoneShopHomePageObject ;
    AppleProductsPage   AppleProductPageObject ;
    UserLocationPage  UserLocationPageObject ;
    DeliveryInfoPage   DeliveryInfoPageObject ;
    ProcessedToCheckOutPage  ProcessedToCheckOutPageObject ;

    PersonalInfoPage  PersonalInfoPageObject ;


    @Given("^User on EShop Home  Page$")
    public void user_on_EShop_Home_Page() {
        Assert.assertTrue(driver.getCurrentUrl().contains("https://eshop.vodafone.com.eg/shop/"));
    }

    @When("^Select English Language$")
    public void Select_English_Language()  {
        VodafoneShopHomePageObject = new VodafoneShopHomePage(driver);
        VodafoneShopHomePageObject.ChooseEnglishLanguage();
    }

    @When("^Click on Apple Products$")
    public void Click_on_Apple_Products()  {
        VodafoneShopHomePageObject = new VodafoneShopHomePage(driver);
        VodafoneShopHomePageObject.OpenAppleBrand();

    }

    @Then("^Choose AirPods 2$")
    public void Choose_AirPods_2()  {
        AppleProductPageObject = new AppleProductsPage(driver);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)", "");
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

        AppleProductPageObject.OpenAirpods2();
       // driver.navigate().to("https://eshop.vodafone.com.eg/shop/productDetails/Airpods-Pro-2nd-Generation");
    }

    @Then("^Click on Add To Basket Button$")
    public void Click_on_Add_To_Basket_Button()  {
        VodafoneShopHomePageObject = new VodafoneShopHomePage(driver);
        VodafoneShopHomePageObject.ClickOnAddToBasketBtn();
    }

    @Then("^Click on Processed To Check Out$")
    public void Click_on_Processed_To_Check_Out()  {
        ProcessedToCheckOutPageObject = new ProcessedToCheckOutPage(driver);
        ProcessedToCheckOutPageObject.ClickOnProceedToCheckOutBtn();
    }

    @Then("^Choose City and Area$")
    public void Choose_City_and_Area()  {
        UserLocationPageObject  = new UserLocationPage(driver);
        UserLocationPageObject.ClickOnCityDropDownList();
        UserLocationPageObject.ClickOnAreaDropDownList();
        UserLocationPageObject.ClickOnDeliverToMyAddressBtn();
    }

    @Then("^Enter Delivery info")
    public void Enter_Delivery_info()  {
        DeliveryInfoPageObject  = new DeliveryInfoPage(driver);
        DeliveryInfoPageObject.UserInputHisAddressInfo("Maadi" , "2" , "1" , "6" , "Supermarket" ,"SmartVillage");
        DeliveryInfoPageObject.ClickOnContiuneBtn();
    }

    @Then("^Enter Personal info")
    public void Enter_Personal_info()  {
        PersonalInfoPageObject  = new PersonalInfoPage(driver);
        PersonalInfoPageObject.PersonalInfo("", " esmailsaleh.cs@gmail.com" , "01151279461" , "0221906123" );
        PersonalInfoPageObject.ClickOnInfoCountineBtn();
        Assert.assertTrue(PersonalInfoPageObject.FullNameAlertMessage.getText().contains("Please enter a valid name"));

    }
}
