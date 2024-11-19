package newSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebtableWithNestedforloop {
	public static void main(String[] args) throws InterruptedException {
		 //System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		 System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
		 driver.get("https://www.w3schools.com/html/html_tables.asp");
	
		 int r = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr")).size();
		 System.out.println("Number of rows in webtable ; "+ r);
		 int c = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[1]/th")).size();
		 System.out.println("Number of colomn in webtable ; "+ c);
		 
		 for (int i=1; i<=1; i++ ) {
			 for (int j=1; j<=c; j++) {
 System.out.print(driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[" + i + "]/th[" + j + "]")).getText() + "  ");
			 }
			 System.out.println();
		 }
		 
	for (int i=2; i<=r; i++) {
		for (int j=1; j<=c; j++)
		{
System.out.print(driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[" + i + "]/td[" + j + "]")).getText() + "  ");			
		}
		System.out.println();
	}
		
	    
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
}
}