import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://Selenium Training_SelfLearning/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		
		//Move to specific element which is of mouse over hover type.
		//a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
		
		WebElement link= driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		a.moveToElement(link).build().perform();
		
		//Move to Search Box and keep holding SHIFT button of keyboard and entering the search keyword.
		
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		//a.moveToElement(driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input"))).click().build().perform();
		
		//Perform right Click on any element on web page
		
		
		a.moveToElement(link).contextClick().build().perform();
		

	}

}
