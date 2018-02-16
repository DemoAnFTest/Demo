import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchingParentChildWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Selenium Training_SelfLearning/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/SignUp");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		
		// Get& Store all the windows handles (id's) opened by selenium webdriver in an iterator string
		Set<String> ids= driver.getWindowHandles();
		java.util.Iterator<String> it = ids.iterator();
		
		//Use Iterator.next to store each parent & child handle ID in a string to be used to move the focus of the webdriver from parent to child & back to parent as per the test scenario		
		String parentid= it.next();
		String childid= it.next();
		
		//Switching from Parent window to Child Window using Switch To method
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		
		//Switching Back from Child window to Parent Window using Switch To method
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		
		
	}

}
