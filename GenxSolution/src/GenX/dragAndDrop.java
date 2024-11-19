package GenX;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://jqueryui.com/droppable/");
        Thread.sleep(4000);
        
       WebElement webElement = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
       driver.switchTo().frame(webElement);
        Thread.sleep(4000);
        WebElement drag = driver.findElement(By.id("draggable"));
        Thread.sleep(4000);
        WebElement drop = driver.findElement(By.id("droppable")); 
        Actions a = new Actions(driver);
        a.dragAndDrop(drag, drop).build().perform();
        Thread.sleep(6000);
        driver.close();
        Thread.sleep(20000);

	}

}
