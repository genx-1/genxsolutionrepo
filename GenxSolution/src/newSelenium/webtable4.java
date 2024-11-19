package newSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class webtable4 {

	 public static void main(String[] args) throws InterruptedException {
		 //System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		 System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
		 driver.get("https://www.asx.com.au/markets/trade-our-cash-market/directory");
		 
	 int r = driver.findElements(By.xpath("//*[@id=\"results-container_3\"]/table/thead/tr")).size(); 
		System.out.println("Number of rows in table "+ r); 
	 int c = driver.findElements(By.xpath("//*[@id=\"results-container_3\"]/table/thead/tr/td")).size(); 	 
	 System.out.println("Number of rows in table "+ c); 
		 
		 
		 
		 
		 
		 
}}
