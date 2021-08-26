package thirtybees.base;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class TestBase {
	
	     public static  WebDriver driver; 
		 static FileInputStream fis=null;
		 public static Logger Log = Logger.getLogger(TestBase.class);
		 public static ExtentReports  extent;
		 public static	ExtentTest test;
		 public static ExtentSparkReporter spark;
		 
		public static String readProperty(String key) {
			Log.info("Reading the value of property " +key);
		
			Properties prob = new Properties();
		try {
			Log.info("initializing the property file");
			fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/config.properties");
			 prob.load(fis);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		Log.info("property value found in the file with key as"+key+"and the value is: "+prob.getProperty(key));
		return prob.getProperty(key);
		
		}
		
		public static  WebDriver intialization() {
			 spark= new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/extentreport.html"); 
			 extent=new ExtentReports();
			 extent.setSystemInfo("Host_Name", "manu");
			 extent.setSystemInfo("Envorment", "Automation_Testing");
			 extent.setSystemInfo("User_Name", "manashri");
			 extent.attachReporter(spark);  //report are genratedz
			 	
			
			 Log.info("browser initalizing");
			String browser=readProperty("browser");
			if (browser.equals("chrome")) {
			 Log.info("user want to automate the chrome browser");
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				driver = new ChromeDriver();
			}  
			if (browser.equals("firefox")) {
			 Log.info("user want to automate the firefox browser");
				System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
				driver = new FirefoxDriver();

			} 
			 if(!browser.equals("chrome")||browser.equals("firefox")) {
			 Log.info("user want to automate with invalid browser");
				System.out.println("invalid browser name");
				return null;
			}
			
		   //	driver.manage().window().maximize();
			//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			Log.info("lunching a application");
			driver.get(readProperty("url"));
			 
			return driver;
	  }	
		
		public static String  getScreenshot(WebDriver driver, String name){
			Log.info("user want to scrrenshot of fail test case");
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			File dest = new File(System.getProperty("user.dir")+"/screenshot/"+name+".jpg");
			String path = System.getProperty("user.dir")+"/screenshot/"+name+".jpg";
			try {
				FileUtils.copyFile(src,dest);
			} catch (IOException e) {
				e.printStackTrace();
			}
				Log.info("screenshot save into project directory");
				return path;
			
			}
			
		
	    /* public LoginPage loadLoginPage() {
	      LoginPage lp = new LoginPage(driver);
		  return lp;
	  } */
	}



