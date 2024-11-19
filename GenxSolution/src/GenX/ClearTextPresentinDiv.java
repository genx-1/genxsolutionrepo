package GenX;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ClearTextPresentinDiv {
	
	// Q>  Make selenium with java automation script   for clear already present text in any div.
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
        
     /*   // Locate the <div> element by its locator (modify as needed)
        WebElement divElement = driver.findElement(By.id("dialog")); // Replace with your locator

        // Clear the text within the <div> element
        divElement.clear(); */
        //above code showing "Invalid Element state exception" to solve that follow below description and code

       /* The clear() method is typically used to clear text input fields (e.g., <input> elements) and is not applicable
        *  to <div> elements. If you want to remove text content from a <div> element, you can use the sendKeys method to
        *   send an empty string. Here's the corrected code:
        */

     // Locate the <div> element by its locator (modify as needed)
        WebElement divElement = driver.findElement(By.id("dialog")); // Replace with your locator

        // Clear the text within the <div> element by sending an empty string
        divElement.sendKeys("");

        
        
        
        
        
        
        
        
        
        
        
        
        
        
     
}}
