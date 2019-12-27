



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "G:\\salenium project\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
        driver.get("http://google.com");//Hit url on thebrowser
        System.out.println(driver.getTitle());//Validate that your page title is correct 
        System.out.println(driver.getCurrentUrl());//Validate that you are landed on correct url
        driver.get("http:\\yahoo.com");
        //driver.navigate().back();
        //driver.navigate().forward();
        //driver.close();//to close the current browser
        //driver.quit();//to close all the browser opened by salenium script
	}

}
