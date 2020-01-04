import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\salenium project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// implicit wait to control the time
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Explicit wait to control the time
		WebDriverWait w = new WebDriverWait(driver, 5);

		driver.get("https://rahulshettyacademy.com/seleniumPractise");

		// We have to create an array of items to add in the cart

		String items[] = { "Cucumber", "Brocolli", "Brinjal" };
		AddItem(driver, items);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promocode")));
		driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

	public static void AddItem(WebDriver driver, String items[]) {
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;

		for (int i = 0; i < product.size(); i++) {
			String[] name = product.get(i).getText().split("-");
			String formatedName = name[0].trim();

			// format it to get actual vegetable name
			// Converts Array into ArrayList For easy search
			// check whether the name you extracted is present in the code or not

			List itemsNeeded = Arrays.asList(items);

			if (itemsNeeded.contains(formatedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == items.length)
					break;

			}
		}

	}
}
