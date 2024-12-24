package bstackBase;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import bstackPageMethods.Method_01_SignInPageMethods;
import bstackPageMethods.Method_02_ProductListPagemethods;
import bstackUtilities.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
    static ExtentReports report;
	static ExtentTest test;
	static ExtentSparkReporter reporter;	
	String methodName;
	
  WebDriver driver;
  protected Method_01_SignInPageMethods signInPageMethods;
  protected Method_02_ProductListPagemethods  productListPagemethods;
  ConfigReader configReader;
  
  public void initialize()
  {
	  signInPageMethods = new Method_01_SignInPageMethods(driver);
	  productListPagemethods = new Method_02_ProductListPagemethods(driver);
	  configReader = new ConfigReader();
  }
  
  @BeforeSuite
  public void setUp() throws IOException {
	  
	  report = new ExtentReports();
	  String filePath = "C:\\Users\\HP\\eclipse-workspace\\FrameWorkLessons\\TestReport\\TestReport.html";
	  reporter = new ExtentSparkReporter(new File(filePath));
	  report.attachReporter(reporter);
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  initialize();
	  driver.manage().window().maximize();
	  driver.get(configReader.getURL());
			
  }
  
  @BeforeMethod
  public void getMethodName(Method method)
  {
	  methodName = method.getName();
	  test = report.createTest(methodName);
  }
  
  @AfterMethod
  public void setTestResult(ITestResult result, Method method)
  {
	  if(result.getStatus()==ITestResult.SUCCESS)
	  {
		 test.log(Status.PASS, "test is passed");
	  }
	  else
		  if (result.getStatus() == ITestResult.FAILURE)
		  {
			 test.log(Status.FAIL, "test is failed");  
		  }
	  
  }
  
  @AfterSuite
  public void generateReport()
  {
	  report.flush();
  }
}
