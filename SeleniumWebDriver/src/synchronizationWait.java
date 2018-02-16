import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronizationWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*Testing Explicit wait for MakeMyTrip
		System.setProperty("webdriver.chrome.driver", "D://Selenium Training_SelfLearning/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys(Keys.DELETE);
		Thread.sleep(3000);
		
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys("GOA");
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys(Keys.TAB);
		driver.findElement(By.id("hp-widget__sTo")).sendKeys("Mumbai");
		driver.findElement(By.id("searchBtn")).click();
		
		WebDriverWait d=new WebDriverWait(driver,10);
				
		d.until(ExpectedConditions.titleContains("Flight Search"));
		
		driver.findElement(By.xpath("//*[@id='content']/div/div[5]/div[5]/div[2]/div[5]/div/div[2]/div[7]/p/a")).click();
		*/
		
		/*Testing explicit wait for Alaska Hotel Booking */
		
		System.setProperty("webdriver.chrome.driver", "D://Selenium Training_SelfLearning/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		
		driver.findElement(By.id("H-destination")).sendKeys("NYC");
		driver.findElement(By.id("H-destination")).sendKeys(Keys.ENTER);
		
		WebDriverWait d=new WebDriverWait(driver,20);
		
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='25820']/div[2]/div/a")));
		
		driver.findElement(By.xpath("//*[@id='25820']/div[2]/div/a")).click();
		
		
		
	}

}
