import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://Selenium Training_SelfLearning/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		
		//Check if CheckBox is selected by default or not
		
		System.out.println("There are "+driver.findElements(By.xpath("//div[@id='discount-checkbox']")).size()+" Check Boxes");
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_SeniorCitizenDiv']")).click();
		
		
		//Check if RadioButton is selected by default or not
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected();
		System.out.println("Radio button is default selected already");
		
		boolean radio = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected();
		if (radio == true){
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
			System.out.println("Different Radio button selected now");
		}
		
	}

}
