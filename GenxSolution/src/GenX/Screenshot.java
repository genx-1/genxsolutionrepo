package GenX;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		 Date currentDate = new Date();
		
		String Screenshotfilename = currentDate.toString().replace(" ", "-").replace(":","-");
		 System.out.println(Screenshotfilename);
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.amazon.com/");
        Thread.sleep(1000);
    File source =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    File desti = new File ("C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\" +"amazonimage"+ ".png");
    
    FileHandler.copy(source, desti);
    
    
	}

}
