package genxsolutions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollingVikiPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		try {
		driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
		driver.get("https://vikiv45.retailhub-test.no");
        driver.manage().window().maximize();
        
        try {
        //get javascript executor instance
        JavascriptExecutor js =  (JavascriptExecutor) driver;
        
        //scroll the page bottom of the page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        
     // Add a wait to observe the scrolling (you can use WebDriverWait or Thread.sleep)
        Thread.sleep(10000);
        
        //scroll back to top of the page
        js.executeAsyncScript("window.scrollTo(0,0)");
        
        Thread.sleep(3000);
        }catch(org.openqa.selenium.ScriptTimeoutException e) {
        	 System.err.println("Caught ScriptTimeoutException: " + e.getMessage());
        }
        
	}catch(InterruptedException  e) {
		 e.printStackTrace();
	}
        finally {
        	driver.quit();
        }
	}

}
