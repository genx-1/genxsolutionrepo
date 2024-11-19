package GenX;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://www.ebay.com.au/");
       WebElement motor = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a"));
       Actions a = new Actions(driver);
       a.moveToElement(motor).perform();
       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(7));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='My Garage']"))).click();

	}

}
