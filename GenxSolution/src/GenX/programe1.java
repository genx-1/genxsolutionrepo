package GenX;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class programe1 {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("http://mayraflora.retailhub-test.no/login?ReturnUrl=%2Fadmin");

        
        
        WebElement emailid = driver.findElement(By.xpath("//input[@id='Email']"));
        emailid.sendKeys("mayra@gmail.com");
        Thread.sleep(6000);
        emailid.clear();
        Thread.sleep(6000);
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("12345");
        Thread.sleep(6000);
        password.clear();
        Thread.sleep(6000);
        WebElement clickbutton1 = driver.findElement(By.xpath("//button[@type='submit']"));
        clickbutton1.click();
        Thread.sleep(3000);
        WebElement cardTitlestep1 = driver.findElement(By.xpath("(//div[@class='card-title'])[1]"));
        String cardstep1 = cardTitlestep1.getText();
        System.out.println(cardstep1);
        Thread.sleep(1000);
	}
}
