    package GenX;

   import java.time.Duration;

   import org.openqa.selenium.By;
   import org.openqa.selenium.WebDriver;
   import org.openqa.selenium.WebElement;
   import org.openqa.selenium.edge.EdgeDriver;
   //correct ready to practice
    public class alertJavaProg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
     WebDriver driver = new EdgeDriver();
     driver.manage().window().maximize();
     driver.manage().deleteAllCookies();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
     driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
    
    //first on to iframe
     driver.switchTo().frame("iframeResult");
     Thread.sleep(1000);
   // perform action on elememt of iframe
      WebElement TryItButton = driver.findElement(By.xpath("//button[text()='Try it']"));
      TryItButton.click();
     Thread.sleep(3000);
    //accept or dissmiss alert
     driver.switchTo().alert().accept();
     Thread.sleep(2000);
		//go to parent frame
		driver.switchTo().parentFrame();
		// perform action on parent frame
		String text2 = driver.findElement(By.xpath("//a[@id='getwebsitebtn']")).getText();
		System.out.println(text2);
		driver.close();
	}

}
