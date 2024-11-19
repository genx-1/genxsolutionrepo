package GenX;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ketboardOperation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://extendsclass.com/text-compare.html");
        Thread.sleep(2000);
WebElement sourceArea = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div"));
Actions a = new Actions(driver);
a.keyDown(sourceArea, Keys.CONTROL).sendKeys("a").sendKeys("c").perform();
WebElement destinationeArea = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]"));
a.keyDown(destinationeArea, Keys.CONTROL).sendKeys("a").sendKeys("v").perform();
	}
	}


