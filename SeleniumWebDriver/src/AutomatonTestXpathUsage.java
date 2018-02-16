import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatonTestXpathUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://Selenium Training_SelfLearning/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.linkText("Sign in")).click();
		boolean test = driver.findElement(By.xpath("//*[@id='columns']/div[1]/span[2]")).isDisplayed();
		if (test == true){
			System.out.println("User Authentication/Login Page is displayed successfully");
		}
		else 
			System.out.println("Incorrect navigation");
		//Create New User profile
		
		driver.findElement(By.xpath("//*[@id='columns']/div[3]/div/div/div[1]/form/div/div[2]/input")).sendKeys("testu1@gmail.com");
		driver.findElement(By.xpath("//*[@id='columns']/div[3]/div/div/div[1]/form/div/div[3]/button")).submit();
		
		driver.findElement(By.cssSelector("[id='submitAccount']")).submit();
		
		boolean error = driver.findElement(By.cssSelector("div[class='alert alert-danger']")).isDisplayed();
		System.out.println(error);
		
		
		

	}

}
