package GenX;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ReorderElementOfLine {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50000));
        driver.get("https://jqueryui.com/resizable/");
        Thread.sleep(2000);
        
        //to select element outside frame
        driver.findElement(By.xpath("//a[text()='Sortable']")).click();
        
        
   //swith to frame
        WebElement webelement = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(webelement);
       
        
        // Find the list of sortable elements
        WebElement sortableList = driver.findElement(By.xpath("//ul[@id='sortable']"));
        
        
     // Perform drag-and-drop to reorder elements
      
        WebElement sourceElement = sortableList.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[7]"));
        WebElement targetElement = sortableList.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[1]"));
     

        
        // Scroll to the elements within the iframe to make them visible
        scrollIntoView(driver, sourceElement);
        scrollIntoView(driver, targetElement);
        
        Actions builder = new Actions(driver); 
        builder.clickAndHold(sourceElement).moveToElement(targetElement).click().build().perform();
        
        
        Thread.sleep(10000);
        
     // Switch back to the default content to interact with elements outside the frame
        driver.switchTo().defaultContent();

        // Perform actions outside the frame
       WebElement search = driver.findElement(By.xpath("//input[@name='s']"));
        search.click();}
        
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
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

