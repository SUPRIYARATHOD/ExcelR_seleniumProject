package run_Tasks;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import loginPage.DataDriven;
import loginPage.HomePage;
import loginPage.HomePage3_wishlist;
import loginPage.JacketNavigationPage;
import loginPage.Login_page;
import loginPage.NavigatedHomePage_2;
import loginPage.ShippingAddress;

public class Run_Methods {
	WebDriver driver;
	@BeforeTest
	public void Setup() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
		

		//Register_Page RP = new Register_Page(driver);
		
		
		
		
		
		
		
		
		
		

	
	@Test(priority=0)
	public void Scenario1() {
		Login_page lp = new Login_page(driver);
//		  RP.url(); RP.Popup(); RP.Firstname("peyu"); RP.Lastname("chawan");
//		  RP.Email("supriyaahmed10@gmail.com"); RP.Password("Peyu@5225");
//		  RP.CPassword("Peyu@5225"); RP.createACC();
		 
		
		
		 lp.Signin();
		 //lp.Popup();
		 lp.email("supriyaahmed10@gmail.com"); 
		 lp.Password("Peyu@5225");
		 lp.signinbtn();
	}
	@Test(priority=1)
	public void Scenario01() {
		HomePage Hp=new HomePage(driver);
		// RP.Popup();
		 Hp.home();

		 Hp.jacket();
		// RP.Popup();

		 Hp.scroll();
		 Hp.filterStyleJacket();
		 Hp.style();
		 Hp.Size();
		 Hp.SizeMedium();
		// RP.Popup();
		 Hp.imagenav();	
		 Hp.scroll();
	}

		
	@Test(priority=2)
	public void Scenario2() throws InterruptedException {
		JacketNavigationPage jnp=new JacketNavigationPage(driver);
		 jnp.getSelects();
		 jnp.scroll();
		
		 jnp.getSelect_2();
		 jnp.scroll();

		 jnp.sizeOfjacket();
		 jnp.scrollup();
		 
		 jnp.colourOfjacket();
		 jnp.addtocart();
		 Thread.sleep(3000);

		 jnp.viewCart();
		 Thread.sleep(3000);
		 jnp.closebtn();
		 jnp.Backhome();
		 }
	@Test(priority=3)
	public void Scenario03() throws InterruptedException {
		NavigatedHomePage_2 NHP = new NavigatedHomePage_2(driver);
	
		 //RP.Popup();
		 NHP.ClickImagenav();

		 //RP.Popup();
		 NHP.scrollD();
		 NHP.Nextbtn();
		 //RP.Popup();

		 Thread.sleep(3000);
		 NHP.SelectSortByList();
		 //RP.Popup();
		 NHP.scrollD();
		 NHP.Nextbtn();

//		 RP.Popup();
		 NHP.scroll();
		 NHP.Backbtn();
// RP.Popup();
		 
		 NHP.PantImage();
		 NHP.FullScreen();
		 NHP.FullScreenNext();
		 NHP.FullScreenNext();
		 NHP.FullScreenExit();

		// RP.Popup();
		 NHP.getSelectsize();
		 NHP.AddCart();
	}

