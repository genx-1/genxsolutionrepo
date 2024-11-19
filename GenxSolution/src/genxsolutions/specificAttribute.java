package genxsolutions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class specificAttribute {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));
        driver.get("https://vikiv45.retailhub-test.no/Admin/SpecificationAttribute/List");

        Thread.sleep(3000);
        WebElement emailid = driver.findElement(By.xpath("//input[@id='Email']"));
        emailid.sendKeys("komal.makke@genxinfosolutions.com");
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("q96k%*2nL44o");
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        Thread.sleep(4000);
	
	
        WebElement addAttribute = driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[2]"));
        addAttribute.click();
        Thread.sleep(2000);
        WebElement name = driver.findElement(By.xpath("//input[@id='Name']"));
        name.sendKeys("height");
        Thread.sleep(2000);
        WebElement isRequiredField = driver.findElement(By.xpath("//input[@id='IsRequiredField']"));
        isRequiredField.click();
        Thread.sleep(3000);
        isRequiredField.click();
        
        WebElement groupText = driver.findElement(By.xpath("//select[@id='SpecificationAttributeGroupId']"));
	    Select s1 = new Select(groupText);
	     s1.selectByIndex(0);
	     Thread.sleep(3000);//input[@id='IsMultipleSelection']
	     
        WebElement isMultiselected = driver.findElement(By.xpath("//input[@id='IsMultipleSelection']"));
        isMultiselected.click();
        WebElement DefaultPrompt = driver.findElement(By.xpath("//input[@id='DefaultPrompt']"));
        DefaultPrompt.sendKeys("height");
	     Thread.sleep(2000);
        Thread.sleep(2000);
        WebElement attributeHint = driver.findElement(By.xpath("//textarea[@id='AttributeHint']"));
        attributeHint.sendKeys("This is specific attribute");
        Thread.sleep(3000);
        WebElement saveAndContinuous = driver.findElement(By.xpath("//button[@name='save-continue']"));
        saveAndContinuous.click();
        Thread.sleep(2000);
        WebElement backButton = driver.findElement(By.xpath("//textarea[@id='AttributeHint']"));
        backButton.click();
        
        Thread.sleep(5000);
        WebElement alertText = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissable']"));
       String alert = alertText.getText();
        System.out.println(alert);
	
	if (alert.equals("admin.catalog.attributes.specificationattributes.added")) {
		System.out.println("Test get Pass");
	}
		else {
			System.out.println("Test get fail");
		}
	}
			
	
	

	
	
	
	


}
