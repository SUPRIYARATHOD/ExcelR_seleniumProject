package loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public  HomePage(WebDriver idriver) {
		driver=idriver;
		PageFactory.initElements(driver, this);
	}
	public void home() {
		WebElement women=driver.findElement(By.id("ui-id-4"));
		Actions act=new Actions(driver);
		act.moveToElement(women).build().perform();
		
		WebElement tops=driver.findElement(By.id("ui-id-9"));
		Actions act1=new Actions(driver);
		act1.moveToElement(tops).build().perform();
	}
	
	@FindBy (id="ui-id-11") WebElement jacket;
	@FindBy (xpath="//div[@class='filter-options-title']") WebElement filterstyleJ;
	@FindBy (xpath="//ol[@class='items']/descendant::a") WebElement styles;
	@FindBy (xpath="//div[@id='narrow-by-list']/child::div[1]/child::div") WebElement size;
	@FindBy (xpath="//div[@class='swatch-attribute-options clearfix']/child::a[2]/child::div") WebElement sizeMed;
	@FindBy (xpath="//div[@class='products wrapper grid products-grid']/ol/li[1]/div/a/descendant::img") WebElement imglink;
	@FindBy (xpath="//div[@class='ea-stickybox-hide']") WebElement popup;
	
	public void Popup() 
	{
		popup.click();
	}
	
	
	public void jacket() 
	{
		jacket.click();
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
	
	public void filterStyleJacket() 
	{
		filterstyleJ.click();     
	}
	
	public void style() 
	{
		styles.click();     
	}
	
	public void Size() 
	{
		size.click();     
	}
	
	public void SizeMedium() 
	{
		sizeMed.click();     
	}
	
	public void imagenav() {
		imglink.click();
	}

}
