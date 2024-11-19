package GenX;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SortingOfElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50000));
        driver.get("https://jqueryui.com/resizable/");
        Thread.sleep(2000);
        
        //to select element outside frame
        driver.findElement(By.xpath("//a[text()='Sortable']")).click();
        
        WebElement webelement = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(webelement);
       
     // Find the list of sortable elements
        List<WebElement>  sortableElements = (List<WebElement>) driver.findElement(By.xpath("//ul[@id='sortable']/li"));
	
	
     // Create a list to store the text of sortable elements
        List<String> elementTexts = new ArrayList<>();
        for (WebElement element : sortableElements) {
            elementTexts.add(element.getText());
        }
	
     // Sort the elements' text
        Collections.sort(elementTexts);
	
        // Use JavaScript to reorder the elements based on the sorted text
        JavascriptExecutor js = (JavascriptExecutor) driver;
        StringBuilder script = new StringBuilder("var ul = arguments[0];");
        script.append("var items = ul.children;");
	
        for (int i = 0; i < sortableElements.size(); i++) {
            script.append("ul.appendChild(items[").append(i).append("]);");
        }
        js.executeScript(script.toString(), sortableElements.get(0));
	
        // Verify if the elements are sorted
        List<String> sortedElementTexts = new ArrayList<>();
        for (WebElement element : sortableElements) {
            sortedElementTexts.add(element.getText());
        }
	
        if (sortedElementTexts.equals(elementTexts)) {
            System.out.println("Elements have been successfully sorted.");
        } else {
            System.out.println("Sorting failed.");
        }

        // Switch back to the default content
        driver.switchTo().defaultContent();
	

        // Perform actions outside the frame
       WebElement search = driver.findElement(By.xpath("//input[@name='s']"));
        search.click();}
        
	
	
	}


