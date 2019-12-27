import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\salenium project\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\facebook.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("myown xpath");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		

	}

}
