import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItemInCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\salenium project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int j = 0;

		driver.get("https://rahulshettyacademy.com/seleniumPractise");

		// We have to create an array of items to add in the cart

		String items[] = { "Cucumber", "Brocolli", "Brinjal" };
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		Thread.sleep(2000);

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
