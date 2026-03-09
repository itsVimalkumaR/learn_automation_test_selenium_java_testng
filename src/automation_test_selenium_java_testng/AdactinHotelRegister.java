package automation_test_selenium_java_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdactinHotelRegister {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();

		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		
		WebElement signup_link = driver.findElement(By.xpath("//a[.='New User Register Here']"));
		
		System.out.println("Is displayed the Register Link Text :" + signup_link.isDisplayed());
		
		signup_link.click();
		
		Thread.sleep(5000);
						
		String signup_url= driver.getCurrentUrl();
		
		System.out.println("---> "+ signup_url);
		if (signup_url.equals("https://adactinhotelapp.com/HotelAppBuild2/Register.php")) {
			System.out.println("You are successfully landing the register page.");
		} else {
			System.out.println("You are not able to landing the register page.");
		}
		
		driver.findElement(By.id("username")).sendKeys("Hello Test");
		
		driver.findElement(By.id("password")).sendKeys("1234567890");
		
		driver.findElement(By.name("re_password")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//label[@id='full_name_span']/parent::td/input")).sendKeys("Tester");
		
		driver.findElement(By.xpath("//td[text()='Email Address']/following-sibling::td/child::input")).sendKeys("test@example.com");
		
		boolean has_captcha_visible = driver.findElement(By.xpath("//img[contains(@src,'captcha.php')]")).isDisplayed();
		
		if (has_captcha_visible) {
			System.out.println("Captcha should be displayed.");
		}
		
		WebElement terms_chkbox = driver.findElement(By.xpath("//input[@type='checkbox']")); 
		boolean is_unchecked_terms_and_conditions = terms_chkbox.isSelected();
		
		if (is_unchecked_terms_and_conditions == false) {
			System.out.println("The terms & conditions checkbox unchecked by default.");
			terms_chkbox.click();
		} else {
			System.out.println("The terms & conditions checkbox doesn't unchecked by default.");
		}
		
		driver.findElement(By.id("Submit")).submit();
		
	}
}
