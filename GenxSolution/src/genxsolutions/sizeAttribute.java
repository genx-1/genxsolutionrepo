package genxsolutions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class sizeAttribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));
        driver.get("https://vikiv45.retailhub-test.no/Admin/Product/List?SearchProductName=P%C3%85%20STELL%20&SearchCategoryId=0&SearchManufacturerId=0&SearchStoreId=14&SearchWarehouseId=0&SearchProductTypeId=0&SearchPublishedId=0&StockQuantityId=0&TransferTypeId=-1&StockQtyX=2&Page=1&PageSize=15");

        Thread.sleep(3000);
        WebElement emailid = driver.findElement(By.xpath("//input[@id='Email']"));
        emailid.sendKeys("store14@viki-test.no");
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("demo#QA123$");
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        Thread.sleep(2000);
        		 WebElement edit = driver.findElement(By.xpath("(//a[@class='btn btn-default'])[3]"));
        		 edit.click();
        	        Thread.sleep(2000);
        	        WebElement ageAttribute = driver.findElement(By.xpath("(//input[@class='k-input k-readonly'])[1]"));
        	      Actions a = new Actions(driver);
        	      
				 a.moveToElement(ageAttribute).click().keyDown(ageAttribute, Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
				
        	        Thread.sleep(2000);
		
        	       
        	        WebElement patternAttribute = driver.findElement(By.xpath("//select[@id='Attribute_22']"));
		            Select s3 = new Select(patternAttribute); 
		            s3.selectByIndex(2);
		            Thread.sleep(2000);
		            WebElement lengthAttribute = driver.findElement(By.xpath(" (//div[@class='k-multiselect-wrap k-floatwrap'])[5]"));
		            Select s4 = new Select(lengthAttribute); 
		            s4.selectByIndex(2);
		            Thread.sleep(2000);
		
		
		
		
		
	}

}
