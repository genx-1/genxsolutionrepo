package GenX;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectClass1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
       // Thread.sleep(1000);
       // driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
      //  Thread.sleep(2000);
     //   driver.findElement(By.xpath("(//a[text()='Get A Demo'])[3]")).click();
        Thread.sleep(8000);
         WebElement daytrial = driver.findElement(By.xpath("(//div[@class='margin-20-bottom-lg hidden-xs text-size-default line-height-default  col-sm-11 col-md-11 col-lg-11   no-indentation'])[1]"));
         String ele = daytrial.getText();
         System.out.println(ele);
         WebElement termandcondition = driver.findElement(By.xpath("(//div[@class='checkbox-ui-label'])[1]"));
         String ele1 = termandcondition.getText();
         System.out.println(ele1);
         
        //Select s = new Select(employid);
         WebElement firstname = driver.findElement(By.id("UserFirstName-bBte"));
         firstname.sendKeys("komal");
        //Select s = new Select(employid);
      //  s.selectByIndex(2);
        Thread.sleep(2000);
    //   List<WebElement> elements = s.getOptions();
     //  System.out.println(elements.size());
	}

}
