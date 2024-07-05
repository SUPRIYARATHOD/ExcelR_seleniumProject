package loginPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage3_wishlist {
WebDriver driver;

	public  HomePage3_wishlist(WebDriver idriver) {
		driver=idriver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath="//ul[@id='ui-id-2']/li[4]/a") WebElement Gear;
	@FindBy (xpath="//ul[@id='ui-id-2']/li[4]/ul/li[1]/a") WebElement Bags;
	@FindBy (id="mode-list") WebElement ListMode;
	@FindBy (xpath="//div[@class='modes']/a") WebElement ListMode2;
	@FindBy (xpath="//*[@id='maincontent']/div[3]/div[1]/div[4]/div[2]/ul/li[3]/a") WebElement NextList;
	
	@FindBy (xpath="//ol[@class='products list items product-items']/li[2]/div/a") WebElement SelectBag;
	
	@FindBy (xpath="//*[@id='maincontent']/div[2]/div/div[1]/div[5]/div/a[1]") WebElement WishlistBag;
	
	@FindBy (xpath="//ol[@id='wishlist-sidebar']/li[1]/div/div/div[2]/div[2]/a") WebElement RemoveItemFromWishlist;
	
	@FindBy (xpath="//div[@class='minicart-wrapper']/a") WebElement myCartToOrder;
	
	@FindBy (xpath="//div[@class='actions']/descendant::a") WebElement ViewandEditCart;
	

	@FindBy (xpath="//table[@id='shopping-cart-table']/child::tbody[2]/child::tr[2]/descendant::a[2]") WebElement EditItem;
	
	@FindBy (id="option-label-size-143-item-172") WebElement EditSize;
	
	@FindBy (id="option-label-color-93-item-49") WebElement EditColour;
	
	@FindBy (id="product-updatecart-button") WebElement UpdateItem;
	
	@FindBy (xpath="//table[@id='shopping-cart-table']/tbody[2]/tr/td[3]/descendant::input") WebElement EnterQuantity;
	
	@FindBy (xpath="//form[@id='form-validate']/div[2]/button[2]") WebElement UpdateCartitem;
	
	//@FindBy (xpath="//ul[@class='checkout methods items checkout-methods-items']/descendant::button") WebElement CheckOut;
	
	@FindBy (xpath="///div[@class='cart-discount']/child::div[1]/div[1]") WebElement Applycouponlist;
	
	@FindBy (id="coupon_code") WebElement Textbox;
	
	@FindBy (xpath="//div[@id='block-shipping']/div[1]") WebElement DropDownlistEstimateshipping;
	
	@FindBy (name="country_id") WebElement SelectCountry;
	
	@FindBy (name="region_id") WebElement SelectState;
	
	@FindBy (name="postcode") WebElement EnterPostalCode;
	
	@FindBy (xpath="//*[@id='maincontent']/div[3]/div[1]/div[2]/div[1]/ul/li/button") WebElement FinalCheckOut;
	
	@FindBy (linkText="Home") WebElement home;
	
	@FindBy (xpath="//div[@class='horizontal loaded']/div[1]/div[3]") WebElement popup;
	
	public void Popup() 
	{
		popup.click();
	}
	
	public void scroll()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
	}
	
	public void Backhome()
	{
		home.click();
	}
	
	public void mouseActions()
	{
		Actions act=new Actions(driver);
		act.moveToElement(Gear).build().perform();
	}
	
	public void GearBags() 
	{
		Bags.click();
	}
	
	public void ListModes() 
	{
		ListMode.click();
	}
	
	public void ListModes2() 
	{
		ListMode2.click();
	}
	
	public void NextLists() 
	{
		NextList.click();
	}
	
	public void selectBag() 
	{
		SelectBag.click();
	}
	
	public void WishListBag() 
	{
		WishlistBag.click();
	}
	
	public void RemoveItemsFromWishlist()
	{
		RemoveItemFromWishlist.click();
	}
	
	public void MyCartToOrder()
	{
		myCartToOrder.click();
	}
	
	public void ViewAndEditCart()
	{
		ViewandEditCart.click();
	}
	
	public void EditItemParamenter()
	{
		EditItem.click();
	}
	
	public void EditSizes()
	{
		EditSize.click();
	}
	public void EditColor()
	{
		EditColour.click();
	}
	
	public void UpdateItems()
	{
		UpdateItem.click();
	}
	
	public void EnterQuantities(String nm)
	{
		EnterQuantity.click();
		EnterQuantity.clear();
		EnterQuantity.sendKeys(nm);
	}
	
	public void UpdateCart()
	{
		UpdateCartitem.click();
	}
	
//	public void ProceedToCheckOut()
//	{
//		CheckOut.click();
//	}
	
	public void ApplyCoupon()
	{
		Applycouponlist.click();
	}
	
	public void ClickTextBox(String txt)
	{
		Textbox.click();
		Textbox.sendKeys(txt);
		Textbox.sendKeys(Keys.ENTER);
	}
	
	public void DropDownlistEstimateShipping(String Num1)
	{
		DropDownlistEstimateshipping.click();
		
		Select sccountry=new Select(SelectCountry);  // drop down list for country
		sccountry.selectByVisibleText("India");
		
		Select scstate=new Select(SelectState);     // drop down list for state
		scstate.selectByVisibleText("Maharashtra");
		
		EnterPostalCode.clear();
		EnterPostalCode.sendKeys(Num1);
	}
	public void FinalcheckOut() 
	{	
		FinalCheckOut.click();					// Checkout button
	}
	
	
	
	
	
}
