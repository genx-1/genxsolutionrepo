package GenX;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class authonticationpopup {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
   driver.get("https://komalmakke@gmail.com:Komal@12345@the-internet.herokuapp.com/basic_auth");
    Thread.sleep(1000);
    //driver.get("https://username:password @the-internet.herokuapp.com/basic_auth");
 //to handle authontication popup you have to make following changes in url
    //You have to put Username and password
    //original URL = https://the-internet.herokuapp.com/basic_auth
  //new URL = https://username:password@the-internet.herokuapp.com/basic_auth

	}

}
