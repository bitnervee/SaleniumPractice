import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GridTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\salenium project\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22759/ind-vs-sl-3rd-t20i-sri-lanka-tour-of-india-2020");
		int sum=0;
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
       int  rowcount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-hdr-rw']")).size();
     int count=  table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
       
     for(int i=0;i<count-2;i++)
     {
    	String Value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
    	int valueinteger=Integer.parseInt(Value);
    	sum=sum+valueinteger;
     }
     System.out.println(sum);
     String Extra=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
     int Extravalue=Integer.parseInt(Extra);
     sum=sum+Extravalue;
     String total=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
     int Totalvalue=Integer.parseInt(total);
     if(sum==Totalvalue)
     {
    	 System.out.println("Extravalue is equal to Totalvalue  :-" +Totalvalue);
     }
     else
     {
    	 System.out.println("Extravalue is not equal to Totalvalue ");
     }
	}

}
