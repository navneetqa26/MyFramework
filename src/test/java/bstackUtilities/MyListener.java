package bstackUtilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

public class MyListener implements ITestListener

{
		
	@Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started: " + result.getName());
       
        
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped: " + result.getName());
    }
    
    public void onFinish(ITestContext context) {
    	System.out.println("All tests in the test tag have finished.");
        System.out.println("Passed tests: " + context.getPassedTests().size());
        System.out.println("Failed tests: " + context.getFailedTests().size());
    }
	

}
