package automation_test_selenium_java_testng;

import org.openqa.selenium.edge.EdgeDriver;

// Write a script to open the browser, enter the google.com, and close browser?

public class launch_close_browser {
	
	static {
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		}
	
	public static void main(String[] args) throws InterruptedException{
		
//		ChromeDriver driver = new ChromeDriver();
		
		EdgeDriver driver = new EdgeDriver();
		
		Thread.sleep(5000);
		
		driver.get("https://www.google.com/");
		
		System.out.println("Navigated successed.");
		Thread.sleep(5000);
		driver.close();
	}

}
