package loginPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JacketNavigationPage {
WebDriver driver;

	public  JacketNavigationPage(WebDriver idriver) {
		driver=idriver;
		PageFactory.initElements(driver, this);
	}

	//List<WebElement>gender=driver.findElements(By.xpath("//div[@class='fotorama__nav__shaft']/descendant::img"));
	
	//@FindBy (xpath="//div[@class='fotorama__nav__shaft']/descendant::img") List<WebElement> imgLists;
	
	//   option-label-size-143-item-168
	@FindBy (id="option-label-size-143-item-168") WebElement selectjacketsize;
	@FindBy (id="option-label-color-93-item-53") WebElement selectjacketcolour;
	@FindBy (id="product-addtocart-button") WebElement AddtoCart;
	@FindBy (xpath="//div[@class='minicart-wrapper']/a") WebElement Cart;
	@FindBy (id="btn-minicart-close") WebElement close;
	@FindBy (linkText="Home") WebElement home;
	@FindBy (xpath="//div[@class='ea-stickybox-hide']") WebElement popup;
	
	public void Popup() 
	{
		popup.click();
	}
	public void scroll()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
	}
	
	public void scrollup()
	{
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-350)", "");
	}
	
	 //Home
	
	private List<WebElement> selects1;
	
	public List<WebElement> getSelects() {
	      selects1 = driver.findElements(By.xpath("//div[@class='fotorama__nav__shaft']/descendant::img"));
	      for(int i=1;i<selects1.size();i++)
			{
	    	  selects1.get(i).click();
			}
	      return selects1;
	    } 
	
	private List<WebElement> selects2;
	
	public List<WebElement> getSelect_2() {
	      selects2 = driver.findElements(By.xpath("//div[@class='product data items']/descendant::a"));
      for(int i=0;i<selects2.size();i++)
			{
	    	  selects2.get(i).click();
	    	  
			}
	    //System.out.println(selects2.size());
	      return selects2;
	    } 
	
	public void sizeOfjacket() 
	{
		selectjacketsize.click();
	}
	
	public void colourOfjacket()
	{
		selectjacketcolour.click();
	}
	
	public void addtocart()
	{
		AddtoCart.click();
	}
	
	public void viewCart()
	{
		Cart.click();
	}
	
	public void closebtn()
	{
		close.click();
	}
	
	public void Backhome()
	{
		home.click();
	}
	
	
	
}
