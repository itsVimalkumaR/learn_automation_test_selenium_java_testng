package automation_test_selenium_java_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class tilte_currentURL {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println("Title: "+driver.getTitle());
		
		String current_url = driver.getCurrentUrl();
		
		System.out.println("URL: "+current_url);
	}
}
