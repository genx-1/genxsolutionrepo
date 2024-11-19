package GenX;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class webdrivermethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000);
        
        WebElement emailid = driver.findElement(By.id("user-name"));
        emailid.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        WebElement clickbutton1 = driver.findElement(By.id("login-button"));
        clickbutton1.click();
        Thread.sleep(2000);
         List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"inventory_container\"]/div"));
        System.out.println(elements);
        driver.navigate().to("https://www.sugarcrm.com/");
        String getwindowhandle = driver.getWindowHandle();
        System.out.println(getwindowhandle);
        
      driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
      driver.findElement(By.xpath("(//a[text()='Get A Demo'])[3]")).click(); 
      Thread.sleep(1000);
     /* WebElement email = driver.findElement(By.name("email"));
      emailid.sendKeys("sintex@gmail.com");
      WebElement firstname = driver.findElement(By.name("firstname"));
      firstname.sendKeys("Pooja");
      WebElement lastname = driver.findElement(By.name("lastname"));
      lastname.sendKeys("Madke");
      WebElement phone_work = driver.findElement(By.name("phone_work"));
      phone_work.sendKeys("9022567856");
      WebElement title = driver.findElement(By.name("title"));
      title.sendKeys("Tester");
      WebElement account_name = driver.findElement(By.name("account_name"));
      account_name.sendKeys("Sintex");
      WebElement employees_c = driver.findElement(By.name("employees_c"));
      employees_c.sendKeys("500");
      
      WebElement awareness_source_c = driver.findElement(By.name("awareness_source_c"));
      Select s = new Select(awareness_source_c);
      s.deselectByIndex(2);
      Thread.sleep(2000);
       //awareness_source_c.sendKeys("standard_user");
      WebElement doi = driver.findElement(By.name("doi"));
      doi.click();
      Thread.sleep(2000);
      WebElement button = driver.findElement(By.xpath("//input[@class='element-container my-2 btn btn-primary']"));
      button.click(); */
      System.out.println("komal");
      Set<String> getWindowHandles = driver.getWindowHandles();
        System.out.println(getWindowHandles);
       }

}
