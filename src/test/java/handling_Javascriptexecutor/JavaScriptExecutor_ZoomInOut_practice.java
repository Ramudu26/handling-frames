package handling_Javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor_ZoomInOut_practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
        
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	


		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='50%'");
		Thread.sleep(5000);
		js.executeScript("document.body.style.zoom='200%'");
		}

}
