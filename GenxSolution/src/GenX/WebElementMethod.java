package GenX;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElementMethod {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	        driver.get("https://www.sugarcrm.com/");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
	        
	        System.out.println(driver.findElement(By.xpath("(//a[text()='Get A Demo'])[3]")).getAttribute("class")) ;
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("(//a[text()='Get A Demo'])[3]")).click();
	       
	        Thread.sleep(3000);
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getCssValue("color")); 
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getLocation());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getSize()) ;
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isDisplayed());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isEnabled());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isSelected());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getText());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getTagName());
	        
	        
	}
}