	@Test(priority=4)
	public void Scenario4() throws InterruptedException {
		HomePage3_wishlist HPW = new HomePage3_wishlist(driver);
	
		 
		HPW.Backhome();
		// RP.Popup();
		 HPW.mouseActions();
		 HPW.GearBags();

		// RP.Popup();
		 HPW.ListModes();
		// RP.Popup();
		// Hp.scroll();
		 HPW.ListModes2();
		 HPW.NextLists();

		// RP.Popup();
		// Hp.scroll();
		 HPW.selectBag();
		 
		// RP.Popup();
		 HPW.WishListBag();
		 HPW.RemoveItemsFromWishlist();

		 HPW.MyCartToOrder();
		 HPW.ViewAndEditCart();
		// RP.Popup();
		 HPW.EditItemParamenter();
		 HPW.EditSizes();
		 HPW.EditColor();
		 HPW.UpdateItems();

		 HPW.Popup();
		 HPW.EnterQuantities("2");
		 HPW.UpdateCart();
		 
		 Thread.sleep(2000);
		 HPW.Popup();
		 HPW.scroll();
		 
//		 HPW.ApplyCoupon();
//		 HPW.ClickTextBox("abcd1234");
//		 HPW.Popup();
	 
		 HPW.DropDownlistEstimateShipping("402389");
		 HPW.scroll();
		 HPW.scroll();
		 HPW.FinalcheckOut();
		Thread.sleep(2000);
	}
//======================================================================================================================
	/*
	 * @Test(priority=5) public void Scenario5() throws InterruptedException {
	 * ShippingAddress SA= new ShippingAddress(driver);
	 * 
	 * SA.AddNeWAddress(); SA.FillNewAddressName("Peyusia");
	 * SA.FillNewAddressLastName("chauhan"); SA.FillNewAddresscompany("ExcelR");
	 * SA.FillNewAddresStreet("Lonavala layout");
	 * SA.FillNewAddresCity("marathhalli");
	 * SA.FillNewAddresTelephoneCheckBttn("1234567858");
	 * 
	 * SA.ButtonNext(); }
	 */
	@Test(priority=5)
	public void shipping1() {
		
		WebElement AddNewAddress=driver.findElement(By.xpath("//ol[@id='checkoutSteps']/li[1]/div[2]/div[2]/button"));
		AddNewAddress.click();
		
	}
	@Test(priority=6)
	public void shipping2() {
		
		WebElement FirstName=driver.findElement(By.name("firstname"));
		FirstName.clear();
		FirstName.sendKeys("peyusia");
		
	}
	@Test(priority=7)
	public void shipping4() {
		
		WebElement LastName=driver.findElement(By.name("lastname"));
		LastName.clear();
		LastName.sendKeys("chauhan");
		
	}
	@Test(priority=8)
	public void shipping5() {
		
		WebElement Company=driver.findElement(By.name("company"));
		Company.sendKeys("ExcelR");
	}
	@Test(priority=9)
	public void shipping6() {
		
		WebElement StreetAddress=driver.findElement(By.name("street[0]"));
		StreetAddress.sendKeys("ACES layout");
	}
	@Test(priority=10)
	public void shipping7() {
		
		WebElement City=driver.findElement(By.name("city"));
		City.sendKeys("Lonavala");
		
	}
	@Test(priority=11)
	public void shipping8() {
		
		WebElement Telephone=driver.findElement(By.name("telephone"));
		Telephone.sendKeys("1234567895");
		
		WebElement UncheckSaveAddress=driver.findElement(By.id("shipping-save-in-address-book"));
		UncheckSaveAddress.click();
		
		WebElement ShipHere=driver.findElement(By.xpath("//footer[@class='modal-footer']/button[1]"));
		ShipHere.click();
		
	}
	@Test(priority=12)
	public void shipping9() throws InterruptedException {
		
		WebElement NextButton=driver.findElement(By.xpath("//div[@id='shipping-method-buttons-container']/div/button"));
		NextButton.click();
		Thread.sleep(1000);
		
		WebElement CheckboxForPayment=driver.findElement(By.id("billing-address-same-as-shipping-checkmo"));
		CheckboxForPayment.click();
		
		WebElement SubmitPlaceOrder=driver.findElement(By.xpath("//form[@id='co-payment-form']/descendant::div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div/button"));
		SubmitPlaceOrder.click();	
	}

//======================================================================================================================	
	@Test(priority=13)
	public void Scenario7() {
		//dropdown list for Myaccount
		driver.findElement(By.xpath("//ul[@class='header links']/li[2]/descendant::button")).click();
	}
	@Test(priority=14)
	public void Scenario8() {
		//My account
		driver.findElement(By.xpath("//div[@class='panel header']/ul/li[2]/div[1]/ul/li[1]/a")).click();
				
	}
	@Test(priority=15)
	public void Scenario9() {
		//view orders
		driver.findElement(By.xpath("//div[@class='block block-dashboard-orders']/div[1]/a")).click();
				
	}
	@Test(priority=16)
	public void Scenario10() {
		//dropdown list for Myaccount to logout
		driver.findElement(By.xpath("//ul[@class='header links']/li[2]/descendant::button")).click();
	}
	
	@Test(priority=17)
	public void Scenario11() {
		//signout
		driver.findElement(By.xpath("//div[@class='panel header']/ul/li[2]/div[1]/ul/li[3]/a")).click();
	}
	
	@Test(priority=18)
	public void Scenario12() {
		//popup
		driver.findElement(By.xpath("//div[@class='horizontal loaded']/div[1]/div[3]")).click();
	}
	
	@Test(priority=19)
	public void Scenario13() {
		//sign_in
		driver.findElement(By.xpath("//ul[@class='header links']/child::li[2]/a")).click();
	}
	
	@Test(priority=20)
	public void Scenario14() {
		//email textbox
		WebElement Email=driver.findElement(By.id("email"));
		Email.sendKeys("supriyaahmed10@gmail.com");
		Email.click();
	}
	
	@Test(priority=21)
	public void Scenario15() {
		//forgot password link
		WebElement forgotpassword=driver.findElement(By.linkText("Forgot Your Password?"));
		forgotpassword.click();
	}
	
	@Test(priority=22)
	public void Scenario16() {
		//email textbox in forgot password link
		WebElement Email_id=driver.findElement(By.id("email_address"));
		Email_id.click();
		Email_id.sendKeys("supriyaahmed10@gmail.com");
		}
	
	@Test(priority=23)
	public void Scenario17() {
		//Reset button
		WebElement Reset=driver.findElement(By.xpath("//form[@id='form-validate']/div[1]/div[1]/button"));
		Reset.click();
		}
	
	@Test(priority=24)
	public void Scenario18() throws IOException  {
		DataDriven DD= new DataDriven(driver);
		DD.data();
	
	}
	
	
	
	@AfterTest
	public void close() 
	{
		driver.close();
	}
	
	}

