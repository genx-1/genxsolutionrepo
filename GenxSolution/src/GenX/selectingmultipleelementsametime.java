package GenX;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class selectingmultipleelementsametime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50000));
        driver.get("https://jqueryui.com/resizable/");
        Thread.sleep(2000);
        
        //to select element outside frame
        driver.findElement(By.xpath("//a[text()='Selectable']")).click();
        
        WebElement webelement = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(webelement);
        
     // Find the elements to select within the frame
        WebElement element1 = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[1]"));
       WebElement element7 = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[7]"));

        
     // Scroll to the elements within the iframe to make them visible
        scrollIntoView(driver, element1);
        scrollIntoView(driver, element7);
        
        
        
  
        // Create an instance of the Actions class
        Actions actions = new Actions(driver);

        // Perform the selection by dragging the mouse over the elements
        actions.clickAndHold(element1)
               .moveToElement(element7)
               .release()
               .build()
               .perform();

        // Switch back to the default content to interact with elements outside the frame
        driver.switchTo().defaultContent();

        // Perform actions outside the frame
       WebElement search = driver.findElement(By.xpath("//input[@name='s']"));
        search.click();
	}
	
        // Scroll element into view using JavaScript
        public static void scrollIntoView(WebDriver driver, WebElement element) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
	
	
	
	
	}

	
	

}
