package tests;

import com.opencsv.CSVReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.io.FileReader;
import java.io.IOException;

public class TestPersonalInfoUsingDDTbyCSVReader extends  TestBase {

    VodafoneShopHomePage  VodafoneShopHomePageObject ;
    AppleProductsPage   AppleProductPageObject ;
    UserLocationPage  UserLocationPageObject ;
    DeliveryInfoPage   DeliveryInfoPageObject ;
    ProcessedToCheckOutPage  ProcessedToCheckOutPageObject ;

    PersonalInfoPage  PersonalInfoPageObject ;



    CSVReader reader ;



    @Test(priority=1,alwaysRun=true)
    public void UserInputDelieveryInfoSuccssfully() throws IOException {

        // get path of CSV file
        String CSV_file = System.getProperty("user.dir") + "/src/test/java/data/PersonalInfo.csv";
        reader = new CSVReader(new FileReader(CSV_file));

        String[] csvCell;


        VodafoneShopHomePageObject = new VodafoneShopHomePage(driver);
        VodafoneShopHomePageObject.ChooseEnglishLanguage();
        VodafoneShopHomePageObject.OpenAppleBrand();

        AppleProductPageObject = new AppleProductsPage(driver);
        AppleProductPageObject.OpenAirpods2();

        ProcessedToCheckOutPageObject = new ProcessedToCheckOutPage(driver);
        ProcessedToCheckOutPageObject.ClickOnProceedToCheckOutBtn();

        UserLocationPageObject = new UserLocationPage(driver);

        UserLocationPageObject.ClickOnCityDropDownList();
        UserLocationPageObject.ClickOnAreaDropDownList();
        UserLocationPageObject.ClickOnDeliverToMyAddressBtn();



        String StreetName  = "Tharir" ;
        String BuildingInfo  = "2" ;
        String FloorNumber  = "1" ;
        String Appar  = "2" ;
        String Landmark  = "Supermarket" ;
        String AddressName  = "122" ;


        DeliveryInfoPageObject = new DeliveryInfoPage(driver);
            DeliveryInfoPageObject.UserInputHisAddressInfo(StreetName, BuildingInfo ,FloorNumber , Appar, Landmark, AddressName);


            // while loop will be executed till the last value in CSV file .
            while ((csvCell = reader.readNext()) != null) {
                String firstNameVar = csvCell[0];
                String emailVar = csvCell[1];
                String MobileNumberVar = csvCell[2];
                String LandlneNumberVar = csvCell[4];

                PersonalInfoPageObject = new PersonalInfoPage(driver);
                PersonalInfoPageObject.PersonalInfo(firstNameVar, emailVar, MobileNumberVar, LandlneNumberVar);
                PersonalInfoPageObject.ClickOnInfoCountineBtn();
                Assert.assertTrue(PersonalInfoPageObject.FullNameAlertMessage.getText().contains("Please enter a valid name"));

            }

        }


    }




