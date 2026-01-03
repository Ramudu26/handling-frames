package handling_Javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor_Scrollbar_practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
        
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	


		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement name=driver.findElement(By.xpath("//input[@placeholder='Enter Name']"));
		js.executeScript("arguments[0].setAttribute('value','john')", name);
		
		WebElement male=driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()", male);
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		js.executeScript("window.scrollBy(0,2000)", "");
		System.out.println(js.executeScript("return window.pageYOffset;")); 
		
	WebElement	ele=driver.findElement(By.xpath("//strong[normalize-space()='News']"));
	js.executeScript("arguments[0].scrollIntoView();", ele); 
	System.out.println(js.executeScript("return window.pageYOffset;")); 
	
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;")); 
		
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
	}

}
