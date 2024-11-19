package GenX;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        Thread.sleep(2000);
        
        //switch to alert
         driver.switchTo().frame("iframeResult");
         //find alert
         driver.findElement(By.xpath("//button[text()='Try it']")).click();
          Thread.sleep(2000);
          //accept alert
          driver.switchTo().alert().accept();
         // System.out.println(driver.switchTo().alert().getText()); 
        
          //nevigate on parent frame
          Thread.sleep(2000);
          driver.switchTo().parentFrame();
          Thread.sleep(2000);
          //get text of from alert
          System.out.println(driver.getTitle());
          //close alert
          driver.close();
           
	}

}
