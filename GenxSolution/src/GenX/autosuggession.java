package GenX;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class autosuggession {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
        driver.get("https://www.makemytrip.com/");
        
        
        WebElement mobilenumber = driver.findElement(By.xpath("(//input[@data-cy='userName'])[1]"));
        mobilenumber.sendKeys("9542325661");
        WebElement continuousButton = driver.findElement(By.xpath("//button[@class='capText font16']"));
        continuousButton.click();
        
        
        
            /*     //login to account by using emailid/l
                 WebElement myTrip = driver.findElement(By.xpath("//div[@class='makeFlex column flexOne font10 latoBold']"));
                 myTrip.click();
        		 WebElement mybizAccount = driver.findElement(By.xpath("//li[@class='active']"));
        		 mybizAccount.click();
        		 WebElement mobileNo = driver.findElement(By.xpath("//input[@class='font14 fullWidth']"));
        		 mobileNo.sendKeys("madkepooja@gmail.com");
        		 WebElement continuebutton = driver.findElement(By.xpath("//button[@class='capText font16']"));
        	        continuebutton.click();
        	        
        	        
        	      //  WebElement name = driver.findElement(By.xpath("(//input[@data-cy='FormField_144'])[1]"));
        	     //   name.sendKeys("Madke Pooja");
        	        WebElement mobilenumber = driver.findElement(By.xpath("(//input[@data-cy='FormField_146'])[1]"));
        	        mobilenumber.sendKeys("9542325661");
        	        WebElement companyName = driver.findElement(By.xpath("(//input[@data-cy='FormField_146'])[1]"));
        	        companyName.sendKeys("9542325661");
        	        
        	    //provide other credentials    
        WebElement from = driver.findElement(By.xpath("//span[@class='headerOfferIcon__offericonCont']"));
        from.click();
        Thread.sleep(4000);
        //find search element
        WebElement frominput = driver.findElement(By.xpath("//input[@id='fromCity']"));
        Thread.sleep(2000);
        frominput.sendKeys("mumbai");
        Thread.sleep(4000);
       // find path for autosuggestion
        List<WebElement> frominputs = driver.findElements(By.xpath("//div[@id='react-autowhatever-1']"));
       //get size of autosuggestion
        		int length = frominputs.size();
        System.out.println(length);
        
        //to go to downword
        frominput.sendKeys(Keys.DOWN);
        Thread.sleep(4000);
        
        // to press enter key
        frominput.sendKeys(Keys.ENTER);
        System.out.println("komal");
        
        driver.quit();*/
        }

      }
