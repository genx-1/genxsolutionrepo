package GenX;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			
	        driver.get("https://www.ebay.com.au/");
 WebElement home = driver.findElement(By.xpath("(//a[text()='Home & Garden'])[2]"));
 Actions a = new Actions(driver);
 a.moveToElement(home).perform();
 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Building Materials DIY']"))).click();
 driver.close();
 
 
 
	}

}
