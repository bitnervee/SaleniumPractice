import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\salenium project\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).click();
	    driver.findElement(By.id("autocomplete")).sendKeys("IND");
	    //driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	    
	    JavascriptExecutor js =(JavascriptExecutor)driver;
	   String script ="return document.getElementById(\"autocomplete\").value;";
	   String text=(String) js.executeScript(script);
	   System.out.println(text);
	   
	   while(!text.equalsIgnoreCase("INDIA"))
	   {
		   driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		   text=(String) js.executeScript(script);
		   driver.findElement(By.id("autocomplete")).click();
		   System.out.println(text);
		   
	   }
	   
	    

	}

}
