package GenX;

import java.time.Duration;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;

public class jaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        Thread.sleep(2000);
      
        //To get PageTitle
       /*  JavascriptExecutor javaexe = (JavascriptExecutor) driver;
       String script = "return document.title;";
       String title = (String) javaexe.executeScript(script);
        System.out.println(title);*/
        
        //to get pageTitle
       /*JavascriptExecutor javaexe = (JavascriptExecutor) driver;
      String script = "return document.title;";
      String  title = (String) javaexe.executeScript(script);
        System.out.println(title);*/
        
        
        //to get url
        JavascriptExecutor javac = (JavascriptExecutor) driver;
     String script = "return document.URL;";
     String  url = (String) javac.executeScript(script);
       System.out.println(url); 
        
 // To highlight ant text using javaScriptExecutor
       driver.switchTo().frame("iframeResult");
       javac.executeScript("myFunction()");
       driver.switchTo().alert().accept();
     WebElement button = driver.findElement(By.xpath("//button[text()='Try it']"));
     javac.executeScript("arguments[0].style.background='yellow'",button);
       
       //String javascript = "document.getElementByxpath('//button[text()='Try it']').style.background='green'";  
       //JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
       //javac.executeScript(javascript);  
       
      // To scroll page 
       driver.navigate().to("https://www.w3schools.com/");
       WebElement search = driver.findElement(By.xpath("(//a[@class='ws-btn tut-button'])[1]"));
       javac.executeScript("arguments[0].scrollIntoView(true);", search);
          Thread.sleep(8000);
          driver.close();

	}

}
