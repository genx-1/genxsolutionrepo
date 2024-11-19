package genxsolutions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Bannerimage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40000));
        driver.get("https://vikiv45.retailhub-test.no/Admin/WidgetBanner/index");

        
        Thread.sleep(3000);
        WebElement emailid = driver.findElement(By.xpath("//input[@id='Email']"));
        emailid.sendKeys("store14@viki-test.no");
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("demo#QA123$");
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        Thread.sleep(2000);
        
        
        WebElement addButton = driver.findElement(By.xpath("//button[@id='add-widget']"));
        addButton.click();
        
        WebElement widgetZone = driver.findElement(By.xpath("//select[@id='Custom_WidgetZone']"));
       Select s1 = new Select(widgetZone);
       s1.selectByValue("home_page_main_slider");
        
       WebElement selectButton = driver.findElement(By.xpath("//button[@data-template-id='52']"));
       selectButton.click();
       
       
       WebElement NewsletterPopup = driver.findElement(By.xpath("//input[@id='newsletter-popup-subscribe-button']"));
       NewsletterPopup.click();
       
        
      /*  WebElement title = driver.findElement(By.xpath("//div[@id='banner-template-28-1698233247683-359-mce']"));
        WebElement colour = driver.findElement(By.xpath("//i[@class='fa fa-font']"));
        WebElement textcolour = driver.findElement(By.xpath("//div[@class='k-hsv-gradient']"));
        WebElement backgroundcolour = driver.findElement(By.id("//td[@style='background-color: rgb(0, 0, 0); width: 28px; height: 28px;']"));
       // title.click();
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        act.moveToElement(title).click();
        Thread.sleep(3000);
        act.moveToElement(title).click().moveToElement(colour).click().moveToElement(textcolour).click().build().perform();
       // WebElement colour = driver.findElement(By.xpath("//i[@class='fa fa-font']"));
        //colour.click();
        
        //WebElement backgroundcolour = driver.findElement(By.id("//td[@style='background-color: rgb(0, 0, 0); width: 28px; height: 28px;']"));
       // backgroundcolour.click();*/
        
        System.out.println("Komal");
        
        driver.close();
       
	}

}
