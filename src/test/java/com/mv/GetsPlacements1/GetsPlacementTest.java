package com.mv.GetsPlacements1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GetsPlacementTest {

	WebDriver driver;

	@Test(dataProvider = "InputData", dataProviderClass = TestData.class)
	public void TestMethod(Helper helper) throws InterruptedException {
		// Launch Firefox browser
		// System.setProperty("webdriver.chrome.driver",");
		WebDriverManager.chromedriver().version("79.0.3945.36").setup();

		Utilities u = new Utilities();

		WebDriverManager.firefoxdriver().setup();
		WebDriver firefoxdriver = new FirefoxDriver();
		CallBrowserWiseDriver(firefoxdriver, helper.token1);
		u.checkCondition(firefoxdriver);

		WebDriverManager.chromedriver().version("79.0.3945.36").setup();
		WebDriver chromedriver = new ChromeDriver();
		CallBrowserWiseDriver(chromedriver, helper.token2);
		u.checkCondition(chromedriver);

		// WebDriverManager.iedriver().version("11.675.18362.0").setup();
		// WebDriver iedriver=new InternetExplorerDriver();
		// CallBrowserWiseDriver(iedriver,helper.token3);
		// u.checkCondition(iedriver);
		// checkCondition
		WebDriverManager.edgedriver().setup();
		// WebDriver edgedriver=new EdgeDriver();
		DesiredCapabilities capabilities = DesiredCapabilities.edge();
		@SuppressWarnings("deprecation")
		WebDriver edgedriver = new EdgeDriver(capabilities);
		CallBrowserWiseDriver(edgedriver, helper.token3);
		u.checkCondition(edgedriver);

	}

	public void CallBrowserWiseDriver(WebDriver driver, String token) throws InterruptedException {

		// maximize the browser
		driver.manage().window().maximize();
		// wait for atleast 10 sec to find the element
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// open the URL
		driver.get("http://mashvirtual.info/getsplacementtest/");
		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys(token);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath(" //div[@id='dvChkAudioImageId']//img")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@id='btnNextId']")).click();
		// start
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	}
}
