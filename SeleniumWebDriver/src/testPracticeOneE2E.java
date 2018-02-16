import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testPracticeOneE2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch Browser
		System.setProperty("webdriver.chrome.driver", "D://Selenium Training_SelfLearning/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//Launch URL of application under test
		driver.get("https://www.makemytrip.com/");
		
		//Selecting From & To locations
		driver.findElement(By.xpath("//*[@id='hp-widget__sfrom']")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//*[@id='hp-widget__sTo']")).sendKeys("Goa");
		driver.findElement(By.xpath("//input[@id='hp-widget__depart']")).click();
		driver.findElement(By.xpath("//*[@id='dp1511776635508']/div/div[1]/table/tbody/tr[5]/td[4]")).click();
		//Assert.assertTrue(driver.findElement(By.xpath("")));
		driver.findElement(By.xpath("//*[@id='searchBtn']")).click();
		String title=driver.getTitle();
		System.out.println("Search Result matching the criteria is displayed" +title);
		//driver.findElement(By.xpath("//*[@id='dp1511776635508']/div/div/table/tbody/tr[5]/td[2]/a")).click();
		
		
	}

}
