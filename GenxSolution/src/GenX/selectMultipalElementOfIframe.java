package GenX;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class selectMultipalElementOfIframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://jqueryui.com/resizable/");
        Thread.sleep(2000);
        
        //to select element outside frame
        driver.findElement(By.xpath("//a[text()='Selectable']")).click();
        
        WebElement webelement = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(webelement);
        
       
        
        
     // Now you can interact with elements inside the frame
        WebElement element1 = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[1]"));
        element1.click();

        WebElement element2 = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[2]"));
        element2.click();

        // Switch back to the default content to interact with elements outside the frame
        driver.switchTo().defaultContent();

        // Perform actions outside the frame
        WebElement search = driver.findElement(By.xpath("//input[@name='s']"));
        search.click();

        // Close the WebDriver
        
          
        
        
        
        
        
        
        
        
        
        
        

	}

}
