package newSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class iframe1 {
	public static void main(String[] args) throws InterruptedException {
		 //System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		 System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		 driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		 driver.switchTo().frame("content");
		WebElement text = driver.findElement(By.xpath("/html/body/p[4]/a"));
		 
		 System.out.println(text.getText());
		 driver.switchTo().parentFrame();
		// driver.switchTo().defaultContent();
		 
		 
		 
		 
		 
		 
		 
	}
}
