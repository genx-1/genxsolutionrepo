package GenX;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	
		 public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
				WebDriver driver = new EdgeDriver();
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50000));
		        driver.get("https://jqueryui.com/resizable/");
		        Thread.sleep(2000);
		        
		        //to select element outside frame
		        driver.findElement(By.xpath("//a[text()='Selectmenu']")).click();
		        
		        WebElement webelement = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		        driver.switchTo().frame(webelement);
		        
		        // Locate the dropdown element
		        WebElement dropdownElement = driver.findElement(By.xpath("(//span[@class='ui-selectmenu-text'])[1]"));

		        // Create a Select object for the dropdown
		        Select dropdown = new Select(dropdownElement);

		        // Select an item by its visible text
		        dropdown.selectByVisibleText("Faster");

		        // Alternatively, you can select an item by its value or index
		        // dropdown.selectByValue("value-of-option-2");
		        // dropdown.selectByIndex(1); // Index starts from 0

		        // Wait for a while (optional) to see the selected item
		        try {
		            Thread.sleep(2000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }

		        // Close the browser
		       // driver.quit();
		 }}
		        

	


