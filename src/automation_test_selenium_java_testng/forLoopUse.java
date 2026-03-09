package automation_test_selenium_java_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class forLoopUse {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
		
		for (int i = 1; i <= 6; i++) {
			String txt = driver.findElement(By.xpath("//form[@id='login_form']/table/tbody/tr["+ i +"]/following-sibling::tr/td[1]")).getText();
			System.out.println(txt);
		}
	}
}
