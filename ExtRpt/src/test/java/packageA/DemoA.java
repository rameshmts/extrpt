package packageA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class DemoA {
	ExtentReports extent;
	
	
	@BeforeTest
	
	public void bftest()
	{
		String path = System.getProperty("user.dir")+"\\reports\\index1.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("WebAutomationResult");
		reporter.config().setDocumentTitle("Test Results");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Ramesh");
		
	}
	@Test
	public void seltest()
	{
		extent.createTest("seltest");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		driver.getTitle();
		extent.flush();
		
	}

}
