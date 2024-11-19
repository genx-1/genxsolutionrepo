package GenX;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CollapsibleContentPanel {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50000));
        driver.get("https://jqueryui.com/resizable/");
        Thread.sleep(2000);
        
        //to select element outside frame
        driver.findElement(By.xpath("//a[text()='Accordion']")).click();
        
        WebElement webelement = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(webelement);
       
     // Find and click the first panel to expand it
        WebElement firstPanel = driver.findElement(By.xpath("//h3[@id='ui-id-1']"));
        firstPanel.click();

        
     // Extract text from the first panel
        String textFromFirstPanel = firstPanel.findElement(By.xpath("//p[text()[normalize-space() = 'Mauris mauris ante, blandit et, ultrices a, suscipit eget, quam. Integer ut neque. Vivamus nisi metus, molestie vel, gravida in, condimentum sit amet, nunc. Nam a nibh. Donec suscipit eros. Nam mi. Proin viverra leo ut odio. Curabitur malesuada. Vestibulum a velit eu ante scelerisque vulputate.']]")).getText();
        
        
     // Find and click the second panel to expand it
        WebElement secondPanel = driver.findElement(By.xpath("//h3[@id='ui-id-3']"));
        secondPanel.click();
        
        // Extract text from the second panel
        String textFromSecondPanel = secondPanel.findElement(By.xpath("//p[text()[normalize-space() = 'Sed non urna. Donec et ante. Phasellus eu ligula. Vestibulum sit amet purus. Vivamus hendrerit, dolor at aliquet laoreet, mauris turpis porttitor velit, faucibus interdum tellus libero ac justo. Vivamus non quam. In suscipit faucibus urna.']]")).getText();
        
        
     // Compare the text from both panels
        if (textFromFirstPanel.equals(textFromSecondPanel)) {
            System.out.println("The panels are the same.");
        } else {
            System.out.println("The panels are different.");
        }

        
        
        
	
}}
