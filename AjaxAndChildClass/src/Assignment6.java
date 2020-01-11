import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\salenium project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
        String text=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
         
        Select s=new Select(driver.findElement(By.id("dropdown-class-example")));
        s.selectByVisibleText(text);
        
        driver.findElement(By.id("name")).sendKeys(text);
        
        driver.findElement(By.id("alertbtn")).click();
       String alerttext= driver.switchTo().alert().getText();
       driver.switchTo().alert().accept();
       if(alerttext.contains(text))
       {
    	   System.out.println("Success");
       }
       else
       {
    	   System.out.println("Failed");
       }
	}

}
