package newSelenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotPrograme2 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
	driver.get("https://www.amazon.com/");
	
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File desti = new File ("C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Screenshot" + "komal1" + ".png");
	
	FileHandler.copy(source, desti);
	driver.close();
	
	
	
	
	
}
}
