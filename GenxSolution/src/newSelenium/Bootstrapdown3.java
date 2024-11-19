package newSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Bootstrapdown3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300000));
	driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='ZFr60d CeoRYc'])[1]")).click();
	
	
	/*driver.findElement(By.id("menu1")).click();
	
   List<WebElement> list = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li"));
	
	
	
	
	for( WebElement ele : list) {
		System.out.println(ele.getText());
		
		if(ele.getText().equals("JavaScript")) {
			ele.click();
			break;
		}
		
	}
	System.out.println("Testcase get pass");*/
}
}
