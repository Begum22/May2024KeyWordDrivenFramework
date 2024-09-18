package com.facebook_base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.facebook_utilities.TestReader;

public class BaseTest {

	//same test case but run with multiple browsers
	//chrome, edge, firefox
	public WebDriver driver;
	
	//String browser="Chrome";
	
	TestReader tr;

	public void  openApplication() {
	
		tr=new TestReader();
		String browser = tr.readBrowser();
		if(browser.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
			
		}else if (browser.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
			
		}else if (browser.equalsIgnoreCase("Firefox")) {
			driver= new FirefoxDriver();
			
		}else {
			System.out.println("You put wrong browser name");
		}
		
		String facebookQAUrl = tr.readUrl();
		driver.get(facebookQAUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	
	
	public void closeApplication() {
		if(driver!= null) {
			driver.quit();
		}
	}


}
