package newSelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class authonticationPopup {
	public static void main(String[] args) throws InterruptedException {
		 //System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		 System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
		 
		 //for authontication popup
		String username = "admin";
		 String password = "admin";
		 String url = "https://" + username + ":"+ password + "@the-internet.herokuapp.com/basic_auth"; 
		 driver.get(url);
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
