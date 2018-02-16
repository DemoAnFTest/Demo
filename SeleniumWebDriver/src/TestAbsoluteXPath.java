import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAbsoluteXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D://Selenium Training_SelfLearning//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		
		//Traverse using absolute X-Path for different variables on Linked in Footer links
		
		driver.findElement(By.xpath("//body/div/main/div/div[3]/div[2]/div[1]/ul/li[1]/a")).click();
		//driver.getTitle().compareToIgnoreCase("Sign Up | LinkedIn");
		boolean test = driver.getTitle().equalsIgnoreCase("Sign Up | linkedin"); 
		if (test == true)
		{
				System.out.println("Sign Up link identified & clicked upon in Linked In footer");	
		}
		else 
			System.out.println("Navigated to incorrect page");
		
			
		
	}

}
