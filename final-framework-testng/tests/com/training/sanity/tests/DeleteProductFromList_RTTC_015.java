package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.DeleteProductFromList_RTTC_015_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class DeleteProductFromList_RTTC_015 {
	 @Test
	  public class LoginTests {

			private WebDriver driver;
			private String baseUrl;
			private DeleteProductFromList_RTTC_015_POM DeleteProductFromList_RTTC_015_POM;
			private Properties properties;
			private ScreenShot screenShot;

			@BeforeClass
			public void setUpBeforeClass() throws IOException {
				properties = new Properties();
				FileInputStream inStream = new FileInputStream("./resources/others.properties");
				properties.load(inStream);
			}

			@BeforeMethod
			public void setUp() throws Exception {
				driver = DriverFactory.getDriver(DriverNames.CHROME);
				DeleteProductFromList_RTTC_015_POM = new DeleteProductFromList_RTTC_015_POM(driver); 
				baseUrl = properties.getProperty("baseURL");
				screenShot = new ScreenShot(driver); 
				// open the browser 
				driver.get(baseUrl);
			}
			
			@AfterMethod
			public void tearDown() throws Exception {
				Thread.sleep(1000);
				driver.quit();
			}
			@Test
			public void validLoginTest()  {
				DeleteProductFromList_RTTC_015_POM.sendUserName("admin");
				DeleteProductFromList_RTTC_015_POM.sendPassword("admin@123");
				DeleteProductFromList_RTTC_015_POM.clickLoginBtn(); 
				DeleteProductFromList_RTTC_015_POM.clickCatalog(); 
				DeleteProductFromList_RTTC_015_POM.clickCatalogDropDown(); 
				DeleteProductFromList_RTTC_015_POM.clickProductsLink();
				screenShot.captureScreenShot("First");
				DeleteProductFromList_RTTC_015_POM.clickSelectProduct();
				DeleteProductFromList_RTTC_015_POM.clickDeleteProduct();
				driver.switchTo().alert().accept();
				screenShot.captureScreenShot("First1");
				screenShot.captureScreenShot("First2");					
						
			}
		
	  }
}