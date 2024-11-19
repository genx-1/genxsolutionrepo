package GenX;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class windowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.salesforce.com/au/");
        Thread.sleep(2000);
        //webelement is start my free trial
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[4]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/a")).click();
        Thread.sleep(4000);
        Set<String> getWindowHandles = driver.getWindowHandles();
        System.out.println(getWindowHandles);
       Iterator<String> iterator = getWindowHandles.iterator();
      String parentWindow = iterator.next();
      System.out.println(parentWindow);
      String childWindow = iterator.next();
      System.out.println(childWindow);
      
      driver.switchTo().window(childWindow);
      Thread.sleep(2000);
        driver.findElement(By.name("UserFirstName")).sendKeys("komal");
        Thread.sleep(2000);
        driver.findElement(By.name("UserLastName")).sendKeys("Makke");
        Thread.sleep(2000);
        driver.switchTo().window(parentWindow);
        Thread.sleep(2000);
        
        driver.close();
        
        
	}

}
