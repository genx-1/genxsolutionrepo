package newSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class webtableWithCheckbox {
	public static void main(String[] args) throws InterruptedException {
		 //System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		 System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
		 driver.get("https://seleniumpractise.blogspot.com/");
		 
		 
		 int c =driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td")).size();
			System.out.println(c);
		int r =driver.findElements(By.xpath(" //*[@id=\"customers\"]/tbody/tr")).size();
		    System.out.println(r);
			   for(int i=1; i<=r; i++ ) 
			   {
				   for(int j=2; j<= c; j++ ) {
	 System.out.print(driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+ i + "]/td[" + j + "]")).getText() +"  ");   
			   }
		   System.out.println();
			   }
			 
			 //*[@id="customers"]/tbody/tr[1]/th[1]		
		 
		 
		 
		 
		 
	}
}
