package GenX;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizeelement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://jqueryui.com/resizable/");
        Thread.sleep(2000);
        
        WebElement webelement = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(webelement);
        
     // Find the element to be resized
        WebElement resizableElement = driver.findElement(By.xpath("//div[@id='resizable']"));

        // Create an instance of the Actions class
        Actions actions = new Actions(driver);

        // Perform the resizing operation by moving the mouse to the element's corner
        // and then dragging it to the desired size
        int xOffset = 10; // Adjust the X offset as needed
        int yOffset = 20; // Adjust the Y offset as needed
        actions.clickAndHold(resizableElement)
               .moveByOffset(xOffset, yOffset)
               .release()
               .build()
               .perform();
Thread.sleep(10000);
        // Close the WebDriver
        driver.quit();
        
        
        
        
        
        
        
        
        
        
        
        
        
	}
}
