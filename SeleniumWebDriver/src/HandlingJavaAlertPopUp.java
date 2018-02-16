import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingJavaAlertPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://Selenium Training_SelfLearning/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();*/
		
		
		driver.get("http://www.tizag.com/javascriptT/javascriptconfirm.php");
		driver.findElement(By.xpath("//input[@value='Leave Tizag.com']")).click();
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().dismiss();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();

	}

}
