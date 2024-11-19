package genxsolutions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

          public class ProductCollectionBanner {
	      public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		  WebDriver driver = new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		  driver.get("https://vikiv45.retailhub-test.no/Admin");
	
		    Thread.sleep(3000);
	        WebElement emailid = driver.findElement(By.xpath("//input[@id='Email']"));
	        emailid.sendKeys("store14@viki-test.no");
	        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
	        password.sendKeys("demo#QA123$");
	        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	        login.click();
	        Thread.sleep(2000);
	       
	        WebElement login1 = driver.findElement(By.xpath("//a[@id='btnWillDoItLater']"));
	        login1.click();
	        Thread.sleep(2000);
	        WebElement contentmanagement = driver.findElement(By.xpath("(//i[@class='right fas fa-angle-left '])[6]"));
	        contentmanagement.click();
	        Thread.sleep(2000);
	        WebElement Websitebanner = driver.findElement(By.xpath("(//p[text()=' Website Banners'])"));
	        Websitebanner.click();
	        Thread.sleep(2000);
	        WebElement addnew = driver.findElement(By.xpath("//a[@class='btn bg-blue']"));
	        addnew.click();
	        Thread.sleep(2000);
	        WebElement select = driver.findElement(By.xpath("(//button[@class='btn btn-primary template-action'])[25]"));
	        select.click();
	        Thread.sleep(2000);
	       // WebElement title = driver.findElement(By.xpath("//div[@class='htmlwidget-image htmlwidget-centertext banner-widget-2308']"));
	       // title.sendKeys("new Product Collection");
	      //  Thread.sleep(2000);
	       // WebElement enableButton = driver.findElement(By.xpath("(//input[@checked='checked'])[1]"));
	        //enableButton.click();
	           // Thread.sleep(2000);  (//input[@class='check-box'])[5]
	        WebElement systemName = driver.findElement(By.xpath("(//input[@class='form-control text-box single-line'])[2]"));
	        systemName.sendKeys("new Product Collection");
	        Thread.sleep(2000);
	        WebElement defaultBanner = driver.findElement(By.xpath("(//input[@class='check-box'])[2]"));
	        defaultBanner.click();
	        Thread.sleep(2000);
	        WebElement WidthZone = driver.findElement(By.xpath("(//select[@class='form-control'])[2]"));
	        Select s = new Select(WidthZone);
	        s.selectByIndex(4);
	        Thread.sleep(2000);
	        WebElement BannerFullWidth = driver.findElement(By.xpath(" (//input[@class='check-box'])[3] "));
	        BannerFullWidth.click();
	        Thread.sleep(5000);
	        WebElement ProductCollection = driver.findElement(By.xpath("(//select[@class='form-control'])[2]"));
		    Select s2 = new Select(ProductCollection);
		     s2.selectByIndex(5);
		     Thread.sleep(3000);
		     WebElement DefaultLoadItem = driver.findElement(By.xpath("(//input[@class='k-formatted-value k-input'])[3]"));
		     DefaultLoadItem.click();
		     Thread.sleep(2000);
		     DefaultLoadItem.sendKeys("8");
		     Thread.sleep(2000);
		     WebElement EnableCarouseal = driver.findElement(By.xpath("(//input[@class='check-box'])[5]"));
		     EnableCarouseal.click();
		      Thread.sleep(2000);
		    //button[@id='save-continue']
		      WebElement saveAndContinuous = driver.findElement(By.xpath(" //button[@id='save-continue']"));
		      saveAndContinuous.click();
			     Thread.sleep(2000);
			     WebElement publicStore = driver.findElement(By.xpath("//a[text()='Public store']"));
			     publicStore.click();
				     Thread.sleep(2000);
			      
		      
	        
	     }	

       }
