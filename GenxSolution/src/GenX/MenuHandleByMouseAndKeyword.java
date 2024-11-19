     package GenX;

        import java.time.Duration;

        import org.openqa.selenium.By;
        import org.openqa.selenium.Keys;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.edge.EdgeDriver;
        import org.openqa.selenium.interactions.Actions;

        public class MenuHandleByMouseAndKeyword {
	    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50000));
        driver.get("https://jqueryui.com/resizable/");
        Thread.sleep(2000);
        
        //to select element outside frame
        driver.findElement(By.xpath("//a[text()='Menu']")).click();
        
        WebElement webelement = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(webelement);
        
        // Locate the menu element that can be interacted with both mouse and keyboard
        WebElement menu = driver.findElement(By.id("menu"));

        // Locate the specific menu item you want to click
        WebElement menuItem1 = driver.findElement(By.id("ui-id-9"));
        WebElement menuItem2 = driver.findElement(By.id("ui-id-10"));
        WebElement menuItem3 = driver.findElement(By.id("ui-id-13"));
        
        WebElement menuItem4 = driver.findElement(By.id("ui-id-14"));
        WebElement menuItem5 = driver.findElement(By.id("ui-id-16"));
        

          // Create an instance of the Actions class
        Actions actions = new Actions(driver);

        
         // Hover over the menu item using the mouse
        actions.moveToElement(menu).moveToElement(menuItem1).build().perform();
        Thread.sleep(4000);
       actions.moveToElement(menuItem3).build().perform();
       Thread.sleep(4000);
       actions.sendKeys(Keys.DOWN).perform();
       
       actions.moveToElement(menuItem4).build().perform();
       actions.sendKeys(Keys.DOWN).perform();
       actions.sendKeys(Keys.DOWN).perform();
       actions.sendKeys(Keys.DOWN).perform();
       actions.click().build().perform();
       Thread.sleep(2000);
        
        // You can also simulate keyboard interactions to open the menu
        // For example, you can send the "DOWN" key to open the menu
       // actions.sendKeys(Keys.DOWN).perform();

         // actions.moveToElement(menuItem1).moveToElement(menuItem2).moveToElement(menuItem3).click().build().perform();
        // Click on the menu item
    

        // Perform other actions on the submenu if needed

        // Close the browser
       // driver.quit();
    }
}




        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

