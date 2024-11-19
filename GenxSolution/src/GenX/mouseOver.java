package GenX;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.ebay.com.au/");
        Thread.sleep(2000);
       // WebElement electrinics = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
        WebElement electrinics =  driver.findElement(By.className("hl-cat-nav__js-tab"));
        
        
        WebElement electronicSale = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"));
        Actions a = new Actions(driver);
        a.moveToElement(electrinics).perform();
        Thread.sleep(4000);
     //  a.moveToElement(electronicSale).click().perform();
      driver.close();
	}
}

