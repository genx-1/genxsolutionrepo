package genxsolutions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class waitTest {

		private WebDriver driver;
		private String baseUrl;
		private WebElement element;

		@BeforeMethod
		public void setUp() throws Exception {
	  driver = new EdgeDriver();
		baseUrl = "http://www.google.com";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}

		@Test
		public void testUntitled() throws Exception {
		driver.get(baseUrl);
		element = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		element.sendKeys("Selenium WebDriver Interview questions");
		element.sendKeys(Keys.RETURN);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='aajZCb']"));
		System.out.println(list.size());

		}

		@AfterMethod
		public void tearDown() throws Exception {
		driver.quit();
		}
		}
