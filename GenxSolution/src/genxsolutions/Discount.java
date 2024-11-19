package genxsolutions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Discount {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.edge.driver","C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
	     WebDriver driver = new EdgeDriver();
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
			driver.get("https://vikiv45.retailhub-test.no/Admin/Discount/Edit/965");
			 Thread.sleep(3000);
			WebElement emailid = driver.findElement(By.xpath("//input[@id='Email']"));
	        emailid.sendKeys("store14@viki-test.no");
	        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
	        password.sendKeys("demo#QA123$");
	        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	        login.click();
	        Thread.sleep(3000);
	        
	        WebElement addNew = driver.findElement(By.xpath("//a[@class='btn bg-blue']"));
	        addNew.click();
	        
	        WebElement Name = driver.findElement(By.xpath("//input[@id='Name']"));
	        Name.clear();
	        Name.sendKeys("test2");
	        WebElement DiscountType = driver.findElement(By.xpath("//select[@id='DiscountTypeId']"));
	        Select s = new Select(DiscountType);
	      WebElement DiscountLable = driver.findElement(By.xpath(" //label[text()='Discount Source']"));
	       s.selectByIndex(2);
	         Thread.sleep(2000);
	         boolean result = (DiscountLable.isDisplayed());
	         boolean yes = false;
			if (result == yes){
	        	 System.out.println("Test get pass");
	         }
	        s.selectByIndex(5); 
	        boolean result1 = (DiscountLable.isDisplayed());
	         boolean yes1 = false;
			if (result1 == yes1){
	        	 System.out.println("Test get pass");
	         }
	       
	           Thread.sleep(2000);
	            s.selectByIndex(2);
	            boolean result3 = (DiscountLable.isDisplayed());
		         boolean yes3 = false;
				if (result3 == yes3){
		        	 System.out.println("Test get pass");
		         }
	             Thread.sleep(2000);
	              s.selectByIndex(3);
	              boolean result4 = (DiscountLable.isDisplayed());
			         boolean yes4 = false;
					if (result4 == yes4){
			        	 System.out.println("Test get pass");
			         }
	               Thread.sleep(2000);
	                s.selectByIndex(6);
	               
	                
	                
	                
	        Thread.sleep(2000);
	        WebElement DiscountSource = driver.findElement(By.xpath("//select[@id='SourceTypeId']"));
	         Select s1 = new Select(DiscountSource);
	        s1.selectByIndex(2);
	        Thread.sleep(2000);
	        s1.selectByIndex(1);
	        Thread.sleep(2000);
	        s1.selectByIndex(0);
	        Thread.sleep(2000);
	        
	        WebElement NumberOfIteration = driver.findElement(By.xpath("(//input[@class='k-formatted-value k-input'])[1]"));
	        NumberOfIteration.clear();
	        Thread.sleep(2000);
	        NumberOfIteration.sendKeys("1");
	        WebElement minimumQuantity = driver.findElement(By.xpath("(//input[@class='k-formatted-value k-input'])[2]"));
	        minimumQuantity.clear();
	        Thread.sleep(2000);
	        minimumQuantity.sendKeys("2");
	      //  WebElement UsePersantage = driver.findElement(By.xpath("//input[@id='UsePercentage']"));
	      //  UsePersantage.click();
	      //  WebElement DiscountPersantage = driver.findElement(By.xpath("(//input[@class='k-formatted-value k-input'])[3]"));
	      //  DiscountPersantage.clear(); 
	       // DiscountPersantage.sendKeys("100");
	        Thread.sleep(2000);
	        System.out.println("komal");
	        
	      
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
			
			
			
			
			
			
			
			
			
			
			
	}

}
