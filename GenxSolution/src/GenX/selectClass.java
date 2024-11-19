package GenX;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.sugarcrm.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[text()='Get A Demo'])[3]")).click();
        Thread.sleep(2000);
        WebElement howfindus = driver.findElement(By.name("awareness_source_c"));
        Select s = new Select(howfindus);
        s.selectByIndex(2);
        Thread.sleep(2000);
        /*s.selectByValue("YouTube");
        Thread.sleep(2000);
        s.selectByVisibleText("Internet");
        Thread.sleep(2000);
       // s.deselectAll();
       // System.out.println( s.getAllSelectedOptions());*/
      
     List<WebElement> elements = s.getOptions();
     int length = elements.size();
        System.out.println( length);
        
	}

}
