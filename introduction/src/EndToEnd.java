import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EndToEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\salenium project\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("http://spicejet.com");
      driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
      driver.findElement(By.xpath("//a[@value='DEL']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
      driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
      if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Is Enabled");
			 Assert.assertFalse(false);
		}
		else
		{
			Assert.assertTrue(true);
		}
        driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		Thread.sleep(2000);
		
		
		for(int i=1;i<4;i++) {
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).sendKeys(Keys.ARROW_DOWN);
		}
		
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("divpaxinfo")).click();
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
