package GenX;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class selectButtonOneByOne {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50000));
        driver.get("https://jqueryui.com/resizable/");
        Thread.sleep(2000);
        
        //to select element outside frame
        driver.findElement(By.xpath("//a[text()='Checkboxradio']")).click();
        
        WebElement webelement = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(webelement);
        
        
        for (int i = 1; i <= 15; i++) {
            // Replace "button" with the actual element locator for the radio buttons
            String buttonLocator1 = "//label[@for='radio-1']";
            String buttonLocator2 = "//label[@for='radio-2']";
            String buttonLocator3 = "//label[@for='radio-3']";
            WebElement radioButton1 = driver.findElement(By.xpath(buttonLocator1));
            WebElement radioButton2 = driver.findElement(By.xpath(buttonLocator2));
            WebElement radioButton3 = driver.findElement(By.xpath(buttonLocator3));
            
            // Check the radio button
            radioButton1.click();
            radioButton2.click();
            radioButton3.click();

            // You can add additional logic or validations here as needed

            // Sleep for a short duration to observe the selection (optional)
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
             
}}
