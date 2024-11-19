package genxfunctionality;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class discountOfFrontSide {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15000));
		 driver.get("https://vikiv45.retailhub-test.no/login");
	        
	        Thread.sleep(3000);
	        WebElement emailid = driver.findElement(By.xpath("//input[@id='Email']"));
	        emailid.sendKeys("store14@viki-test.no");
	        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
	        password.sendKeys("demo#QA123$");
	        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	        login.click();
	        Thread.sleep(2000);
	        
	        WebElement womenClothing = driver.findElement(By.xpath("(//span[text()='Women'])[1]"));
	        Actions a4 = new Actions(driver);
	        a4.moveToElement(womenClothing).click().build().perform();
	        Thread.sleep(4000);
	        WebElement image = driver.findElement(By.xpath("(//img[@title='Show details for NEW FLEXIBLE PRODUCT'])[1]"));
	        image.click();
	      //span[@class='price old-price']
	        
	        WebElement oldprice = driver.findElement(By.xpath("//span[@class='price old-price']"));
	        WebElement newprice = driver.findElement(By.xpath("(//span[@class='price actual-price'])[6]"));
	}

}
