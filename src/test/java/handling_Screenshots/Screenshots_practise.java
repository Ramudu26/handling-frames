package handling_Screenshots;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots_practise {

	public static void main(String[] args) {
		  WebDriver driver =new ChromeDriver();
	        
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	        driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			TakesScreenshot ts=(TakesScreenshot) driver;
			
			driver.findElement(By.xpath("//input[@id='sunday']")).click();
File sourcefile=ts.getScreenshotAs(OutputType.FILE);
File Targetfile= new File(System.getProperty("user.dir")+"//screenshots//webelementpage.png");
sourcefile.renameTo(Targetfile);
	}

}
