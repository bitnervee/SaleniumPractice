import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\salenium project\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\facebook.com");
		/*driver.findElement(By.id("email")).sendKeys("This IS MY EMAIL");
		driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.linkText("Forgotten account?")).click();*/
		
		driver.findElement(By.cssSelector("#email")).sendKeys("MYUSERNAME");
		driver.findElement(By.cssSelector("#pass")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
		

	}

}
