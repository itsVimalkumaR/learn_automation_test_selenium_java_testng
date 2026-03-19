package automation_test_selenium_java_testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dummyTable {

public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/webtables");
		
		Thread.sleep(5000);
		
		String headers[] = {"First name", "Last name", "Age", "Email", "Salary", "Department", "Action"};
		
		List<WebElement> table_headers = driver.findElements(By.xpath("//table/thead/tr/th"));
		
		for(WebElement ele: table_headers) {
			
			System.out.println(ele.getText());
		}
		
		System.out.println("---------------------------------");
		
		for (int i = 0; i <= headers.length; i++) {
			String header_text = table_headers.get(i).getText();
			
			String table_header = driver.findElement(By.xpath("//table/thead/tr/th["+ i +"]")).getText();	// //table/thead/tr/th[7]
			System.out.println(table_header);
			
			if (header_text.equals("Age")) {
				System.out.println(header_text);
			}
		}
		
		driver.close();
		
	}
}
