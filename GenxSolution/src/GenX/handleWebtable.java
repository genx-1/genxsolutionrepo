package GenX;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class handleWebtable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
        driver.get("https://www2.asx.com.au/");
       WebElement cookies = driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
       cookies.click();
     // WebElement button = driver.findElement(By.xpath("//*[@id=\"hotjar-survey-988d0f67-7286-41de-a0d8-1d3490b8aa23\"]/div/div/button"));
    //  button.click();
       Thread.sleep(6000);
        WebElement element = driver.findElement(By.xpath("//h5[@class='pn-ProductNav_Link cmp-tabs__tab gtm-tab cmp-tabs__tab--active']"));
        Actions a = new Actions(driver);
        a.moveToElement(element).click();
       // element.click();
        
      //*[@id="home_top_five"]/div/div[1]/div/div[1]/table/tr[4]/td[4]
	}

}
