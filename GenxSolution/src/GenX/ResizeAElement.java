package GenX;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeAElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50000));
        driver.get("https://jqueryui.com/resizable/");
        Thread.sleep(2000);
        
        //to select element outside frame
        driver.findElement(By.xpath("//a[text()='Dialog']")).click();
        
        WebElement webelement = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(webelement);
        
     // Locate the element within the iframe that you want to resize
        WebElement resizableElement = driver.findElement(By.xpath("//div[@class='ui-dialog ui-corner-all ui-widget ui-widget-content ui-front ui-draggable ui-resizable']")); // Replace with your element locator

     // Create an instance of the Actions class
        Actions actions = new Actions(driver);

        // Get the initial size of the element
        int initialWidth = resizableElement.getSize().getWidth();
        int initialHeight = resizableElement.getSize().getHeight();
        
       
        // Calculate the new size by adding offsets
        int xOffset = 5; // Adjust as needed
        int yOffset = 5; // Adjust as needed
        int newWidth = initialWidth + xOffset;
        int newHeight = initialHeight + yOffset;

        actions.clickAndHold(resizableElement).moveByOffset(xOffset, yOffset).release().build().perform();
        
        driver.switchTo().defaultContent();
        
        
        
        
        
        
        
        
        
        
        
}}
