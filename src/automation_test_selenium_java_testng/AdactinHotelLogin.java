package automation_test_selenium_java_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdactinHotelLogin {

	public static void main(String[] args) throws Exception {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		
//		driver.findElement(By.linkText("Forgot Password?")).click();
		
		Thread.sleep(3000);
//		driver.findElement(By.id("username")).sendKeys("vimalutr16");
//		driver.findElement(By.className("login_input")).sendKeys("vimalutr16");
//		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/table/tbody/tr[2]/td/input[@id=\"username\"]")).sendKeys("vimalutr16");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vimalutr16");

	}
}
