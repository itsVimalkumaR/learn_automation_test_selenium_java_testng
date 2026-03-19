package automation_test_selenium_java_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class JSPromptExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Click JS Prompt button
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

        // Switch to alert
        Alert alert = driver.switchTo().alert();

        // Enter text in prompt
        alert.sendKeys("Hello");
        
        // Click OK
        alert.accept();
        

    }
}