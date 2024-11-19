package newSelenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class alertPopup {
	public static void main(String[] args) throws InterruptedException {
		 //System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		 System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]")).click();
		 Alert a = driver.switchTo().alert();
		 System.out.println(a.getText());//to get text which present on popup
		// a.accept();//accept popup
		 a.dismiss(); //cancel popup
		 //a.sendKeys(" ");// to enter any text in popup
		 driver.switchTo().defaultContent();//to nevigate browser on page
		 
		 
		 
	}
}
