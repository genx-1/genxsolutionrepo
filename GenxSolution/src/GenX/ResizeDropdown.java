package GenX;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://jqueryui.com/resizable/");
        Thread.sleep(2000);
        WebElement webElement = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(webElement);
         Thread.sleep(2000);
 WebElement resizeElement = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
 Actions a = new Actions(driver);
 a.dragAndDropBy(resizeElement, 200, 100);
 Thread.sleep(2000);
 driver.close();
 
	}

}
