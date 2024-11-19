package GenX;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autosuggestion {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50000));
        driver.get("https://jqueryui.com/resizable/");
        Thread.sleep(2000);
        
        //to select element outside frame
        driver.findElement(By.xpath("//a[text()='Autocomplete']")).click();
        
        WebElement webelement = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(webelement);
   
     // Locate the input element for the query
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='tags']"));

     // Enter a query to trigger autosuggestions
        searchBox.sendKeys("c");
        

       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
      //  WebElement autosuggestionList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='ui-id-1']/li")));
       
        WebElement list = (WebElement) driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
       list.click();
       
        Thread.sleep(4000);
        
        
        
        // You can perform further actions on the selected suggestion if needed.

        
        
        
        
        
        
        
        
        
        
        
        
}}
