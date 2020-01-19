import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\salenium project\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in");
		
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		
		//Javascript DOM can extract hidden element
		//Because salenium cannot extract hidden elements -Ajax Implementation
		//Investigate the properties of object if it has any hidden text
		//javascriptexecutor
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String script= "return document.getElementById(\"fromPlaceName\").value;";
		String text=(String) js.executeScript(script);
		System.out.println(text);
		
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
		{
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			text=(String) js.executeScript(script);
			System.out.println(text);
		}
		
		
		

	}

}
