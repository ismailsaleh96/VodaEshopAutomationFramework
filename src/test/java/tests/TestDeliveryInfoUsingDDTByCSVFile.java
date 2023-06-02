package tests;

import com.opencsv.CSVReader;
import org.testng.annotations.Test;
import pages.*;

import java.io.FileReader;
import java.io.IOException;

public class TestDeliveryInfoUsingDDTByCSVFile extends  TestBase {

    VodafoneShopHomePage  VodafoneShopHomePageObject ;
    AppleProductsPage   AppleProductPageObject ;
    UserLocationPage  UserLocationPageObject ;
    DeliveryInfoPage   DeliveryInfoPageObject ;
    ProcessedToCheckOutPage  ProcessedToCheckOutPageObject ;

    CSVReader reader ;



    @Test(priority=1,alwaysRun=true)
    public void UserInputDelieveryInfoSuccssfully() throws IOException
    {

        // get path of CSV file
        String CSV_file = System.getProperty("user.dir")+"/src/test/java/data/DeliveryInfo.csv";
        reader = new CSVReader(new FileReader(CSV_file));

        String[] csvCell ;




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

        // while loop will be executed till the last value in CSV file .
        while((csvCell = reader.readNext()) != null) {
            String StreetName = csvCell[0];
            String BuildingNo = csvCell[1];
            String FloorNumber = csvCell[2];
            String Appar = csvCell[4];
            String Landmark = csvCell[5];
            String AddressName = csvCell[6];
            DeliveryInfoPageObject = new DeliveryInfoPage(driver);
            DeliveryInfoPageObject.UserInputHisAddressInfo(StreetName, BuildingNo, FloorNumber, Appar , Landmark , AddressName );
            DeliveryInfoPageObject.ClickOnContiuneBtn();

        }

    }







}
