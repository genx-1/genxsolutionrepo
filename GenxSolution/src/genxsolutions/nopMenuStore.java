package genxsolutions;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class nopMenuStore {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.get("https://vikiv45.retailhub-test.no/Admin/NopMenu/List");

        Thread.sleep(3000);
        WebElement emailid = driver.findElement(By.xpath("//input[@id='Email']"));
        emailid.sendKeys("store14@viki-test.no");
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("demo#QA123$");
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        Thread.sleep(2000);
	
       
        WebElement AddNewMenuItem = driver.findElement(By.xpath("//i[@class='fa fa-plus-square']"));
        AddNewMenuItem.click();
        Thread.sleep(2000);
      
        WebElement title = driver.findElement(By.xpath("//input[@id='Title']"));
        title.clear();
        Thread.sleep(3000);
        title.sendKeys("VIKINOPMENU");
        Thread.sleep(2000);
        WebElement widgetZone = driver.findElement(By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']"));
        Actions a = new Actions(driver);
        a.moveToElement(widgetZone).perform();
         
        
        a.moveToElement(widgetZone).sendKeys(widgetZone, Keys.ARROW_DOWN ,Keys.ENTER).click().build().perform();
       
        
        
        
        
        
        //Select s1 = new Select(widgetZone);
        //s1.selectByValue("custommenu_topmenu");
        //AddNewMenuItem.click();
        Thread.sleep(2000);
        WebElement saveAndContinuousButton = driver.findElement(By.xpath("//button[@name='save-continue']"));
        saveAndContinuousButton.click();
        
       
        
        WebElement MenuItem = driver.findElement(By.xpath("//a[text()='Menu Items']"));
        MenuItem.click();
        Thread.sleep(3000);
        WebElement AddNewItem = driver.findElement(By.xpath("//a[text()='Add new menu item']"));
        AddNewItem.click();
        Thread.sleep(5000);
        //WebElement AddNewItem1 = driver.findElement(By.xpath("//a[text()='Add new menu item']"));
       // AddNewItem1.click();
        //Thread.sleep(4000);
        WebElement linkType = driver.findElement(By.xpath("//select[@id='LinkType']"));
        Select s2 = new Select(linkType);
       s2.selectByValue("3");
       WebElement saveButton = driver.findElement(By.xpath("//input[@id='btnMenuItem']"));
       saveButton.click();
       Thread.sleep(2000);
       WebElement saveAndContinuouseButton = driver.findElement(By.xpath("(//button[@class='btn bg-blue'])[2]"));
       saveAndContinuouseButton.click();
       Thread.sleep(2000);
       WebElement backToCustomMenu = driver.findElement(By.xpath("//a[text()='Back to Custom Menus']"));
       backToCustomMenu.click();
    		   WebElement menuTitle = driver.findElement(By.xpath("(//td[@role='gridcell'])[1]"));
    		  String text = menuTitle.getText();
    		  //String text1 = title.getText();
	if (text.equals("VIKINOPMENU")){
		System.out.println("Nop Menu created successfully");
	}
	else {
		System.out.println("Nop Menu not created successfully");
	}
	Thread.sleep(9000);
	 WebElement editButton = driver.findElement(By.xpath("//a[@class='btn btn-default']"));
	 editButton.click();
    Thread.sleep(3000);
	
     WebElement deleteButton = driver.findElement(By.xpath("//span[@id='posimporttemplate-delete']"));
     deleteButton.click();
 
     
     WebElement deleteButtonOnPopup = driver.findElement(By.xpath("//button[@class='btn btn-danger float-right']"));
     deleteButtonOnPopup.click();

}}
