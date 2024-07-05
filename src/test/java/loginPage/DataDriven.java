package loginPage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DataDriven {

	static WebDriver driver;

	public  DataDriven(WebDriver idriver) {
		driver=idriver;
		PageFactory.initElements(driver, this);
	}
	public void data() throws IOException {
		String filePath="C:\\Users\\admin\\Desktop\\ProjectLoginData.xlsx";
		FileInputStream fis= new FileInputStream(filePath);
		XSSFWorkbook workbook= new XSSFWorkbook(fis); 
		XSSFSheet sheet= workbook.getSheet("Form");
		
		int Rows= sheet.getLastRowNum();
		System.out.println(Rows);
		
		for(int i=1;i<=Rows;i++) {
			XSSFRow row= sheet.getRow(i);
			XSSFCell EmailId = row.getCell(0);
			XSSFCell passwd= row.getCell(1);
			System.out.println("Email_id==========>"+EmailId +"Password==============>"+passwd);
			
			try 
			{
				WebElement emailkeys=driver.findElement(By.id("email"));
				emailkeys.clear();
				emailkeys.sendKeys(EmailId.toString());
				
				WebElement Passwordkeys=driver.findElement(By.id("pass"));
				Passwordkeys.clear();
				Passwordkeys.sendKeys(passwd.toString());
				
				driver.findElement(By.id("send2")).click();
				
				System.out.println("Valid test data");
				
			}catch (Exception e)
			{
				System.out.println("Invalid test data");
			}
			
		}
		fis.close();

	}
}

