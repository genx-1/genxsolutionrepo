package genxsolutions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class onboardindStore {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\eclipse-workspace\\GenxSolution\\Binery\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("http://mayraflora.retailhub-test.no/login?ReturnUrl=%2Fadmin");
        
      /*  WebElement ele1 = driver.findElement(By.xpath("//span[@class='activeSelect']"));
        Actions a = new Actions(driver);
        a.moveToElement(ele1).click().build().perform();
        
        
        WebElement ele2 = driver.findElement(By.xpath("(//span[@style='display: block;'])[2]"));
        Actions a1 = new Actions(driver);
        a1.moveToElement(ele2).click().build().perform();*/
        
        
        Thread.sleep(3000);
        WebElement emailid = driver.findElement(By.xpath("//input[@id='Email']"));
        emailid.sendKeys("mayra@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("12345");
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        Thread.sleep(3000);
        WebElement WelcomeToretailhub = driver.findElement(By.xpath("(//h1[@class ='text-center'])[1]"));
        String cardstep1 = WelcomeToretailhub.getText();
    
        System.out.println(cardstep1);
        Thread.sleep(2000);
        
        
        WebElement companyName = driver.findElement(By.xpath("//input[@id='CompanyName']"));
        companyName.sendKeys("mayra Solutions");
        WebElement companyStreetAddresss = driver.findElement(By.xpath("//input[@id='CompanyStreetAddress']"));
        companyStreetAddresss.clear();
        Thread.sleep(2000);
        companyStreetAddresss.sendKeys("Sentralveien 23");
         Thread.sleep(2000);
        WebElement companyPostalCode = driver.findElement(By.xpath("//input[@id='CompanyPostalCode']"));
        companyPostalCode.clear();
        Thread.sleep(1000);
        companyPostalCode.sendKeys("6900");
        Thread.sleep(1000);
        WebElement CompanyCity = driver.findElement(By.xpath("//input[@id='CompanyCity']"));
        Thread.sleep(1000);
        CompanyCity.clear();
        CompanyCity.sendKeys("Flora");
        Thread.sleep(1000);
        WebElement CompanyPhonaNumber = driver.findElement(By.xpath("//input[@id='CompanyPhoneNumber']"));
        CompanyPhonaNumber.clear();
        CompanyPhonaNumber.sendKeys("9956784534");
        Thread.sleep(1000);
        WebElement CompanyWat = driver.findElement(By.xpath("//input[@id='CompanyVat']"));
        CompanyWat.clear();
        CompanyWat.sendKeys("12312313 (test)");
        Thread.sleep(2000);
        WebElement POSApiType = driver.findElement(By.xpath("//select[@class='form-control']"));
        Select s = new Select(POSApiType);
		s.selectByIndex(1);
		Thread.sleep(2000);
        WebElement butsavestep1 = driver.findElement(By.xpath("//button[@id='btnSaveStep1']"));
        butsavestep1.click();
        Thread.sleep(2000);
        WebElement Velgfraktavtale = driver.findElement(By.xpath("(//h1[@class='text-center'])[2]"));
         System.out.println(Velgfraktavtale.getText());	
        
         WebElement BringAgreement = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
         BringAgreement.click();
         Thread.sleep(2000);
         WebElement FrightAgreePostnord = driver.findElement(By.xpath("//input[@value='RetailhubAgreement_Postnord']"));
         FrightAgreePostnord.click();
         WebElement ownFrightAgreement = driver.findElement(By.xpath("//input[@value='OwnAgreement_Postnord']"));
         ownFrightAgreement.click();
         //WebElement cardTitle3 = driver.findElement(By.xpath("(//div[@class='card-title'])[3]"));
       //  System.out.println(cardTitle3.getText());	
       
         
         
         
         if( BringAgreement.isSelected()) {
         
         WebElement butsavestep2 = driver.findElement(By.xpath("//button[@id='btnSaveStep2']"));
         butsavestep2.click();
        WebElement cardTitlestep3 = driver.findElement(By.xpath("(//div[@class='card-title'])[3]"));
        String cardstep3 = cardTitlestep3.getText();
        System.out.println(cardstep3);
        Thread.sleep(2000);
        WebElement Address1 = driver.findElement(By.xpath("//input[@id='ReturnAddress_Address1']"));
        Address1.sendKeys("Sentralveien 23");
        Thread.sleep(2000);
        WebElement Address2 = driver.findElement(By.xpath("//input[@id='ReturnAddress_Address2']"));
        Address2.sendKeys("Sentralveien 23");
        Thread.sleep(2000);
       // WebElement CompanyCity = driver.findElement(By.xpath("//input[@id='CompanyCity']"));
       // CompanyCity.sendKeys("Flora");
        WebElement postalCode = driver.findElement(By.xpath("//input[@id='ReturnAddress_ZipPostalCode']"));
        postalCode.sendKeys("6900");
        Thread.sleep(2000);
        WebElement city = driver.findElement(By.xpath("//input[@id='ReturnAddress_City']"));
        city.sendKeys("Flora");
        Thread.sleep(2000);
        //WebElement shippinglablecheckbox1 = driver.findElement(By.xpath("//button[@id='btnSaveStep1']"));
       // shippinglablecheckbox1.click();
        //Thread.sleep(2000);
        WebElement FirstName = driver.findElement(By.xpath("//input[@id='ReturnAddress_FirstName']"));
        FirstName.sendKeys("Komal");
        Thread.sleep(2000);
         WebElement LastName = driver.findElement(By.xpath("//input[@id='ReturnAddress_LastName']"));
         LastName.sendKeys("Makke");
         Thread.sleep(2000);
         WebElement PhoneNumber = driver.findElement(By.xpath("//input[@id='ReturnAddress_PhoneNumber']"));
         PhoneNumber.sendKeys("9956784523");
         Thread.sleep(3000);
         WebElement Email = driver.findElement(By.xpath("//input[@id='ReturnAddress_Email']"));
         /*Actions act = new Actions(driver);
         a.moveToElement(Email).keyDown(Keys.CONTROL).sendKeys("a",Keys.BACK_SPACE).keyUp(Keys.CONTROL).perform();
         Thread.sleep(3000);
         // Email.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
         // JavascriptExecutor js =(javascriptExecutor) driver;
         // js.executescript("arguments[0].click()",webElement);
         //Email.sendKeys("komal@gmail.com");
         Email.sendKeys(Keys.SPACE, Keys.BACK_SPACE);
         Thread.sleep(4000);
         //Email.sendKeys("komal@gmail.com");
         Thread.sleep(2000);*/
        
         WebElement butsavestep3 = driver.findElement(By.xpath("//button[@id='btnSaveStep3']"));
         butsavestep3.click();
         Thread.sleep(2000);
         WebElement cardTitlestep4 = driver.findElement(By.xpath("(//div[@class='card-title'])[4]"));
         String cardstep4 = cardTitlestep4.getText();
         System.out.println(cardstep4);
         Thread.sleep(2000);
         
         
         WebElement butsavestep4 = driver.findElement(By.xpath("//button[@id='btnSaveStep4']"));
         butsavestep4.click();
         Thread.sleep(2000);
         WebElement cardTitlestep5 = driver.findElement(By.xpath("(//div[@class='card-title'])[5]"));
         String cardstep5 = cardTitlestep5.getText();
         System.out.println(cardstep5);
       
       
        /* WebElement Name = driver.findElement(By.xpath("//input[@id='PickupPointModelName']"));
        Name.sendKeys("Sentralveien 23");
        Thread.sleep(2000);
        WebElement ConfirmAddress1 = driver.findElement(By.xpath("//input[@id='Address_Address1']"));
        ConfirmAddress1.sendKeys("6900");
        Thread.sleep(2000);
        WebElement CompanyPostalZipCode = driver.findElement(By.xpath("//input[@id='Address_ZipPostalCode']"));
        CompanyPostalZipCode.sendKeys("Flora");
        Thread.sleep(2000);
        WebElement City = driver.findElement(By.xpath("//input[@id='Address_City']"));
        City.sendKeys("9956784534");
        Thread.sleep(2000);
        WebElement OpeningHour = driver.findElement(By.xpath("//input[@id='CompanyVat']"));
        OpeningHour.sendKeys("12312313 (test)");
        Thread.sleep(2000);
        WebElement Description = driver.findElement(By.xpath("//button[@id='btnSaveStep1']"));
        Description.click();*/
        Thread.sleep(2000);
        WebElement butsavestep5 = driver.findElement(By.xpath("//button[@id='btnSaveStep5']"));
        butsavestep5.click();
        WebElement cardTitlestep6 = driver.findElement(By.xpath("(//div[@class='card-title'])[5]"));
        String cardstep6 = cardTitlestep6.getText();
        System.out.println(cardstep6);
        Thread.sleep(2000);
      
       
       
        WebElement Bringsmallparcel = driver.findElement(By.xpath("(//input[@class='form-control text-box single-line'])[20]"));
        Bringsmallparcel.sendKeys("79");
        Thread.sleep(2000);
        WebElement BringPickupPointParcel = driver.findElement(By.xpath("(//input[@class='form-control text-box single-line'])[21]"));
        BringPickupPointParcel.sendKeys("59");
        Thread.sleep(2000);
        WebElement FreeFrightAboveOrdervalue = driver.findElement(By.xpath("//input[@class='k-formatted-value k-input']"));
        FreeFrightAboveOrdervalue.sendKeys("1500");
        Thread.sleep(2000);
        WebElement butsavestep6 = driver.findElement(By.xpath("//button[@id='btnSaveStep6']"));
        butsavestep6.click();
        WebElement cardTitlestep7 = driver.findElement(By.xpath("(//div[@class='card-title'])[6]"));
        String cardstep7 = cardTitlestep7.getText();
        System.out.println(cardstep7);
        Thread.sleep(2000);
       
        WebElement DefaultEmail = driver.findElement(By.xpath("//input[@id='DefaultEmail']"));
        DefaultEmail.sendKeys("mayra@gmail.com");
        Thread.sleep(2000);
        WebElement supportEmail = driver.findElement(By.xpath("//input[@id='SupportEmail']"));
        supportEmail.sendKeys("komal@gmail.com");
        Thread.sleep(2000);
        WebElement butsavestep7 = driver.findElement(By.xpath("//button[@id='btnSaveStep7']"));
        butsavestep7.click();
        WebElement cardTitlestep8 = driver.findElement(By.xpath("(//div[@class='card-title'])[7]"));
        String cardstep8 = cardTitlestep8.getText();
        System.out.println(cardstep8);
        Thread.sleep(2000);
        
        
        
        WebElement DefaultPageTitle = driver.findElement(By.xpath("//input[@id='DefaultTitle']"));
        DefaultPageTitle.sendKeys("mayra@gmail.com");
        Thread.sleep(2000);
        WebElement metaDescription = driver.findElement(By.xpath("//input[@id='DefaultMetaDescription']"));
        metaDescription.sendKeys("komal@gmail.com");
        Thread.sleep(2000);
        WebElement butsavestep8 = driver.findElement(By.xpath("//button[@id='btnSaveStep8']"));
        butsavestep8.click();
        WebElement cardTitlestep9 = driver.findElement(By.xpath("(//div[@class='card-title'])[8]"));
        String cardstep9 = cardTitlestep9.getText();
        System.out.println(cardstep9);
        Thread.sleep(2000);
        
        
           WebElement categoryDropdown = driver.findElement(By.xpath("//select[@id='SelectedCategoryIds']"));
           Select s = new Select(categoryDropdown);
           s.deselectByValue("682");
           Thread.sleep(4000);
           WebElement butsavestep9 = driver.findElement(By.xpath("//button[@id='btnSaveStep9']"));
           butsavestep9.click();
           WebElement cardTitlestep10 = driver.findElement(By.xpath("(//div[@class='card-title'])[9]"));
           String cardstep10 = cardTitlestep10.getText();
           System.out.println(cardstep10);
           Thread.sleep(2000);}
           // WebElement save = driver.findElement(By.xpath("//a[@id='btnSaveStep10']"));
            // save.click();}
         
            else if (ownFrightAgreement.isSelected()) {
        	WebElement butsavestep2 = driver.findElement(By.xpath("//button[@id='btnSaveStep2']"));
            butsavestep2.click();
            Thread.sleep(4000);
           // WebElement cardTitlestep3 = driver.findElement(By.xpath("(//h1[@class='text-center'])[3]"));
          //System.out.println(cardTitlestep3.getText());
             WebElement cardTitlestep3 = driver.findElement(By.xpath("(//div[@class='card-title'])[3]"));
             String cardTitle3 = cardTitlestep3.getText();
              System.out.println(cardTitle3);
            Thread.sleep(2000);
            
            
            WebElement customerid = driver.findElement(By.xpath("//input[@id='CustomerId']"));
            Thread.sleep(2000);
            customerid.clear();
            Thread.sleep(2000);
            customerid.sendKeys("6758439870");
           
            Thread.sleep(3000);
            WebElement Address1 = driver.findElement(By.xpath("//input[@id='ReturnAddress_Address1']"));
            Address1.sendKeys("Sentralveien 23");
            Thread.sleep(1000);
            WebElement Address2 = driver.findElement(By.xpath("//input[@id='ReturnAddress_Address2']"));
            Address2.sendKeys("Sentralveien 23");
            Thread.sleep(1000);
            WebElement postalCode = driver.findElement(By.xpath("//input[@id='ReturnAddress_ZipPostalCode']"));
           postalCode.sendKeys("6900");
           Thread.sleep(1000);
           WebElement city = driver.findElement(By.xpath("//input[@id='ReturnAddress_City']"));
           city.sendKeys("Flora");
           Thread.sleep(1000);
           WebElement FirstName = driver.findElement(By.xpath("//input[@id='ReturnAddress_FirstName']"));
           FirstName.sendKeys("Komal");
           Thread.sleep(1000);
           WebElement LastName = driver.findElement(By.xpath("//input[@id='ReturnAddress_LastName']"));
           LastName.sendKeys("Makke");
           Thread.sleep(1000);
           WebElement PhoneNumber = driver.findElement(By.xpath("//input[@id='ReturnAddress_PhoneNumber']"));
           PhoneNumber.sendKeys("9956784523");
           Thread.sleep(3000);
           WebElement butsavestep3 = driver.findElement(By.xpath("//button[@id='btnSaveStep3']"));
           butsavestep3.click();
           Thread.sleep(3000);
           WebElement cardTitlestep4 = driver.findElement(By.xpath("(//div[@class='card-title'])[3]"));
           String cardstep4 = cardTitlestep4.getText();
           System.out.println(cardstep4);
           Thread.sleep(4000);
            
           WebElement butsavestep4 = driver.findElement(By.xpath("//button[@id='btnSaveStep4']"));
           butsavestep4.click();
           Thread.sleep(3000);
           WebElement cardTitlestep5 = driver.findElement(By.xpath("(//div[@class='card-title'])[3]"));
           String cardstep5 = cardTitlestep5.getText();
           System.out.println(cardstep5);
          
          
           /* WebElement Name = driver.findElement(By.xpath("//input[@id='PickupPointModelName']"));
           Name.sendKeys("Sentralveien 23");
           Thread.sleep(2000);
           WebElement ConfirmAddress1 = driver.findElement(By.xpath("//input[@id='Address_Address1']"));
           ConfirmAddress1.sendKeys("6900");
           Thread.sleep(2000);
           WebElement CompanyPostalZipCode = driver.findElement(By.xpath("//input[@id='Address_ZipPostalCode']"));
           CompanyPostalZipCode.sendKeys("Flora");
           Thread.sleep(2000);
           WebElement City = driver.findElement(By.xpath("//input[@id='Address_City']"));
           City.sendKeys("9956784534");
           Thread.sleep(2000);
           WebElement OpeningHour = driver.findElement(By.xpath("//input[@id='CompanyVat']"));
           OpeningHour.sendKeys("12312313 (test)");
           Thread.sleep(2000);
           WebElement Description = driver.findElement(By.xpath("//button[@id='btnSaveStep1']"));
           Description.click();*/
           Thread.sleep(1000);
           /* WebElement butsavestep5 = driver.findElement(By.xpath("//button[@id='btnSaveStep5']"));
           butsavestep5.click();
           WebElement cardTitlestep6 = driver.findElement(By.xpath("(//div[@class='card-title'])[5]"));
           String cardstep6 = cardTitlestep6.getText();
           System.out.println(cardstep6);
           Thread.sleep(1000);
         
           WebElement Bringsmallparcel = driver.findElement(By.xpath("(//input[@class='form-control text-box single-line'])[7]"));
           Thread.sleep(1000);
           Bringsmallparcel.clear();
           Thread.sleep(1000);
           Bringsmallparcel.sendKeys("79");
           Thread.sleep(1000);
           WebElement BringPickupPointParcel = driver.findElement(By.xpath("(//input[@class='form-control text-box single-line'])[8]"));
           Thread.sleep(1000);
           BringPickupPointParcel.clear();
           Thread.sleep(1000);
           BringPickupPointParcel.sendKeys("59");
           Thread.sleep(1000);
           WebElement FreeFrightAboveOrdervalue = driver.findElement(By.xpath("(//input[@class='form-control text-box single-line'])[9]"));
           //Thread.sleep(2000);
           // FreeFrightAboveOrdervalue.clear();
           Thread.sleep(2000);
           //FreeFrightAboveOrdervalue.sendKeys("1500");
           // Thread.sleep(2000);
           WebElement butsavestep6 = driver.findElement(By.xpath("//button[@id='btnSaveStep6']"));
           butsavestep6.click();
           Thread.sleep(2000);
           WebElement cardTitlestep7 = driver.findElement(By.xpath("(//div[@class='card-title'])[6]"));
           String cardstep7 = cardTitlestep7.getText();
           System.out.println(cardstep7);
           Thread.sleep(3000);
          
           WebElement DefaultEmail = driver.findElement(By.xpath("//input[@id='DefaultEmail']"));
           DefaultEmail.sendKeys("mayra@gmail.com");
           Thread.sleep(2000);
           WebElement supportEmail = driver.findElement(By.xpath("//input[@id='SupportEmail']"));
           supportEmail.sendKeys("komal@gmail.com");
           Thread.sleep(2000);
           WebElement butsavestep7 = driver.findElement(By.xpath("//button[@id='btnSaveStep7']"));
           butsavestep7.click();
           Thread.sleep(2000);
           WebElement cardTitlestep8 = driver.findElement(By.xpath("(//div[@class='card-title'])[7]"));
           String cardstep8 = cardTitlestep8.getText();
           System.out.println(cardstep8);
           Thread.sleep(3000);
           
           
           
           WebElement DefaultPageTitle = driver.findElement(By.xpath("//input[@id='DefaultTitle']"));
           DefaultPageTitle.sendKeys("mayra@gmail.com");
           Thread.sleep(2000);
           WebElement metaDescription = driver.findElement(By.xpath("//input[@id='DefaultMetaDescription']"));
           metaDescription.sendKeys("komal@gmail.com");
           Thread.sleep(2000);
           WebElement butsavestep8 = driver.findElement(By.xpath("//button[@id='btnSaveStep8']"));
           butsavestep8.click();
           
           WebElement cardTitlestep9 = driver.findElement(By.xpath("(//div[@class='card-title'])[8]"));
           // String cardstep9 = cardTitlestep9.getText();
            * 
           System.out.println(cardTitlestep9.getText());
           Thread.sleep(2000);
           
           
           WebElement categoryDropdown = driver.findElement(By.xpath("//select[@id='SelectedCategoryIds']"));
           Select s = new Select(categoryDropdown);
           s.deselectByValue("682");
           Thread.sleep(3000);
           WebElement butsavestep9 = driver.findElement(By.xpath("//button[@id='btnSaveStep9']"));
           butsavestep9.click();
           Thread.sleep(3000);
           WebElement cardTitlestep10 = driver.findElement(By.xpath("(//div[@class='card-title'])[9]"));
           String cardstep10 = cardTitlestep10.getText();
           System.out.println(cardstep10);
           Thread.sleep(2000);*/
           }
           
           // WebElement save = driver.findElement(By.xpath("//a[@id='btnSaveStep10']"));
           // save.click();}
        	
           else {
           WebElement butsavestep2 = driver.findElement(By.xpath("//button[@id='btnSaveStep2']"));
           butsavestep2.click();
           WebElement cardTitlestep3 = driver.findElement(By.xpath("(//div[@class='card-title'])[3]"));
            /*  String cardstep3 = cardTitlestep3.getText();
           System.out.println(cardstep3);
           Thread.sleep(2000);*/
           WebElement Address1 = driver.findElement(By.xpath("//input[@id='ReturnAddress_Address1']"));
           Address1.sendKeys("Sentralveien 23");
           Thread.sleep(2000);
           WebElement Address2 = driver.findElement(By.xpath("//input[@id='ReturnAddress_Address2']"));
           Address2.sendKeys("Sentralveien 23");
           //   Thread.sleep(2000);
           // WebElement CompanyCity = driver.findElement(By.xpath("//input[@id='CompanyCity']"));
           // CompanyCity.sendKeys("Flora");
           WebElement postalCode = driver.findElement(By.xpath("//input[@id='ReturnAddress_ZipPostalCode']"));
           postalCode.sendKeys("6900");
           Thread.sleep(2000);
           WebElement city = driver.findElement(By.xpath("//input[@id='ReturnAddress_City']"));
           city.sendKeys("Flora");
           Thread.sleep(2000);
           //WebElement shippinglablecheckbox1 = driver.findElement(By.xpath("//button[@id='btnSaveStep1']"));
           // shippinglablecheckbox1.click();
           //Thread.sleep(2000);
           WebElement FirstName = driver.findElement(By.xpath("//input[@id='ReturnAddress_FirstName']"));
           FirstName.sendKeys("Komal");
           Thread.sleep(2000);
           WebElement LastName = driver.findElement(By.xpath("//input[@id='ReturnAddress_LastName']"));
           LastName.sendKeys("Makke");
           Thread.sleep(2000);
           WebElement PhoneNumber = driver.findElement(By.xpath("//input[@id='ReturnAddress_PhoneNumber']"));
           PhoneNumber.sendKeys("9956784523");
           Thread.sleep(2000);
           WebElement Email = driver.findElement(By.xpath("//input[@id='ReturnAddress_Email']"));
           Email.sendKeys("komal@gmail.com");
           Thread.sleep(2000);
           WebElement butsavestep3 = driver.findElement(By.xpath("//button[@id='btnSaveStep3']"));
           butsavestep3.click();
           Thread.sleep(2000);
           WebElement cardTitlestep4 = driver.findElement(By.xpath("(//div[@class='card-title'])[4]"));
           String cardstep4 = cardTitlestep4.getText();
           System.out.println(cardstep4);
           Thread.sleep(2000);
            
            
           WebElement butsavestep4 = driver.findElement(By.xpath("//button[@id='btnSaveStep4']"));
           butsavestep4.click();
           Thread.sleep(2000);
           WebElement cardTitlestep5 = driver.findElement(By.xpath("(//div[@class='card-title'])[5]"));
           String cardstep5 = cardTitlestep5.getText();
           System.out.println(cardstep5);
          
          
           /* WebElement Name = driver.findElement(By.xpath("//input[@id='PickupPointModelName']"));
           Name.sendKeys("Sentralveien 23");
           Thread.sleep(2000);
           WebElement ConfirmAddress1 = driver.findElement(By.xpath("//input[@id='Address_Address1']"));
           ConfirmAddress1.sendKeys("6900");
           Thread.sleep(2000);
           WebElement CompanyPostalZipCode = driver.findElement(By.xpath("//input[@id='Address_ZipPostalCode']"));
           CompanyPostalZipCode.sendKeys("Flora");
           Thread.sleep(2000);
           WebElement City = driver.findElement(By.xpath("//input[@id='Address_City']"));
           City.sendKeys("9956784534");
           Thread.sleep(2000);
           WebElement OpeningHour = driver.findElement(By.xpath("//input[@id='CompanyVat']"));
           OpeningHour.sendKeys("12312313 (test)");
           Thread.sleep(2000);
           WebElement Description = driver.findElement(By.xpath("//button[@id='btnSaveStep1']"));
           Description.click();*/
           Thread.sleep(2000);
           WebElement butsavestep5 = driver.findElement(By.xpath("//button[@id='btnSaveStep5']"));
           butsavestep5.click();
           WebElement cardTitlestep6 = driver.findElement(By.xpath("(//div[@class='card-title'])[5]"));
           String cardstep6 = cardTitlestep6.getText();
           System.out.println(cardstep6);
           Thread.sleep(2000);
         
          
          
           WebElement Bringsmallparcel = driver.findElement(By.xpath("(//input[@class='form-control text-box single-line'])[20]"));
           Bringsmallparcel.sendKeys("79");
           Thread.sleep(2000);
           WebElement BringPickupPointParcel = driver.findElement(By.xpath("(//input[@class='form-control text-box single-line'])[21]"));
           BringPickupPointParcel.sendKeys("59");
           Thread.sleep(2000);
           WebElement FreeFrightAboveOrdervalue = driver.findElement(By.xpath("//input[@class='k-formatted-value k-input']"));
           FreeFrightAboveOrdervalue.sendKeys("1500");
           Thread.sleep(2000);
           WebElement butsavestep6 = driver.findElement(By.xpath("//button[@id='btnSaveStep6']"));
           butsavestep6.click();
           WebElement cardTitlestep7 = driver.findElement(By.xpath("(//div[@class='card-title'])[6]"));
           String cardstep7 = cardTitlestep7.getText();
           System.out.println(cardstep7);
           Thread.sleep(2000);
          
           WebElement DefaultEmail = driver.findElement(By.xpath("//input[@id='DefaultEmail']"));
           DefaultEmail.sendKeys("mayra@gmail.com");
           Thread.sleep(2000);
           WebElement supportEmail = driver.findElement(By.xpath("//input[@id='SupportEmail']"));
           supportEmail.sendKeys("komal@gmail.com");
           Thread.sleep(2000);
           WebElement butsavestep7 = driver.findElement(By.xpath("//button[@id='btnSaveStep7']"));
           butsavestep7.click();
           WebElement cardTitlestep8 = driver.findElement(By.xpath("(//div[@class='card-title'])[7]"));
           String cardstep8 = cardTitlestep8.getText();
           System.out.println(cardstep8);
           Thread.sleep(2000);
           
           
           
           WebElement DefaultPageTitle = driver.findElement(By.xpath("//input[@id='DefaultTitle']"));
           DefaultPageTitle.sendKeys("mayra@gmail.com");
           Thread.sleep(2000);
           WebElement metaDescription = driver.findElement(By.xpath("//input[@id='DefaultMetaDescription']"));
           metaDescription.sendKeys("komal@gmail.com");
           Thread.sleep(2000);
           WebElement butsavestep8 = driver.findElement(By.xpath("//button[@id='btnSaveStep8']"));
           butsavestep8.click();
           WebElement cardTitlestep9 = driver.findElement(By.xpath("(//div[@class='card-title'])[8]"));
           String cardstep9 = cardTitlestep9.getText();
           System.out.println(cardstep9);
           Thread.sleep(2000);
           
           
           WebElement categoryDropdown = driver.findElement(By.xpath("//select[@id='SelectedCategoryIds']"));
           Select s = new Select(categoryDropdown);
           s.deselectByValue("682");
           Thread.sleep(4000);
           WebElement butsavestep9 = driver.findElement(By.xpath("//button[@id='btnSaveStep9']"));
           butsavestep9.click();
           WebElement cardTitlestep10 = driver.findElement(By.xpath("(//div[@class='card-title'])[9]"));
           String cardstep10 = cardTitlestep10.getText();
           System.out.println(cardstep10);
           Thread.sleep(2000);}
         
         
         
             }
            }
