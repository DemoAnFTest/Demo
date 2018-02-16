import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedInLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://Selenium Training_SelfLearning//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		System.out.println("LinkedIn Successfully launched");
		
		driver.findElement(By.tagName("a"));
		System.out.println(driver.findElement(By.tagName("<a>")));

//Finding element using customized X-Path---> For Username & Password fields
		driver.findElement(By.xpath("//input[@class='login-email']")).sendKeys("prasadmasurkar@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Swami2015");

//Finding element using Id as locator---> For Username & Password
		//driver.findElement(By.id("login-email")).sendKeys("prasadmasurkar@gmail.com");
		//driver.findElement(By.id("login-password")).sendKeys("Swami2015");
		
		driver.findElement(By.id("login-submit")).submit();
		System.out.println("Login Successful");
		
		driver.findElement(By.id("nav-settings__dropdown-trigger")).click();
		driver.findElement(By.linkText("Sign out")).click();
		System.out.println("Logged Out Successfully");
				
	}

}
