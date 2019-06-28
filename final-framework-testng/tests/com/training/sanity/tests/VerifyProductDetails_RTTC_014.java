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
import com.training.pom.VerifyProductDetails_RTTC_014_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class VerifyProductDetails_RTTC_014 {
	  @Test
	  public class LoginTests {

			private WebDriver driver;
			private String baseUrl;
			private VerifyProductDetails_RTTC_014_POM VerifyProductDetails_RTTC_014_POM;
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
				VerifyProductDetails_RTTC_014_POM = new VerifyProductDetails_RTTC_014_POM(driver); 
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
				VerifyProductDetails_RTTC_014_POM.sendUserName("admin");
				VerifyProductDetails_RTTC_014_POM.sendPassword("admin@123");
				VerifyProductDetails_RTTC_014_POM.clickLoginBtn(); 
				VerifyProductDetails_RTTC_014_POM.clickCatalog(); 
				VerifyProductDetails_RTTC_014_POM.clickCatalogDropDown(); 
				VerifyProductDetails_RTTC_014_POM.clickProductsLink();
				screenShot.captureScreenShot("First");
				VerifyProductDetails_RTTC_014_POM.sendProductName("Ear Ring");
				VerifyProductDetails_RTTC_014_POM.clickFilterBtn();
				screenShot.captureScreenShot("First1");
				VerifyProductDetails_RTTC_014_POM.sendPrice("0");
				VerifyProductDetails_RTTC_014_POM.clickFilterBtn1();
				screenShot.captureScreenShot("First2");					
						
			}
		
	  }
}