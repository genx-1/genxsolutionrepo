package GenX;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.sugarcrm.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Get a Demo']")).click();
        Thread.sleep(2000);
        WebElement requestbutton = driver.findElement(By.xpath("//input[@class='element-container my-2 btn btn-primary']"));
        Actions a = new Actions(driver);
        a.moveToElement(requestbutton).click();
        a.perform();
        Thread.sleep(3000);
        
        WebElement BusinessEmail = driver.findElement(By.xpath("//input[@class='element-container form-control mb-2 form-alert']"));
        BusinessEmail.sendKeys("surajmakke@gmail.com");
        WebElement Firstname = driver.findElement(By.xpath("(//input[@class='element-container form-control mb-2'])[1]"));
        Firstname.sendKeys("suraj");
        WebElement LastName = driver.findElement(By.xpath("(//input[@class='element-container form-control mb-2'])[2]"));
        LastName.sendKeys("makke");
        WebElement BusinessPhone = driver.findElement(By.xpath("(//input[@class='element-container form-control mb-2'])[3]"));
        BusinessPhone.sendKeys("9467678442");
        WebElement jobTitle = driver.findElement(By.xpath("(//input[@class='element-container form-control mb-2'])[4]"));
        jobTitle.sendKeys("Business Analyst");
        WebElement CompanyName = driver.findElement(By.xpath("(//input[@class='element-container form-control mb-2'])[5]"));
        CompanyName.sendKeys("sintex private LTD");
       // WebElement termandconditionCheckbox =  driver.findElement(By.xpath("//input[@type='checkbox']"));
       // termandconditionCheckbox.click();
        WebElement companysize = driver.findElement(By.xpath("//select[@class='element-container form-control mb-2']"));
        Select s1 = new Select(companysize);
        s1.selectByIndex(3);
     List<WebElement> options1 = s1.getOptions();
    int length1 = options1.size();
    System.out.println("Option in companysize dropdown " +length1 );
    Thread.sleep(3000);
        
  WebElement howYouKnow = driver.findElement(By.xpath("(//select[@class='element-container form-control mb-2'])[2]"));
        Select s = new Select(howYouKnow);
     List<WebElement> options = s.getOptions();
    int length = options.size();
    Thread.sleep(3000);
    		System.out.println("number of option in dropdown "+length);
     System.out.println(options);
     
     WebElement requestbutton1 = driver.findElement(By.xpath("//input[@class='element-container my-2 btn btn-primary']"));
     Actions a1 = new Actions(driver);
     a1.moveToElement(requestbutton1).click();
     a1.perform();
     Thread.sleep(3000);
     
     WebElement screen = driver.findElement(By.xpath("//div[@class='w-vulcan--background w-css-reset']"));
     Thread.sleep(4000);
     screen.click();
     
   
     WebElement Fullscreen = driver.findElement(By.xpath("//div[@data-handle='fullscreenButton']"));
     Fullscreen.click();
     WebElement volumeButton = driver.findElement(By.xpath("//div[@data-handle='fullscreenButton']"));
     volumeButton.click();
     WebElement volumesliderButton = driver.findElement(By.xpath("//div[@style='background: rgba(0, 0, 0, 0.8); border: 1.59375px solid rgb(255, 255, 255); border-radius: 50%; height: 40%; left: 50%; position: absolute; top: 50%; transform: translate(-50%, -50%); width: 40%;']"));
    // WebElement volumesliderButton1 = driver.findElement(By.xpath("//div[@style='background: rgba(0, 0, 0, 0.8); border: 1.59375px solid rgb(255, 255, 255); border-radius: 50%; height: 40%; left: 50%; position: absolute; top: 50%; transform: translate(-50%, -50%); width: 40%;']"));
     Actions a3 = new Actions(driver);
     a3.moveToElement(volumesliderButton).dragAndDrop(volumesliderButton, volumesliderButton);
     WebElement settingButton = driver.findElement(By.xpath("//div[@data-handle='settingsButton']"));
     volumeButton.click();
     WebElement qualityvalue = driver.findElement(By.xpath(" (//label[@class='w-css-reset'])[9]"));
     volumeButton.click();
     
     
     /*WebElement playButton = driver.findElement(By.xpath("//div[@style='box-sizing: border-box; height: 100%; margin-left: 0.796875px; padding: 7.96875px 0px 7.17188px; position: relative; width: 100%;']"));
     playButton.click();
     Thread.sleep(3000);
     WebElement playButton1 = driver.findElement(By.xpath("//div[@style='box-sizing: border-box; height: 100%; margin-left: 0.796875px; padding: 7.96875px 0px 7.17188px; position: relative; width: 100%;']"));
     playButton1.click();*/
     
     
     
     
     
     
	}

}
