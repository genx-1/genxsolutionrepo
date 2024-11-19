package newSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class selectdropdown1 {
public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
	
	
	
	
	
	
	
	
	
	
	//System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
//WebDriver driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
 driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");

 
 driver.switchTo().frame("iframeResult");
WebElement drop = driver.findElement(By.xpath("//*[@id=\"cars\"]"));
Select s = new Select(drop);
//s.selectByIndex(2);
//s.selectByVisibleText("Audi");
s.selectByValue("saab");
Thread.sleep(5000);
s.deselectByValue("saab");











}
}
