package genxsolutions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CartforFreeShipping {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500000));
        driver.get("https://vikiv45.retailhub-test.no/login");

        
        Thread.sleep(3000);
        WebElement emailid = driver.findElement(By.xpath("//input[@id='Email']"));
        emailid.sendKeys("store14@viki-test.no");
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("demo#QA123$");
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        Thread.sleep(2000);
        
        WebElement womenClothing = driver.findElement(By.xpath("(//a[@class='with-subcategories'])[14]"));
        //womenClothing.click();
       // WebElement image = driver.findElement(By.xpath("(//img[@title='Show details for Vårjakke - Blue'])[2]"));
        Actions a4 = new Actions(driver);
        a4.moveToElement(womenClothing).click().build().perform();
        Thread.sleep(2000);
        WebElement image = driver.findElement(By.xpath("(//img[@title='Show details for DRESSKJORTE PENSKJORTE, FINSKJORTE'])[1]"));
        Thread.sleep(2000);
        Actions aa = new Actions(driver);
        aa.moveToElement(image).click().build().perform();
        Thread.sleep(2000);
        //image.click();
        //Thread.sleep(2000);
        WebElement size = driver.findElement(By.xpath("//select[@id='product_attribute_350620_0']"));
        Select s = new Select(size);
        s.selectByValue("2188186");
        Thread.sleep(4000);
        WebElement addToCartButton = driver.findElement(By.xpath("//button[@id='add-to-cart-button-931758']"));
        addToCartButton.click();
        Thread.sleep(4000);
        WebElement gotocartButton = driver.findElement(By.xpath("//input[@class='button-1 productAddedToCartWindowCheckout']"));
        gotocartButton.click();
        //gotocartButton.getText();
       // System.out.println(gotocartButton);
       // Thread.sleep(2000);
        
        
        
        
        
        
        //WebElement GoToCartButton = driver.findElement(By.xpath("//input[@value='Go to cart']"));
        gotocartButton.click(); 
     
        Thread.sleep(2000);
       /* WebElement  TotalAmount = driver.findElement(By.xpath("(//div[@class='right-amount'])[1]"));
        System.out.println(TotalAmount.getText());
        String s1 = TotalAmount.getText();
        String s2 = s1.replaceAll("[^0-9]","");
        System.out.println(s2);
        Thread.sleep(5000);
        int s21 = Integer.parseInt(s2);
        Thread.sleep(5000);
        WebElement    TotalAmountWithDiscount = driver.findElement(By.xpath("(//div[@class='right-amount'])[4]"));       
        System.out.println(TotalAmountWithDiscount.getText());
        String s12 = TotalAmountWithDiscount.getText();
        String s13 = s12.replaceAll("[^0-9]","");
        System.out.println(s13);
        int s33 = Integer.parseInt(s13);
        Thread.sleep(2000);
        
        if (s21 > s33) {
        	System.out.println("Customer get discount");
        }
        
        else {
        	System.out.println("Customer not get discount");
        }*/
         }}

	
	


