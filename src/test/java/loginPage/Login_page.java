package loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	WebDriver driver;
	
	public  Login_page(WebDriver idriver) {
		driver=idriver;
		PageFactory.initElements(driver, this);
	}
		 
		@FindBy (xpath="//ul[@class='header links']/child::li[2]/a") WebElement signin;
		@FindBy (id="email") WebElement Email;
		@FindBy (id="pass") WebElement password;	
		@FindBy (id="send2") WebElement submit;
		@FindBy (xpath="//div[@class='ea-stickybox-hide']") WebElement popup;
		
		public void Popup() 
		{
			popup.click();
		}
	
		public void Signin() 
		{
			signin.click();
		}
		public void email(String em)
		{
			Email.sendKeys(em);
		}
		public void Password(String pass) 
		{
			password.sendKeys(pass);
		}
		public void signinbtn()
		{
			submit.click();
		}
		
	}



