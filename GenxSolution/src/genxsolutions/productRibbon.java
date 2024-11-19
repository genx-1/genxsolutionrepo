package genxsolutions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class productRibbon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50000));
        driver.get("https://vikiv45.retailhub-test.no/Admin/");
        
        WebElement ele1 = driver.findElement(By.xpath("//span[@class='activeSelect']"));
        Actions a = new Actions(driver);
        a.moveToElement(ele1).click().build().perform();
        
        
        WebElement ele2 = driver.findElement(By.xpath("(//span[@style='display: block;'])[2]"));
        Actions a1 = new Actions(driver);
        a1.moveToElement(ele2).click().build().perform();

        Thread.sleep(3000);
        WebElement emailid = driver.findElement(By.xpath("//input[@id='Email']"));
        emailid.sendKeys("store14@viki-test.no");
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("demo#QA123$");
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        Thread.sleep(2000);
        WebElement adminbutton = driver.findElement(By.id("btnWillDoItLater"));
        adminbutton.click();
        
        WebElement contentmanagement = driver.findElement(By.xpath("//i[@class='nav-icon fas fa-cubes']"));
        contentmanagement.click();
        
        WebElement sizeguide = driver.findElement(By.xpath("//p[normalize-space(text())='Product Ribbons']"));
        sizeguide.click();
    
        WebElement addNew = driver.findElement(By.xpath("//a[@class='btn bg-blue']"));
        addNew.click();
        
       
        
     // Locate and interact with elements
        try {
            // Find and click the "Enabled" checkbox
            WebElement enabledCheckbox = driver.findElement(By.id("Enabled"));
            enabledCheckbox.click();

            // Find and fill in the "Ribbon Name" textbox
            WebElement ribbonNameTextbox = driver.findElement(By.id("RibbonName"));
            ribbonNameTextbox.sendKeys("Sample Ribbon");

            // Find and fill in the "Priority" textbox
            WebElement priorityTextbox = driver.findElement(By.xpath("//input[@class='k-formatted-value k-input']"));
            priorityTextbox.sendKeys("5");

            // Find and fill in the "Product Ribbon Text" textbox
            WebElement productRibbonTextbox = driver.findElement(By.id("RibbonText"));
            productRibbonTextbox.sendKeys("New Arrival");

            // Find and select an option from the "Position" dropdown
            Select positionDropdown = new Select(driver.findElement(By.id("Position")));
            positionDropdown.selectByVisibleText("top-right");

            // Find and select an option from the "Ribbon Style" dropdown
            Select ribbonStyleDropdown = new Select(driver.findElement(By.id("RibbonStyle")));
            ribbonStyleDropdown.selectByValue("ribbon-default");
            
            WebElement saveAndContinuous = driver.findElement(By.xpath("(//button[@class='btn bg-blue'])[2]"));
            saveAndContinuous.click();
            
            // Perform additional actions, verifications, or submit the form as needed

        } catch (Exception e) {
            // Handle exceptions if any element is not found or the script encounters an error
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

