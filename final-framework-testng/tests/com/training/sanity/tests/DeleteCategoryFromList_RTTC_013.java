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
import com.training.pom.DeleteCategoryFromList_RTTC_013_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class DeleteCategoryFromList_RTTC_013 {
	
		  @Test
		  public class LoginTests {

				private WebDriver driver;
				private String baseUrl;
				private DeleteCategoryFromList_RTTC_013_POM DeleteCategoryFromList_RTTC_013_POM;
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
					DeleteCategoryFromList_RTTC_013_POM = new DeleteCategoryFromList_RTTC_013_POM(driver); 
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
					DeleteCategoryFromList_RTTC_013_POM.sendUserName("admin");
					DeleteCategoryFromList_RTTC_013_POM.sendPassword("admin@123");
					DeleteCategoryFromList_RTTC_013_POM.clickLoginBtn(); 
					DeleteCategoryFromList_RTTC_013_POM.clickCatalog(); 
					DeleteCategoryFromList_RTTC_013_POM.clickCatalogDropDown(); 
					DeleteCategoryFromList_RTTC_013_POM.clickCategoriesLink();
					DeleteCategoryFromList_RTTC_013_POM.clickCategoriesCheckBox();
					DeleteCategoryFromList_RTTC_013_POM.clickDeleteCategory();
					driver.switchTo().alert().accept();
					//Thread.sleep(10000);
					screenShot.captureScreenShot("First");
				}
			
		  }
}