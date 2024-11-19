package genxsolutions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DiscountForCategory1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15000));
		try {
        driver.get("https://vikiv45.retailhub-test.no/login?ReturnUrl=/Admin/");
        
      
         WebElement ele1 = driver.findElement(By.xpath("//span[@id='https://vikiv45.retailhub-test.no/changelanguage/2?returnUrl=%2Flogin%3FReturnUrl%3D%2FAdmin%2F']"));
        Actions a = new Actions(driver);
        a.moveToElement(ele1).click().build().perform();
        
        
        WebElement ele2 = driver.findElement(By.xpath("//span[@class='selected']"));
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
        
        //open discount page
        WebElement adminbutton = driver.findElement(By.id("btnWillDoItLater"));
        adminbutton.click();
        WebElement pramotions = driver.findElement(By.xpath("//i[@class='nav-icon fas fa-tags']"));
        pramotions.click();
        WebElement Discount = driver.findElement(By.xpath("//a[@href='/Admin/Discount/List']"));
        Discount.click();
        
        
        
        // Click on the Add New button to add a new discount
        WebElement addNewDiscountButton = driver.findElement(By.xpath("//a[@class='btn bg-blue']"));
        addNewDiscountButton.click();

        // Fill in the Discount Name textbox
        WebElement discountName = driver.findElement(By.id("Name"));
        discountName.sendKeys("My Discount");

        // Select Discount Type from the dropdown
        Select discountTypeDropdown = new Select(driver.findElement(By.id("DiscountTypeId")));
        discountTypeDropdown.selectByVisibleText("Assigned to categories"); // Replace with the desired option

       

        // Check the "Use Percentage" checkbox
        WebElement usePercentageCheckbox = driver.findElement(By.id("UsePercentage"));
        usePercentageCheckbox.click();
        
     // Fill in the discount percentage textbox
        WebElement discountPercentage = driver.findElement(By.xpath("(//input[@class='k-formatted-value k-input'])[4]"));
        String discountValue = "50";
        discountPercentage.sendKeys(discountValue); // Replace with the desired code

        
        // Check the "Require coupon code" checkbox
        WebElement requireCouponCodeCheckbox = driver.findElement(By.id("RequiresCouponCode"));
        requireCouponCodeCheckbox.click();
        
        

        // Fill in the Coupon code textbox
        WebElement couponCode = driver.findElement(By.id("CouponCode"));
        couponCode.sendKeys("test 50"); // Replace with the desired code

        // Select Discount Limitation from the dropdown
        Select discountLimitationDropdown = new Select(driver.findElement(By.id("DiscountLimitationId")));
        discountLimitationDropdown.selectByVisibleText("N times per customer"); // Replace with the desired option

        // Save the discount
        WebElement saveAndContinuousButton = driver.findElement(By.xpath("//button[@name='save-continue']"));
        saveAndContinuousButton.click();

  
   //to add categories or handle multiple windows
   WebElement addCategory = driver.findElement(By.xpath("//button[@id='btnAddNewCategory']"));
   addCategory.click();
   
   Set<String> windows = driver.getWindowHandles();
   Iterator<String> it = windows.iterator();
   String win [] = new String [2];
   for (int i=0; i<windows.size(); i++)
   {
 	  win [i] = it.next();
 	  System.out.println(win[i]);
   }
   driver.switchTo().window(win[0]);
   driver.close();  

   //to handle second window perform operation on it
   driver.switchTo().window(win[1]);
   Thread.sleep(30000);
   driver.manage().window().maximize();
  WebElement checkbox = driver.findElement(By.xpath("(//input[@name='SelectedCategoryIds'])[1]"));
		   checkbox.click();
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   WebElement saveButton = driver.findElement(By.xpath("//button[@type='submit']")); 
		   saveButton.click();
          driver.close();
  
  
		   WebElement saveAndContinuousButton1 = driver.findElement(By.xpath("//a[text()='back to discount list']"));
		   saveAndContinuousButton1.click();
		   }
		  // driver.close();
   
/*// Locate all the rows in the table
   WebElement table = driver.findElement(By.id("categories-grid_wrapper"));
   java.util.List<WebElement> rows = table.findElements(By.tagName("tr"));

   // Iterate through each row in the table
   for (WebElement row : rows) {
       // Locate the checkbox, category name, and Published columns in each row
       WebElement checkbox = row.findElement(By.xpath("(//input[@class='mastercheckbox'])[1]"));
       WebElement categoryName = row.findElement(By.xpath("(//th[@class='sorting_disabled'])[1]"));
      // WebElement published = row.findElement(By.xpath("(//th[@class='sorting_disabled text-center'])[2]"));

       // Extract the text from the category name and published columns
       String categoryText = categoryName.getText();
       

       // Check the checkbox for a category if it meets your criteria
       if (categoryText.equals("Women") ) {
           checkbox.click();*/
           
       catch(NoSuchWindowException e) {
   System.out.println("Caught NoSuchWindowException: "+ e.getMessage());
       }
		finally {
			driver.quit();
		}
   // Close the WebDriver
   //driver.quit();  
        
   }   
}     
        
        
        
