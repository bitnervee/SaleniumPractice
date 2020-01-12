import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\salenium project\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
	WebElement Table=driver.findElement(By.id("product"));
	System.out.println(Table.findElements(By.tagName("tr")).size());
	System.out.println(Table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
      
	List<WebElement> secondrow=Table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
	
	System.out.println(secondrow.get(0).getText());
	System.out.println(secondrow.get(1).getText());
	System.out.println(secondrow.get(2).getText());
	}

}
