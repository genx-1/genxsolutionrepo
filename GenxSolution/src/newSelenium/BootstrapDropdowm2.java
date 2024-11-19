package newSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BootstrapDropdowm2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		// First we have to click on menu item then only dropdown items will display
        driver.findElement(By.xpath(".//*[@id='menu1']")).click();
		
        // Dropdown items are coming in <a> tag so below xpath will get all
        // elements and findElements will return list of WebElements
        List<WebElement> list = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li"));
		
        for (WebElement ele : list)
        {
      System.out.println(ele.getText());
		
		if (ele.getText().equals("JavaScript")) {
			
		//System.out.println("Testcast get pass");
		ele.click();
		break;
		//System.out.println("Testcast get pass");
		}
		
		
		
        }}	
}
