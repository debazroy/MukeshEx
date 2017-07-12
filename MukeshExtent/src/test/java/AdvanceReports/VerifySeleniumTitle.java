package AdvanceReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.ChromeDriverManager;


public class VerifySeleniumTitle {
	@Test
	 public void verifySeleniumBlog(){
		 ExtentReports logger = ExtentReports.get(VerifySeleniumTitle.class);
		 logger.init("C:\\EclipseJava\\javaworkspace\\MukeshExtent\\Reports\\ExtentReport.html", true);
		 logger.startTest("Verify Page Title");
		 ChromeDriverManager.getInstance().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 logger.log(LogStatus.INFO, "Browser started");
		 driver.get("http://amazon.com");
		 logger.log(LogStatus.INFO, "Navigated to www.amazon.com");
		 String title=driver.getTitle();
		 logger.log(LogStatus.INFO, "Get the current title");
		 Assert.assertTrue(title.contains("Amazon.com: Shopping for Electronics, Apparel, Computers, Books, DVDs & more"));
		 logger.log(LogStatus.PASS, "Title verified");
		 logger.attachScreenshot("C:\\EclipseJava\\javaworkspace\\Mukesh\\screenshot.bmp");
		 driver.get("C:\\EclipseJava\\javaworkspace\\MukeshExtent\\Reports\\ExtentReport.html");
		 driver.quit();
		 logger.log(LogStatus.INFO, "Browser closed");
		 logger.endTest();
		 
		 
		 
	 }

}
