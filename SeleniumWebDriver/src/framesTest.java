import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://Selenium Training_SelfLearning/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		//finding iFrame or frames which cannot be identified using regular find elements.
		driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); ///Finding frames by Web-element
		
	}

}
