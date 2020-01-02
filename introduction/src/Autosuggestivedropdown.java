import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestivedropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\salenium project\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://makemytrip.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
	WebElement source=driver.findElement(By.xpath("//input[@placeholder='From']"));
	Thread.sleep(2000);
	
		source.click();
		Thread.sleep(2000);
		source.sendKeys("MUM");
		Thread.sleep(2000);
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
		
		WebElement destination=driver.findElement(By.xpath("//input[@placeholder='To']"));
		destination.sendKeys("DEL");
		Thread.sleep(2000);
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ENTER);
		
	}

}
