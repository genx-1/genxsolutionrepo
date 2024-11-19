package genxsolutions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PaymentFlowWithVIPPS {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.get("https://vikiv45.retailhub-test.no/login");
        
        Thread.sleep(3000);
        WebElement emailid = driver.findElement(By.xpath("//input[@id='Email']"));
        emailid.sendKeys("store14@viki-test.no");
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("demo#QA123$");
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        Thread.sleep(2000);
        
        WebElement womenClothing = driver.findElement(By.xpath("(//span[text()='Women'])[1]"));
        Actions a4 = new Actions(driver);
        a4.moveToElement(womenClothing).click().build().perform();
        Thread.sleep(4000);
        WebElement image = driver.findElement(By.xpath("(//img[@itemprop='image'])[4]"));
        image.click();
       
        
        WebElement size = driver.findElement(By.xpath("//select[@id='product_attribute_350615_0']"));
        Select s = new Select(size);
        s.selectByIndex(1);
        
        WebElement addToCartButton = driver.findElement(By.xpath("//button[@id='add-to-cart-button-932047']"));
        addToCartButton.click();
        
        WebElement GoToCartButton = driver.findElement(By.xpath("//input[@value='Go to cart']"));
        GoToCartButton.click(); 
        
        WebElement CheckoutButton = driver.findElement(By.xpath("//button[@id='checkout']"));
        CheckoutButton.click(); 
        
        WebElement MyPackCollect = driver.findElement(By.xpath("(//span[@class='checkmark'])[5]"));
        MyPackCollect.click(); 
        
}}
