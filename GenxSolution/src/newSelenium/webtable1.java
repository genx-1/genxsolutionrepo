  package newSelenium;

  import java.time.Duration;
  import java.util.List;

   import org.openqa.selenium.By;
   import org.openqa.selenium.WebDriver;
   import org.openqa.selenium.WebElement;
   import org.openqa.selenium.edge.EdgeDriver;

        public class webtable1 {
	    public static void main(String[] args) throws InterruptedException {
		 //System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		 System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
		 driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		  List<WebElement> rows = driver.findElements(By.xpath("//table[@id=\"customers\"]//tr"));
		  int rowCount = rows.size();
		   System.out.println("Number of rows in webtable : "+ rowCount );                          
		 
		 
		    //*[@id="customers"]/tbody/tr[2]/td[1]
		    //*[@id="customers"]/tbody/tr[3]/td[1]
		    //*[@id="customers"]/tbody/tr[4]/td[1]
		    //*[@id="customers"]/tbody/tr[7]/td[1]
		    String	 Beforexpath = "//*[@id=\"customers\"]/tbody/tr[";
	        String	 afterxpath = "]/td[1]";
		 
		for (int i=2; i<=rowCount; i++)
		{
			String actualxpath = Beforexpath + i + afterxpath;
			WebElement element = driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
			
		if (element.getText().equals("Island Trading")) {
			System.out.println("Company name : " + element.getText() + " is found at number " +  (i-1));
			break;
		}
		}
		
		
		    System.out.println("***************************");
			//*[@id="customers"]/tbody/tr[2]/td[2]
			//*[@id="customers"]/tbody/tr[3]/td[2]
		    String	 afterxpathContact = "]/td[2]";
		for (int i=2; i<=rowCount; i++) {
			String actualxpathContact = Beforexpath + i + afterxpathContact;
			WebElement element = driver.findElement(By.xpath(actualxpathContact));
			System.out.println(element.getText());
		}
			
	
		System.out.println("***************************");
		//*[@id="customers"]/tbody/tr[2]/td[3]
		//*[@id="customers"]/tbody/tr[3]/td[3]
	    String	 afterxpathCountry = "]/td[3]";
	for (int i=2; i<=rowCount; i++) {
		String actualxpathCountry = Beforexpath + i + afterxpathCountry;
		WebElement element = driver.findElement(By.xpath(actualxpathCountry));
		System.out.println(element.getText());
	}
			
				
	
	   String	 BeforexpathColomn = "//*[@id=\"customers\"]/tbody/tr[1]/th[";
       String	 afterxpathColomn = "]";
		List<WebElement> colomns = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[1]//th"));		
		int colomcCount = colomns.size();
			System.out.println("Number of colomn are "+ colomcCount );	
				    //*[@id="customers"]/tbody/tr[1]/th[1]
					//*[@id="customers"]/tbody/tr[1]/th[2]
					//*[@id="customers"]/tbody/tr[1]/th[3]
				
			
			for (int i=1; i<=colomcCount; i++) {
				WebElement element = driver.findElement(By.xpath(BeforexpathColomn +i+ afterxpathColomn));
				String colomnText = element.getText();
				System.out.println(colomnText);
				
			}
				
			
			
				
			
		
}}
