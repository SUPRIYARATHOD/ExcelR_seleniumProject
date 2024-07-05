package loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingAddress {

	WebDriver driver;

	public  ShippingAddress(WebDriver idriver) {
		driver=idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//ol[@id='checkoutSteps']/li[1]/div[2]/div[2]/button") WebElement AddNewAddress;
	@FindBy (name="firstname") WebElement FirstName;
	@FindBy (name="lastname") WebElement LastName;
	@FindBy (name="company") WebElement Company;
	@FindBy (name="street[0]") WebElement StreetAddress;
	@FindBy (name="city") WebElement City;
	@FindBy (name="telephone") WebElement Telephone;
	@FindBy (id="shipping-save-in-address-book") WebElement UncheckSaveAddress;
	@FindBy (xpath="//footer[@class='modal-footer']/button[1]") WebElement ShipHere;
	@FindBy (xpath="//div[@id='shipping-method-buttons-container']/div/button") WebElement NextButton;
	@FindBy (id="billing-address-same-as-shipping-checkmo") WebElement CheckboxForPayment;
	@FindBy (xpath="//form[@id='co-payment-form']/descendant::div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div/button") WebElement SubmitPlaceOrder;
	
	
	
	
	
	public void AddNeWAddress()
	{
		AddNewAddress.click();
	}
	public void FillNewAddressName(String name)
	{
		FirstName.clear();
		FirstName.sendKeys(name);
	}
	public void FillNewAddressLastName(String lname)
	{
		LastName.clear();
		LastName.sendKeys(lname);
	}
	public void FillNewAddresscompany(String comp)
	{
		Company.sendKeys(comp);
	}
	public void FillNewAddresStreet(String street)
	{
		StreetAddress.sendKeys(street);
	}
	
	public void FillNewAddresCity(String city)
	{
		City.sendKeys(city);
	}
	public void FillNewAddresTelephoneCheckBttn(String Phone)
	{
		Telephone.sendKeys(Phone);
		UncheckSaveAddress.click();
		ShipHere.click();
	}
	
	public void ButtonNext() throws InterruptedException
	{
		NextButton.click();
		Thread.sleep(1000);
		CheckboxForPayment.click();
		SubmitPlaceOrder.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
