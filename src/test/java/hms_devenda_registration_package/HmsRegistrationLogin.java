package hms_devenda_registration_package;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class HmsRegistrationLogin {
	
	public static WebDriver driver;

	
	public  static void main(String[] args) throws InterruptedException  {
		openUlr();
		loginhmspage();
		registrationpage() ;
		 feedbackpopupsalert();
        perminentregistrationpage();
        searchregistrationnumber();
        emergency_registration();
        verifyAlerts() ;
		logoutpage();
		
		
		
	}
	
	public static void emergency_registration() throws  InterruptedException{
	 driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	        Thread.sleep(3000);
		
	}
	
	public static void searchregistrationnumber() throws InterruptedException {
        driver.findElement(By.name("search")).sendKeys("Mahesh");
        driver.findElement(By.name("submit")).click();
        Thread.sleep(3000);
       
    }
	
   //@BeforeTest
	public static void openUlr()  throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Digital Computers\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
          driver.get("http://www.seleniumbymahesh.com/HMS/");
	      driver.manage().window().maximize();
	         Thread.sleep(3000);

	  }
	//@Test(priority= 0)
	public static void loginhmspage() throws InterruptedException {

         driver.findElement(By.name("username")).sendKeys("admin");
         driver.findElement(By.name("password")).sendKeys("admin");
         driver.findElement(By.name("submit")).click();
         Thread.sleep(3000);
        
     }
	//@Test(priority= 1)
    public static void registrationpage() throws InterruptedException {
		   
        driver.findElement(By.linkText("Registration")).click();
        driver.findElement(By.linkText("Perminent Registration")).click();
        driver.findElement(By.linkText("Search Registration")).click();
        driver.findElement(By.linkText("Emergency Registration")).click();

        Thread.sleep(3000);

		 }
	//@Test(priority= 4)
     public static void logoutpage() throws InterruptedException {
     driver.findElement(By.linkText("Logout")).click();
     Thread.sleep(3000);
	}
	
	//@Test(priority= 2)

	public static void perminentregistrationpage() throws InterruptedException {
		
       Select select1= new Select(driver.findElement(By.name("PATIENT_CAT")));
       select1.selectByVisibleText("Self");
        Thread.sleep(3000);
        new Select(driver.findElement(By.name("RELATION"))). selectByVisibleText("Brother");
        Thread.sleep(3000);
        new Select(driver.findElement(By.name("TITLE"))). selectByVisibleText("Mr.");
        Thread.sleep(3000);
        driver.findElement(By.name("MOTHER_NAME")).sendKeys("Mangu");
        Thread.sleep(3000);

        driver.findElement(By.name("PNT_NAME")).sendKeys("Mahesh");
        Thread.sleep(3000);
        new Select(driver.findElement(By.name("PAT_IDENTITY"))). selectByVisibleText("PAN Card");
        Thread.sleep(3000);
        driver.findElement(By.name("MIDDLE_NAME")).sendKeys("Singh");
        Thread.sleep(3000);
        driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("Pan Card");
        Thread.sleep(3000);
        driver.findElement(By.name("LAST_NAME")).sendKeys("Jhala");
        Thread.sleep(3000);
        driver.findElement(By.name("DOB")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='tcalGrid']/tbody/tr[5]/td[5]")).click();
        Thread.sleep(3000);
        new Select(driver.findElement(By.name("NATIONALITY"))). selectByVisibleText("Indian");
        Thread.sleep(3000);
        driver.findElement(By.name("AGE")).sendKeys("27");
        Thread.sleep(3000); 
        new Select(driver.findElement(By.name("IS_MLC"))). selectByVisibleText("No");
        Thread.sleep(3000);
        new Select(driver.findElement(By.name("SEX"))). selectByVisibleText("Male");
        Thread.sleep(3000);
        new Select(driver.findElement(By.name("EDUCATION"))). selectByVisibleText("MCA");
        Thread.sleep(3000);
        new Select(driver.findElement(By.name("MTRL_STATUS"))). selectByVisibleText("Single");
        Thread.sleep(3000); 
        new Select(driver.findElement(By.name("OCCUPATION"))). selectByVisibleText("Employee");
        Thread.sleep(3000); 
        new Select(driver.findElement(By.name("RELIGION"))). selectByVisibleText("Hindu");
        Thread.sleep(3000); 
        new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))). selectByVisibleText("A+");
        Thread.sleep(3000); 
        new Select(driver.findElement(By.name("PLANGUAGE"))). selectByVisibleText("Hindi");
        Thread.sleep(3000); 
        new Select(driver.findElement(By.name("CITIZENSHIP"))). selectByVisibleText("Indian");
        Thread.sleep(3000); 
        new Select(driver.findElement(By.name("SC_PROOF"))). selectByVisibleText("No");
        Thread.sleep(3000);  
        driver.findElement(By.name("ADDRESS1")).sendKeys("Hyderabad");
        Thread.sleep(3000); 
        driver.findElement(By.name("ADDRESS2")).sendKeys("Hyderabad");
        Thread.sleep(3000); 
        driver.findElement(By.name("MOBILE_NO")).sendKeys("7340143619");
        Thread.sleep(3000); 
        driver.findElement(By.name("EMAIL_ID")).sendKeys("devendrabana06@gmail.com");
        Thread.sleep(3000); 
        driver.findElement(By.name("ZIP")).sendKeys("12345678");
        Thread.sleep(3000); 
        driver.findElement(By.name("image")).sendKeys("D:\\New folder\\IMG_20170629_123134.jpg");
        Thread.sleep(3000); 
        new Select(driver.findElement(By.name("COUNTRY_CODE"))). selectByVisibleText("India");
        Thread.sleep(3000); 
        driver.findElement(By.name("submit")).click();
        Thread.sleep(3000); 
        driver.findElement(By.className("log")).click();
        Thread.sleep(3000); 
  }
	
	//@Test(priority= 2)

	//@Test(priority= 3)

	public static void verifyAlerts() throws InterruptedException  {
		Alert alert=driver.switchTo().alert();
		String str=alert.getText();
		System.out.println(str);
		alert.accept();
		Thread.sleep(5000);
		
   }
	public static void feedbackpopupsalert() throws InterruptedException  {
		      driver.findElement(By.linkText("Feedback")).click();
		      Set<String>windows  =driver.getWindowHandles();
		      System.out.println(windows);
		      Object[] s = windows.toArray();
		      driver.switchTo().window((String) s[1]).toString();
		      driver.findElement(By.id("name")).sendKeys("mahesh");
		      driver.findElement(By.id("email")).sendKeys("devendrabana06@gmail.com");
              new Select(driver.findElement(By.id("car"))).selectByVisibleText("Volvo");
		      WebElement element1= driver.findElement(By.name("radio"));
		      element1.click();
		      WebElement element2= driver.findElement(By.name("radio"));
		      element2.click();
		      driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		      driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\\New folder\\IMG_20170629_123134.jpg");
		      driver.findElement(By.id("message")).sendKeys("welcome to hms");
		      driver.close();
              driver.switchTo().window((String) s[0]).toString();
		      driver.findElement(By.name("EMAIL_ID")).sendKeys("devendrabana06@gmail.com");
              Thread.sleep(3000);
	        
		
         }
	//@Test(priority= 4)
    //@AfterTest
	//public void afterTest() {
	//	System.out.println("after test");
    //}
}

