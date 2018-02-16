import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtonSelection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://Selenium Training_SelfLearning/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		int list = driver.findElements(By.xpath("//input[@name='group2']")).size();
		System.out.println(list);
		
		for(int i=0;i<list;i++)
		{
			//driver.findElements(By.xpath("//input[@name='group2']")).get(i).click();
			String text = driver.findElements(By.xpath("//input[@name='group2']")).get(i).getAttribute("value");
			System.out.println(text);			
				if (text.equals("Wine"))
				{
					driver.findElements(By.xpath("//input[@name='group2']")).get(i).click();
					System.out.println("Selection made successfully for "+i);
				}			
			
						
			
		}
		
	
	

	}

}
