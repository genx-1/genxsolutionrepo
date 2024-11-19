package newSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class webtable2 {
	
	    public static void main(String[] args) throws InterruptedException {
		 //System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		 System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
		 driver.get("https://www.w3schools.com/html/html_table_colgroup.asp");
		 
		// for first row means heading
			//*[@id="main"]/table/tbody/tr[1]/th[1]
	int c =driver.findElements(By.xpath("//*[@id=\"main\"]/table/tbody/tr[1]//th")).size();
		System.out.println(c);
	int r =driver.findElements(By.xpath("//*[@id=\"main\"]/table/tbody/tr")).size();
	    System.out.println(r);
		   for(int i=1; i<=1; i++ ) {
			   for(int j=1; j<= c; j++ ) {
 System.out.print(driver.findElement(By.xpath("//*[@id=\"main\"]/table/tbody/tr["+ i + "]/th[" + j + "]")).getText() +"  ");   
		   }
	   System.out.println();
		   }
	    
	    
	    //for deta
		 //*[@id="main"]/table/tbody/tr[2]/td[3]
		 for(int i=2; i<= r; i++ ) 
		 {
			 for(int j=1; j<= c; j++ ) {
			 //driver.findElement(By.xpath("//*[@id=\"main\"]/table/tbody/tr[ " + i + "]" + "/th[ " + i + "]"));
             System.out.print(driver.findElement(By.xpath("//*[@id=\"main\"]/table/tbody/tr["+ i + "]/td[" + j + "]")).getText() +"  ");	 	 
		 }
		 System.out.println();
		 }	
		 
		 
}
}