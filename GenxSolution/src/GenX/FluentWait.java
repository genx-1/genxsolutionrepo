package GenX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class FluentWait {

	public FluentWait(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//driver.manage().window().maximize();
		
        driver.get("https://www.ebay.com.au/");
        WebElement electrinics = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
        
        Actions a = new Actions(driver);
        a.moveToElement(electrinics).perform();
     FluentWait wait = new FluentWait(driver);
       wait.with
        
        
        
        
        
        
        
	}

}
