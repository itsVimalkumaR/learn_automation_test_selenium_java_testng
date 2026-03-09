package automation_test_selenium_java_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetLocationAndGetSize {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.actitime.com/login-to-product");
		
		Thread.sleep(5000);
		
//		WebElement email_field = driver.findElement(By.xpath("//input[@id='Enteryouremail']"));
//		
//		//To get the size of an element; height & width
//		Dimension size = email_field.getSize();
//		int h = size.getHeight();
//		int w = size.getWidth();
//		
//		System.out.println("Height is: "+ h +", Width is: "+ w);
//		
//		//To get location of an element; x-axis & y-axis
//		Point axis= email_field.getLocation();
//		int x = axis.getX();
//		int y = axis.getY();
//		
//		System.out.println("X-axis is: "+ x + ", Y-axis is: "+ y);
		
		WebElement header_txt = driver.findElement(By.xpath("//h1[normalize-space()='Login to your actiTIME Online account']"));
		
		String font_size = header_txt.getCssValue("font-size");
		String font_weight = header_txt.getCssValue("font-weight");
		
		System.out.println("Actual font size: "+font_weight);
//		if (font_size.equals("30px")) {
//			System.out.println("Matching font size is: "+font_size);
//		} else {
//			System.out.println("Font size doesn't matched.");
//		}
		
		driver.close();
	}
}
