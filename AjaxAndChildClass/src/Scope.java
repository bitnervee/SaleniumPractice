import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\salenium project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        
		//To Get The Link Count  Of The Entire Page
		System.out.println(driver.findElements(By.tagName("a")).size());
       
		//To Get the Link Count Of  Only Footer Section
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));//Limiting Web Driver Scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//To get the link count of 1st Column of the footer section
		
		WebElement columndriver =footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//Click on each link and check whether the page is opening or not and grab the title of the page
		
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String Clicktab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(Clicktab);
			Thread.sleep(5000L);
		}
		
	Set<String> abc=	driver.getWindowHandles();
	Iterator<String> it=abc.iterator();
	
	while(it.hasNext())
	{
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
	}
	}

}
