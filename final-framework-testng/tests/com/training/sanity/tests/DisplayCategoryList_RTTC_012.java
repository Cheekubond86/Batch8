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
import com.training.pom.DisplayCategoryList_RTTC_012_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class DisplayCategoryList_RTTC_012 {
  @Test
  public class LoginTests {

		private WebDriver driver;
		private String baseUrl;
		private DisplayCategoryList_RTTC_012_POM DisplayCategoryList_RTTC_012_POM;
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
			DisplayCategoryList_RTTC_012_POM = new DisplayCategoryList_RTTC_012_POM(driver); 
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
		public void validLoginTest() {
			DisplayCategoryList_RTTC_012_POM.sendUserName("admin");
			DisplayCategoryList_RTTC_012_POM.sendPassword("admin@123");
			DisplayCategoryList_RTTC_012_POM.clickLoginBtn(); 
			DisplayCategoryList_RTTC_012_POM.clickCatalog(); 
			DisplayCategoryList_RTTC_012_POM.clickCatalogDropDown(); 
			DisplayCategoryList_RTTC_012_POM.clickCategoriesLink();
			screenShot.captureScreenShot("First");
		}
	
  }
}
