package GenX;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class linkofPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.sugarcrm.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
        Thread.sleep(2000);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links of webpages "+links.size());
for (int i=0; i<links.size(); i++) {
	System.out.println("Total links of webpages "+links.get(i).getAttribute("href"));
	System.out.println("Total links of webpages "+links.get(i).getText());
}}}
	
	
