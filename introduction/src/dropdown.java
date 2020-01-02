import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\salenium project\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com");
		
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("AED");
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("divpaxinfo")).click();
		//Select p=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		//p.selectByValue("2");
		//driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		//driver.findElement(By.id("divpaxinfo")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='chk_IndArm']")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[id*='chk_IndArm']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='chk_IndArm']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='chk_IndArm']")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[id*='chk_IndArm']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Is Enabled");
			 Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

}
