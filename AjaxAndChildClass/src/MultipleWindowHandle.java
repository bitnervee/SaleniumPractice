import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\salenium project\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://support.google.com/mail/answer/56256?hl=en");
		driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div[1]/article/section/div/p[2]/a")).click();
        System.out.println(driver.getTitle());
        
        
        Set<String> ids=driver.getWindowHandles();
         Iterator<String> it=ids.iterator();
        String Parentid= it.next();
        String ChildId=it.next();
        driver.switchTo().window(ChildId);
        System.out.println(driver.getTitle());
        driver.switchTo().window(Parentid);
        
	}

}
