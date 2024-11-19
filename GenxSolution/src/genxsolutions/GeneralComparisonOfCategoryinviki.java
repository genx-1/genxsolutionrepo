package genxsolutions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class GeneralComparisonOfCategoryinviki {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
	     WebDriver driver = new EdgeDriver();
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
			driver.get("https://demo1v45.retailhub-test.no/Admin/");
			 Thread.sleep(3000);

			/* WebElement popup = driver.findElement(By.xpath("//input[@id='newsletter-popup-email']"));
		        popup.sendKeys("komal.makke@genxinfosolutions.com");
		        WebElement clickbutton = driver.findElement(By.xpath("(//input[@type='button'])[2]"));
		        clickbutton.click();
		        Thread.sleep(4000);*/
		     
		        
		      /* WebElement ele1 = driver.findElement(By.xpath("//span[@class='activeSelect']"));
		       Actions a = new Actions(driver);
		       a.moveToElement(ele1).click().build().perform();
		       
		       
		       WebElement ele2 = driver.findElement(By.xpath("(//span[@style='display: block;'])[2]"));
		       Actions a1 = new Actions(driver);
		       a1.moveToElement(ele2).click().build().perform();
		       
		      
		     WebElement account = driver.findElement(By.xpath("//a[@class='ico-login']"));
		       account.click();
		       Thread.sleep(2000);*/
		       WebElement emailid = driver.findElement(By.xpath("//input[@id='Email']"));
		       emailid.sendKeys("store14@viki-test.no");
		       WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
		       password.sendKeys("demo#QA123$");
		       WebElement clickbutton1 = driver.findElement(By.xpath("//button[@type='submit']"));
		       clickbutton1.click();
		       Thread.sleep(2000);
			 
	}

}
