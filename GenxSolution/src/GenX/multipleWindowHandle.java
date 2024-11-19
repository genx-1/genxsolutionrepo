package GenX;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class multipleWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
       Set<String> windows = driver.getWindowHandles();
      Iterator<String> it = windows.iterator();
      String win [] = new String [2];
      for (int i=0; i<windows.size(); i++)
      {
    	  win [i] = it.next();
    	  System.out.println(win[i]);
      }
      driver.switchTo().window(win[0]);
      driver.close();  

      driver.switchTo().window(win[1]);
      Thread.sleep(30000);
      driver.manage().window().maximize();
      driver.close();   
	}

}
