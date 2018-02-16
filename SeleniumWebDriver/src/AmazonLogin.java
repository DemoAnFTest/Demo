import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D://Selenium Training_SelfLearning//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println("Amazon India Successfully launched");
		System.out.println(driver.getTitle());
		
		//Enter Username & Password to login to Amazon India website
		
		//driver.findElement(By.id("nav-link-accountList")).submit();
		driver.findElement(By.cssSelector("signInSubmit"));
		//driver.findElement(By.className("nav-action-button")).click();
		driver.findElement(By.id("ap_email")).sendKeys("prasadmasurkar@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("aayushnik@2018");
		driver.findElement(By.className("nav-line-1"));
		System.out.println(driver.findElement(By.className("nav-line-1")));
	}

}
