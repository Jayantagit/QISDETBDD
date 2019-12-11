package com.mapsynq.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mapsynq.Utilities.TestUtil;

public class TestBase 
{
	
	 public static  WebDriver driver;	
	 public static  Properties config=new Properties();
	 public static  FileInputStream fis;
	 public static WebDriverWait wait;
	 public static String browser;
	 public static Logger log=Logger.getLogger("rootLogger");
	 

	
	
	public TestBase()
	{
		
		try {
			fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\Config.properties");
		} catch (FileNotFoundException e) {
				e.printStackTrace();
				log.debug("Unable to Find the Property File");
		}
		try {
			config.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
			log.debug("Unable to Load the Property File");
		}	
	}
	
	public static void Initialization()
	{
		
		 String browser = config.getProperty("browser");
		 if(browser.equals("Chrome"))
		 {  		 
  		   System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Executables\\chromedriver.exe");
  		   driver=new ChromeDriver();
  		   System.out.println("Chrome Driver Luanched");
		 }
		 else if(browser.equalsIgnoreCase("firefox"))
		 {  		 
  		   System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Executables\\geckodriver.exe");
  		   driver=new ChromeDriver();
  		   System.out.println("Chrome Driver Luanched");
		 }
		 
		   driver.manage().deleteAllCookies();
		   driver.get(config.getProperty("TestsuiteURL"));
	   	   driver.manage().window().maximize();
	   	 //  driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(config.getProperty("PageLoadTime")), TimeUnit.SECONDS);
	   	  // driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("ImplicitTime")), TimeUnit.SECONDS);
	   	   driver.manage().timeouts().pageLoadTimeout(TestUtil.PageLoadTime, TimeUnit.SECONDS);
	   	   driver.manage().timeouts().implicitlyWait(TestUtil.ImplicitTime, TimeUnit.SECONDS);
	   	   wait=new WebDriverWait(driver,5);
		
	}
	
	public static void BrowserClose()
	{
		driver.quit();
		log.debug("Closing Browser");
	}
}
