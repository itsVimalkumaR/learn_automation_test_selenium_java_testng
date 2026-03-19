package automation_test_selenium_java_testng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.commons.io.FileUtils;

public class DropDown_SingleValue {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://ironspider.ca/forms/dropdowns.htm");

        WebElement dropDown = driver.findElement(By.name("coffee"));

        // Take Screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        File src = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("screenshot.png"));

        driver.close();
    }
}