package bstackUtilities;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporting {
	
	static ExtentReports report;
	static ExtentTest test;
	static ExtentSparkReporter reporter;
	
	public ExtentReports startReport()
	{
		report = new ExtentReports();
		String filePath = "C:\\Users\\HP\\eclipse-workspace\\FrameWorkLessons\\TestReport\\TestReport.html";
		reporter = new ExtentSparkReporter(new File(filePath));
		report.attachReporter(reporter);
		return report;
	}

}
