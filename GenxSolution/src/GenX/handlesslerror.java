package GenX;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class handlesslerror {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType., false);
		//dc.setAcceptInsecureCerts(true);
		//EdgeOptions option = new EdgeOptions();
		//option.merge(dc);
		
		
		WebDriver driver = new EdgeDriver(option);
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		//WebDriver driver = new EdgeDriver();
        driver.get("https://expired.badssl.com/");
       // Thread.sleep(1000);

	}

}
