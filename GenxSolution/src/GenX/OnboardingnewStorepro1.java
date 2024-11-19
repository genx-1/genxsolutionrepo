package GenX;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class OnboardingnewStorepro1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("http://plazo48.retailhub-test.no/Admin/NewAdminHome/SobCompanyInfomation");
        Thread.sleep(1000);
       // driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
 WebElement nork = driver.findElement(By.xpath("(//span[text()='Norsk'])[2]"));
 WebElement english = driver.findElement(By.xpath("//span[text()='English']"));
 Actions a = new Actions(driver);
 a.moveToElement(nork).click().perform();
 a.moveToElement(english).click().perform();
 
 WebElement Email = driver.findElement(By.xpath("//input[@id='Email']"));
 Email.sendKeys("komal.Plazo48@genxsolution.com	");
  WebElement Password = driver.findElement(By.xpath("//input[@id='Password']"));
  Password.sendKeys("12345");
  WebElement loginbutton = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
  loginbutton.click();

  
  WebElement CompanyName = driver.findElement(By.xpath("//input[@id='CompanyName']"));
  WebElement StreetAddress = driver.findElement(By.xpath("//input[@id='CompanyStreetAddress']"));
  WebElement postalCode = driver.findElement(By.xpath("//input[@id='CompanyPostalCode']"));
  WebElement City = driver.findElement(By.xpath("//input[@id='CompanyCity']"));
  WebElement phoneNumber = driver.findElement(By.xpath("//input[@id='CompanyPhoneNumber']"));
  WebElement Vat = driver.findElement(By.xpath("//input[@id='CompanyVat']"));
  WebElement saveAndContiButton = driver.findElement(By.xpath("//button[@id='btnSaveStep1']"));
  Thread.sleep(5000);
  
  
 WebElement Postnord = driver.findElement(By.xpath("(//input[@name='shipping-option'])[1]"));
 WebElement Bring = driver.findElement(By.xpath("(//input[@name='shipping-option'])[2]"));
 WebElement ownFright = driver.findElement(By.xpath("(//input[@name='shipping-option'])[3]"));
 WebElement saveAndContiButton1 = driver.findElement(By.xpath("//button[@id='btnSaveStep2']"));
 
 
 
 
 
	}

}
