package GenX;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DatePicker {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50000));
        driver.get("https://jqueryui.com/resizable/");
        Thread.sleep(2000);
        
        //to select element outside frame
        driver.findElement(By.xpath("//a[text()='Datepicker']")).click();
        
        WebElement webelement = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(webelement);
        
     
        
     // Locate the date picker element
        WebElement datePicker = driver.findElement(By.xpath("//input[@id='datepicker']")); // Replace with the actual locator

        // Click the date picker to open the calendar
        datePicker.click();

        // Locate the specific date element you want to select and click it
        WebElement desiredDate = driver.findElement(By.xpath("//a[@data-date='2']")); // Replace with the actual date
        desiredDate.click();

        // You can add additional logic or validations here as needed
       Thread.sleep(10000);
        // Close the WebDriver
        driver.close();
	}}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

