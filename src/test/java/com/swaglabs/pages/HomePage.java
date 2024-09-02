package com.swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	private WebElement menuButton;
	
	@FindBy(id = "inventory_sidebar_link")
	private WebElement AllItem;
	
	@FindBy(id = "about_sidebar_link")
	private WebElement About;
	
	@FindBy (id = "logout_sidebar_link")
	private WebElement LogoutButton;
	
	@FindBy(id = "reset_sidebar_link")
	private WebElement ResetAppState;
	
	@FindBy(id = "react-burger-cross-btn")
	private WebElement menuCloseButton;
	
	@FindBy(xpath ="//select")
	private WebElement filterOption;
	
	@FindBy(xpath = "//div[.='Sauce Labs Backpack']")
	private WebElement item_Backpack;
	
	@FindBy(xpath = "//div[.='Sauce Labs Bike Light']")
	private WebElement item_BikeLight;
	
	@FindBy(xpath = "//div[.='Sauce Labs Bolt T-Shirt']")
	private WebElement item_BoltTShirt;
	
	@FindBy(xpath = "//div[.='Sauce Labs Fleece Jacket']")
	private WebElement item_FleeceJacket;
	
	@FindBy(xpath = "//div[.='Sauce Labs Onesie']")
	private WebElement item_Onesie;
	
	@FindBy(xpath = "//div[.='Test.allTheThings() T-Shirt (Red)']")
	private WebElement item_TShirt_Red;
	
	@FindBy(className = "shopping_cart_link")
	private WebElement cart;
	
	@FindBy(xpath = "//a[.='Twitter']")
	private WebElement socialTwitter;
	
	@FindBy(xpath = "//a[.='Facebook']")
	private WebElement socialFacebook;
	
	@FindBy(xpath = "//a[.='LinkedIn']")
	private WebElement socialLinkedIn;
	
	@FindBy(xpath = "//button[.='Add to cart']")
	private WebElement addtoCartButton;
	
	@FindBy(id="back-to-products")
	private WebElement backtoProductButton;
	
	@FindBy(id="remove")
	private WebElement removeButton;
	
	public  HomePage(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	//Method to Click All Item
	public void clickAllItem()
	{
		AllItem.click();
	}
	
	//Method to Click About 
	public void clickAbout() {
		About.click();
	}
	
	//Method to User Logout 
	public void logout() {
		menuButton.click();
		LogoutButton.click();
	}
	
	//Method to Click Reset App State 
	public void clickResetAppState() {
		ResetAppState.click();
	}
	
    // Method to close the menu
	public void clickmenuCloseButton() {
		menuCloseButton.click();
	}
	
	// Method to click Filter Option
	public void clickFilter() {
		filterOption.click();
	}

    // Method to choose filter option using switch-case
    public void chooseFilterOption(String filterType) {
        Select filterDropdown = new Select(filterOption);
        
        switch (filterType.toLowerCase()) {
            case "name (a to z)":
                filterDropdown.selectByVisibleText("Name (A to Z)");
                break;
            case "name (z to a)":
                filterDropdown.selectByVisibleText("Name (Z to A)");
                break;
            case "price (low to high)":
                filterDropdown.selectByVisibleText("Price (low to high)");
                break;
            case "price (high to low)":
                filterDropdown.selectByVisibleText("Price (high to low)");
                break;
            default:
                System.out.println("Invalid filter option");
        }
    }

    // All product 
    public void clickProduct(String productName) {
        switch (productName.toLowerCase()) {
            case "sauce labs backpack":
                item_Backpack.click();
                break;
            case "sauce labs bike light":
                item_BikeLight.click();
                break;
            case "Sauce Labs Bolt T-Shirt":
            	item_BoltTShirt.click();
            	break;
            case "Sauce Labs Fleece Jacket":
            	item_FleeceJacket.click();
            	break;
            case "Sauce Labs Onesie":
            	item_Onesie.click();
            	break;
            case "Test.allTheThings() T-Shirt (Red)":
            	item_TShirt_Red.click();
            	break;
            	default:
                System.out.println("Invalid product name");
        }
    }
    
    
    //Cart 
    public void clickCart() {
		cart.click();
	}
    
    //Social Link 
    public void clickSocialTwitter() {
    	socialTwitter.click();
	}
    
    public void clickSocialFacebook() {
    	socialFacebook.click();
	}
    
    public void clickSocialLinkedIn() {
    	socialLinkedIn.click();
	}
    
    //Each Product
    public void clickAddToCartButton() {
    	addtoCartButton.click();
	}
    
    public void clickBackToProductButton() {
    	backtoProductButton.click();
	}
    
    public void clickRemoveButton() {
    	removeButton.click();
	}
}
