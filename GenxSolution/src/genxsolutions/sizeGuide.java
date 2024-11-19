package genxsolutions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class sizeGuide {

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
        WebElement sizeguide = driver.findElement(By.xpath("(//i[@class='nav-icon far fa-dot-circle'])[27]"));
        sizeguide.click();
        
        
        
     // Click on "edit  Size Guide"
        driver.findElement(By.xpath("(//a[@class='btn btn-default'])[2]")).click();

        // Fill in the required information for creating a size guide
       
        
        
        
        
        
        
        String filepath = "C:\\Users\\Komal\\OneDrive\\Pictures\\flower-729512_.jpg";
       driver.findElement(By.xpath("//input[@title='file input']")).sendKeys(filepath);
        Thread.sleep(10000);
        
     // pictureUpload.sendKeys("C:\\Users\\Komal\\OneDrive\\Pictures.jpg");

    
        
        
        // Check the "Published" checkbox
        //driver.findElement(By.id("Published")).click();
        
        //To crop uploaded picture
        WebElement uploadedImage = driver.findElement(By.xpath("//img[@src='https://retailhub-cdn.azureedge.net/test-pictures/3313270_flower-729512__100.jpeg']"));
        int x = uploadedImage.getLocation().getX();
        int y = uploadedImage.getLocation().getY();
        int width = uploadedImage.getSize().getWidth();
        int height = uploadedImage.getSize().getHeight();

        
        
        
        
        
        
     // Select a manufacturer from the dropdown
        Select manufacturerDropdown = new Select(driver.findElement(By.id("ManufacturerId")));
        manufacturerDropdown.selectByVisibleText("Vero Moda"); // Replace with the desired manufacturer name


     // Select categories from the dropdown
        Select categoryDropdown = new Select(driver.findElement(By.id("CategoryId")));
        categoryDropdown.selectByVisibleText("Women >> Womens Clothing"); // Replace with the desired category name


        

        // Save the size guide
        driver.findElement(By.xpath("(//i[@class='fa fa-floppy-o'])[1]")).click();

        // Test Case 2: Edit an Existing Size Guide
        // Perform steps similar to Test Case 1, but navigate to an existing size guide for editing
        // ...

        // Test Case 3: Delete a Size Guide
        // Navigate to an existing size guide for deletion
        // ...

      /*  // Click on "Delete"
        driver.findElement(By.linkText("Delete")).click();

        // Confirm the deletion
        driver.switchTo().alert().accept();

        // Close the browser
        driver.quit();
    }
}
This script automates the test cases for creating, editing, and deleting a size guide in NOP Commerce. Make sure to replace the placeholders with the actual elements and URLs from your NOP Commerce instance. Also, ensure that you have the ChromeDriver executable and Selenium WebDriver set up in your project.


*/


	}}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	


