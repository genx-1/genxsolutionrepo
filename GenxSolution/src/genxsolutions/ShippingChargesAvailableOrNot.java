package genxsolutions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ShippingChargesAvailableOrNot {

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
        Thread.sleep(2000);
        WebElement image = driver.findElement(By.xpath("(//img[@itemprop='image'])[5]"));
        image.click();
        Thread.sleep(2000);
        WebElement size = driver.findElement(By.xpath("//select[@id='product_attribute_349878_0']"));
        Select s = new Select(size);
        s.selectByIndex(1);
        Thread.sleep(2000);
        WebElement addToCartButton = driver.findElement(By.xpath("//button[@id='add-to-cart-button-927632']"));
        addToCartButton.click();
        Thread.sleep(2000);
        WebElement GoToCartButton = driver.findElement(By.xpath("//input[@value='Go to cart']"));
        GoToCartButton.click(); 
        
        WebElement chargesText = driver.findElement(By.xpath("//div[text()='Shipping']"));
        WebElement chargesValue = driver.findElement(By.xpath("(//div[@class='right-amount'])[3]"));
        System.out.println(chargesValue.getText());
        String s1 = chargesValue.getText();
        Thread.sleep(2000);
        String s2 = s1.replaceAll("[^0-9]","");
        System.out.println(s2);
        int  charges = Integer.parseInt(s2);
       // int  charges = Integer.parseInt(s3);
      //  String s3 = s2.replaceAll("[^,]",".");
        System.out.println(charges);
        
        
        
        
        boolean textvalue = chargesText.isDisplayed();
        if (textvalue == true) {
        if (charges > 0) {
        	System.out.println("Chrges get apply for order");
        }
        else 
        {
        	System.out.println("Chrges not get apply for order");
        }
        }
        else {
        	System.out.println("Chrges not get apply for order");
        }
        
/*WebElement cartQuantity = driver.findElement(By.xpath("//span[@class='cart-qty']"));
        System.out.println(cartQuantity.getText());
        String QuantityOfItem = cartQuantity.getText();
       // String s2 = s1.replaceAll("[^0-9]","");
       // System.out.println(s2);
        Thread.sleep(2000);
        int  itemQuantity = Integer.parseInt(QuantityOfItem);
        if (itemQuantity > 0) {
        	System.out.println("Product added into cart");
        }
        else {
        	System.out.println("Cart is empty ");
        }*/
	
 }}
