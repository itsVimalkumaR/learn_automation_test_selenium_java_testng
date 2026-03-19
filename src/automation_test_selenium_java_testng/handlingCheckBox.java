package automation_test_selenium_java_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class handlingCheckBox {

	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		// launch the browser
		driver = launchBrowser();
		Thread.sleep(5000);
		
		// Login the app
		login("Admin", "admin123");	
		
		// Close the alert
//		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		// Navigate to Admin page
		navigateToAdmin();
		Thread.sleep(5000);
		
		// Validate all options checkbox by default is unchecked, then selected/checked. 
		WebElement allOptsChkBox = validateCheckboxStatus();
		
		
		// Validate checked after validated that checkbox should be by default unchecked
		boolean status = allOptsChkBox.isSelected();
		if (status) {
			System.out.println("Successfully selected...");
		} else {
			System.out.println("Doesn't selected: "+status);
		}
		
		closeBrowser();
	}
	
	public static WebDriver launchBrowser() throws InterruptedException {
//		driver = new FirefoxDriver();
//		driver = new ChromeDriver();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		return driver;
	}
	
	public static void enterUsername(String username) {
		WebElement username_textfield = driver.findElement(By.name("username"));
		username_textfield.sendKeys(username);
		System.out.println("Username entered: "+ username);
	}
	
	public static void enterPassword(String password) {
		WebElement pwd_txtbox = driver.findElement(By.name("password"));
		pwd_txtbox.sendKeys(password);
		System.out.println("Password entered: "+ password);
	}
	
	public static void submit() {
		WebElement login_btn = driver.findElement(By.xpath("//button[@type='submit']"));
		login_btn.submit();
		System.out.println("Successfully triggered login button.");
	}
	
	public static void login(String username, String password) throws InterruptedException {
		enterUsername(username);
		enterPassword(password);

		Thread.sleep(3000);
		submit();
		
		System.out.println("Successfully logged in...");
	}
	
	public static void navigateToAdmin() throws Exception{
		driver.findElement(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']")).click();
		System.out.println("Successfully navigated to Admin page");
		Thread.sleep(2000);
	}
	
	public static WebElement validateCheckboxStatus() throws Exception{
		WebElement allOptsChkBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]/following-sibling::span"));
		allOptsChkBox.isDisplayed();
		System.out.println("Checkbox should be displayed.");
		boolean has_selected_all_opts_chkbox =  allOptsChkBox.isSelected();
		if (has_selected_all_opts_chkbox == false) {
			Thread.sleep(2000);
			allOptsChkBox.click();
			System.out.println("Selected: "+ allOptsChkBox.isSelected());
			Thread.sleep(5000);
		} else {
			System.out.println("By default is selected");
		}
		return allOptsChkBox;
	}
	
	public static void closeBrowser() {
		driver.quit();
	}
}
