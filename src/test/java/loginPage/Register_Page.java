package loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Page {
	WebDriver driver;
	
	public Register_Page(WebDriver idriver) {
		driver=idriver;
		PageFactory.initElements(driver, this);
	}
	
	public void url() {
		driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
	}
	
	@FindBy (id="firstname") WebElement fname;
	@FindBy (id="lastname") WebElement lname;
	@FindBy (id="email_address") WebElement email;
	@FindBy (id="password") WebElement pass;
	@FindBy (id="password-confirmation") WebElement cpass;
	@FindBy (xpath="//div[@class='primary']/child::button") WebElement createbtn; // ====//button[@type='submit']
	@FindBy (xpath="//div[@class='ea-stickybox-hide']") WebElement popup;
	
	public void Popup() 
	{
		popup.click();
	}
	
	public void Firstname(String fn) 
	{
		fname.sendKeys(fn);
	}
	
	public void Lastname(String ln) 
	{
		lname.sendKeys(ln);
	}
	
	public void Email(String em)
	{
		email.sendKeys(em);
	}
	
	public void Password(String Pass)
	{
		pass.sendKeys(Pass);
	}
	
	public void CPassword(String CPass)
	{
		cpass.sendKeys(CPass);
	}
	
	public void createACC()
	{
		createbtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	