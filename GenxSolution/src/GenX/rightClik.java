package GenX;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClik {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://jqueryui.com/slider/#colorpicker");
        Thread.sleep(2000);
        WebElement webElement = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(webElement);
         Thread.sleep(2000);
 WebElement rightClikElement = driver.findElement(By.xpath("//*[@id=\"swatch\"]"));
 Actions a = new Actions(driver);
a.contextClick(rightClikElement).perform();
	}

}
