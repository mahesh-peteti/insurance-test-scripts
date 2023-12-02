package Insurance.testproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class App 
{
  public static void main( String[] args ) throws InterruptedException, IOException
  {

	    System.out.println("Script Started");	
	     
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagen\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
	    
	   
	    ChromeOptions chromeOptions = new ChromeOptions();
	    
	 
	    System.out.println("Driver opening up the url in browser");	
	    WebDriver driver = new ChromeDriver(chromeOptions);
	    driver.get("http://localhost:8082/contact.html");	
	    
	 
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    
	    System.out.println("Enter details in the form");
	  
	    
	    driver.findElement(By.id("inputName")).sendKeys("Mahesh");
	    Thread.sleep(2000);
	  
	    driver.findElement(By.id("inputNumber")).sendKeys("9989989989");
	    Thread.sleep(2000);
	   
	    driver.findElement(By.id("inputMail")).sendKeys("mahesh@gmail.com");
	
	    driver.findElement(By.id("inputMessage")).sendKeys("Hi, Iam intrested in insurance");
	  
	   
	    driver.findElement(By.id("my-button")).click();
	    String response = driver.findElement(By.id("response")).getText();
	    System.out.println(response);
	    System.out.println("Test Case execution completed");
	    TakesScreenshot scrShot = ((TakesScreenshot)driver);
        
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        
        
        File destFile = new File("C:\\Users\\nagen\\OneDrive\\Desktop\\screenshot/test-reports.jpg");
        
        FileUtils.copyFile(srcFile, destFile);
        
	    Thread.sleep(2000);
	    driver.quit();
  
  
      System.out.println( "Hello World!" );
  }      
	


  }
