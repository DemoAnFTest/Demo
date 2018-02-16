import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropdownsTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Setting the Browser driver system properties and launching the Chrome Browser with Application URL--->
		
		System.setProperty("webdriver.chrome.driver", "D://Selenium Training_SelfLearning/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		
		//Defining Select Class and respective object to access the class methods to handle STATIC DROPDOWN --->
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		
		s.selectByIndex(1);
		System.out.println("Selected Adult Dropdown by Index method");
		Thread.sleep(3000);
						
		s.selectByValue("5");
		System.out.println("Selected Adult Dropdown by Value method");
		Thread.sleep(3000);
				
		s.selectByVisibleText("9");
		System.out.println("Selected Adult Dropdown by Visible Text method");
		Thread.sleep(3000);
		
		//How to Handle DYNAMIC DROPDOWN --->
		
		//driver.findElement(By.xpath("//*[@id='marketCityPair_1']/div/div[1]/input'")).click();
		driver.findElement(By.cssSelector("[id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		//driver.findElement(By.xpath("//a[@value='BOM'")).click();
		driver.findElement(By.cssSelector("[value='BOM']")).click();
		//driver.findElement(By.cssSelector("[id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		//driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']/div/table/tbody/tr[2]/td[2]/div[3]/div/div/ul[2]/li[3]/a")).click();
		//driver.findElement(By.cssSelector("[value='GOI']")).click();
		//driver.findElement(By.cssSelector("([value='GOI'])[2]")).click();
				
		

	}

}
