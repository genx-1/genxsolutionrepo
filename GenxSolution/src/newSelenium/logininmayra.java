package newSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class logininmayra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60000));
        driver.get("http://mayraflora.retailhub-test.no/login?ReturnUrl=%2Fadmin");
        
        WebElement emailid = driver.findElement(By.xpath("//input[@id='Email']"));
        emailid.sendKeys("mayra@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("12345");
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        Thread.sleep(9000);
        WebElement welcomeToRetailhub = driver.findElement(By.xpath("//font[text()='Welcome to Retailhub']"));
        String welcomeText = welcomeToRetailhub.getText();
    
        System.out.println(welcomeText);
        Thread.sleep(2000);
        
        
        
        
        
        
        
        
}}
