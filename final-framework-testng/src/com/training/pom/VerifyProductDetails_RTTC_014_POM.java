package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyProductDetails_RTTC_014_POM {
	public VerifyProductDetails_RTTC_014_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-username")
	private WebElement userName; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	//@FindBy(xpath="//input[@class='btn btn-primary' and @type='submit']")
	
	@FindBy(xpath="//*[@id='content']/div/div/div/div/div[2]/form/div[3]/button")
	private WebElement loginBtn; 
	
	@FindBy(id="button-menu")
	private WebElement Catalog;
	
	@FindBy(xpath="//*[@id='menu-catalog']/a/span")
	private WebElement CatalogDropDown;
				
	@FindBy(xpath="//*[@id='menu-catalog']/ul/li[2]/a")
	private WebElement ProductsLink;
							
	@FindBy(xpath="//*[@id='input-name']")
	private WebElement ProductName;
	
	@FindBy(xpath="//*[@id='button-filter']")
    private WebElement FilterBtn;
	
	@FindBy(xpath="//*[@id='input-price']")
	private WebElement Price;
	
	@FindBy(xpath="//*[@id='button-filter']")
	private WebElement FilterBtn1;
		
		public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void clickCatalog() {
		this.Catalog.click(); 
	}
	
	public void clickCatalogDropDown() {
		this.CatalogDropDown.click(); 
	}
	
	public void clickProductsLink() {
	this.ProductsLink.click(); 
	}
	
	public void sendProductName(String ProductName) {
		this.ProductName.clear(); 
		this.ProductName.sendKeys(ProductName); 
	
		}
	
	public void clickFilterBtn() {
		this.FilterBtn.click(); 
		}
	

	public void sendPrice(String Price) {
		this.Price.clear(); 
		this.Price.sendKeys(Price); 
	
		}
	
	public void clickFilterBtn1() {
		this.FilterBtn1.click(); 
		}
}
