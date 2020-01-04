import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\salenium project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");

		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("2");

		Select p = new Select(driver.findElement(By.id("Childrens")));
		p.selectByIndex(2);

		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div/form/div[5]/p/a/strong")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("AirlineAutocomplete")).click();
		driver.findElement(By.id("SearchBtn")).click();

		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
