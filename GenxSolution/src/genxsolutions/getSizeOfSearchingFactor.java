package genxsolutions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class getSizeOfSearchingFactor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
        driver.get("https://vikiv45.retailhub-test.no/login?ReturnUrl=%2Fadmin");
        Thread.sleep(2000);
        	 
       /* WebElement popup = driver.findElement(By.xpath("//input[@id='newsletter-popup-email']"));
        popup.sendKeys("komal.makke@genxinfosolutions.com");
        WebElement clickbutton = driver.findElement(By.xpath("(//input[@type='button'])[2]"));
        clickbutton.click();
        Thread.sleep(4000);*/
        
        WebElement emailid = driver.findElement(By.xpath("//input[@id='Email']"));
        emailid.sendKeys("store14@viki-test.no");
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("demo#QA123$");
        WebElement clickbutton1 = driver.findElement(By.xpath("//button[@type='submit']"));
        clickbutton1.click();
        Thread.sleep(2000);
     
    
       
       WebElement IwillDoLaterButton = driver.findElement(By.xpath("//a[@id='btnWillDoItLater']"));
       IwillDoLaterButton.click();
       Thread.sleep(10000);
       
       WebElement catlog = driver.findElement(By.xpath("//i[@class='nav-icon fas fa-book']"));
       catlog.click();
       Thread.sleep(10000);
       WebElement Products = driver.findElement(By.xpath("(//i[@class='nav-icon far fa-dot-circle'])[1]"));
       Products.click();
       Thread.sleep(8000);
        
       WebElement categoryDropdown = driver.findElement(By.xpath("//select[@id='SearchCategoryId']"));
        Select s = new Select(categoryDropdown);
        List<WebElement> list = s.getOptions();
       System.out.println(list); 
      int countOfElement = list.size();
      System.out.println(countOfElement); 
      
      Thread.sleep(6000);  
      WebElement manufactureryDropdown = driver.findElement(By.xpath("//select[@id='SearchManufacturerId']"));
      Select s1 = new Select(manufactureryDropdown);
      List<WebElement> list1 = s1.getOptions();
     System.out.println(list1); 
    int countOfElement1 = list1.size();
    System.out.println(countOfElement1); 
  
    Thread.sleep(6000);  
    WebElement storeDropdown = driver.findElement(By.xpath("//select[@id='SearchStoreId']"));
    Select s2 = new Select(storeDropdown);
    List<WebElement> list2 = s2.getOptions();
   System.out.println(list2); 
  int countOfElement2 = list2.size();
  System.out.println(countOfElement2);     
        
  Thread.sleep(6000);  
  WebElement warehouseDropdown = driver.findElement(By.xpath("//select[@id='SearchWarehouseId']"));
  Select s3 = new Select(warehouseDropdown);
  List<WebElement> list3 = s3.getOptions();
 System.out.println(list3); 
int countOfElement3 = list3.size();
System.out.println(countOfElement3);      

   
Thread.sleep(6000);  
WebElement ProductTypeDropdown = driver.findElement(By.xpath("//select[@id='SearchProductTypeId']"));
Select s4 = new Select(ProductTypeDropdown);
List<WebElement> list4 = s4.getOptions();
System.out.println(list4); 
int countOfElement4 = list4.size();
System.out.println(countOfElement4);      

	}

}
