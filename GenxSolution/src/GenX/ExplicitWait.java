package GenX;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://www.ebay.com.au/");
       
        WebElement electrinics = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
      
        Actions a = new Actions(driver);
        a.moveToElement(electrinics).perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
		 ("//a[text()='Electronic Sales']"))).click();
		 Thread.sleep(10000);
		 driver.close();

	}

}
