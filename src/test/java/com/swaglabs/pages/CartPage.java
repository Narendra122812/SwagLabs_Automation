package com.swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	@FindBy(id = "continue-shopping")
	private WebElement continueShoppingButton;
	
	@FindBy(id = "checkout")
	private WebElement checkoutButton;
	
	@FindBy(xpath = "//button[.='Remove']")
	private WebElement removeButton;
	
	public CartPage (WebDriver d) {
		PageFactory.initElements(d, this);
	}
	
	public void clickContinueShoppingButton() {
		continueShoppingButton.click();
	}
	
	public void clickCheckoutButton() {
		checkoutButton.click();
	}
	
	public void clickRemoveButton() {
		removeButton.click();
	}

}
