package automation_test_selenium_java_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class navigate_cmds {

	public static void main(String[] args) throws Exception{
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		
		String pageSource = driver.getPageSource();
		
		System.out.println(pageSource);
		
//		driver.navigate().to("https://www.facebook.com/");
//		Thread.sleep(3000);
//		
//		driver.navigate().back();
//		Thread.sleep(3000);
//		
//		driver.navigate().refresh();
//		Thread.sleep(3000);
//		
//		driver.navigate().forward();
	}
}
