package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DeleteProductFromList_RTTC_015_POM {
	public DeleteProductFromList_RTTC_015_POM(WebDriver driver) {
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
							
	@FindBy(xpath="//*[@id='form-product']/div/table/tbody/tr[5]/td[1]/input")
	private WebElement SelectProduct;
	
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/button[2]")
	private WebElement DeleteProduct;
	
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
	
	public void clickSelectProduct() {
		this.SelectProduct.click(); 
		}
	
	
	public void clickDeleteProduct() {
		this.DeleteProduct.click(); 
		}
}	