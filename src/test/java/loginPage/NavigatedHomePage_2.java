package loginPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NavigatedHomePage_2 {

	
	WebDriver driver;

	public  NavigatedHomePage_2(WebDriver idriver) {
		driver=idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//div[@class='block-promo-wrapper block-promo-hp']/child::a[1]") WebElement ImageNav;
	//@FindBy (xpath="//*[@id=\\\"maincontent\\\"]/div[3]/div[1]/div[4]/div[2]/ul/li[4]/a") WebElement Next;
	
	@FindBy(xpath="//*[@id='maincontent']/div[3]/div[1]/div[4]/div[2]/ul/li[4]/a") WebElement Next;
	
	
	
	@FindBy(id="sorter") WebElement SortBy_DropDown;
	@FindBy(xpath="//*[@id='maincontent']/div[3]/div[1]/div[4]/div[2]/ul/li[1]/a") WebElement Back;
	
	@FindBy(xpath="//*[@id='maincontent']/div[3]/div[1]/div[3]/ol/li/div/a/span/span/img") WebElement Pantimg;
	@FindBy(xpath="//div[@class='fotorama__stage__shaft fotorama__grab']/div/img") WebElement fullscreen;
	@FindBy(xpath="//div[@class='fotorama__arr fotorama__arr--next']") WebElement fullscreenNext;
	@FindBy(xpath="//div[@class='fotorama__fullscreen-icon']") WebElement fullscreenExit;
	@FindBy(id="product-addtocart-button") WebElement Addcart;
	
	public void scroll()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
	}
	
	private List<WebElement> selectssize;	
		public List<WebElement> getSelectsize() {
		      selectssize = driver.findElements(By.xpath("//div[@class='swatch-attribute-options clearfix']/child::div"));
		      for(int i=1;i<selectssize.size();i++)
				{
		    	  selectssize.get(i).click();
				}
		      //System.out.println(selectssize.size());
		      return selectssize;
		    }
		
	
	
	public void ClickImagenav() 
	{
		ImageNav.click();
	} 
	
	public void scrollD()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1450)", "");
	}
	
	public void Nextbtn()
	{
		Next.click();
	}
	
	public void SelectSortByList() 
	{
		Select Sorting=new Select(SortBy_DropDown);
		Sorting.selectByIndex(2);
	}
	
	public void Backbtn()
	{
		Back.click();
	}
	
	public void PantImage()
	{
		Pantimg.click();
	}
	
	public void FullScreen()
	{
		fullscreen.click();
	}
	
	public void FullScreenNext() 
	{
		fullscreenNext.click();
	}
	
	public void FullScreenExit()
	{
		fullscreenExit.click();
	}
	
	public void AddCart()
	{
		Addcart.click();
	}
	
	
	
	
	
}
