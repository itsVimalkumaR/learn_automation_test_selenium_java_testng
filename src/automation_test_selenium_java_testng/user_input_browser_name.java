package automation_test_selenium_java_testng;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class user_input_browser_name {
	
	static WebDriver driver = null;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter Browser Name");
		String browser_name = sc.nextLine();		
		
		if (browser_name.equals("Chrome")) {
			driver = new ChromeDriver();
			System.out.println("Chrome browser");
		} else if (browser_name.equals("Firefox")) {
			driver = new FirefoxDriver();
			System.out.println("Firefox browser");
		} else if (browser_name.equals("edge")) {
			driver = new EdgeDriver();
			System.out.println("Edge browser");
		} else {
			System.out.println("Unsupported browser name");
		}
	}

}
