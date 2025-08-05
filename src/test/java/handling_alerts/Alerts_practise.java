package handling_alerts;



import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts_practise {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();

		WebDriverWait mywait=new WebDriverWait (driver,Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//simple alert
		driver.findElement(By.id("alertBtn")).click();
		Alert simplealert=mywait.until(ExpectedConditions.alertIsPresent());
		Alert simplealert1=driver.switchTo().alert(); 
		System.out.println(simplealert1.getText());
		Thread.sleep(5000);
        simplealert1.accept();
        
        //confirmation alert
        driver.findElement(By.id("confirmBtn")).click();
		Alert confirmationalert=driver.switchTo().alert();
		System.out.println(confirmationalert.getText());
		Thread.sleep(5000);
        //confirmationalert.accept();
		confirmationalert.dismiss();
		
		//prompt alert
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click(); //opens alert
		Thread.sleep(5000);
		Alert myalert=driver.switchTo().alert();
		//System.out.println("Text msg on alert:"+myalert.getText()); //I am a JS prompt
		myalert.sendKeys("John");
		myalert.accept();

		driver.findElement(By.id("promptBtn")).click(); //opens alert
			Thread.sleep(5000);
			Alert myalert1=driver.switchTo().alert();
			//System.out.println("Text msg on alert:"+myalert.getText()); //I am a JS prompt
			myalert1.sendKeys("John");
			myalert1.accept(); 
	
		//Authentication popup
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
		//rediff my page- alerts
		
		driver.get("https://mypage.rediff.com/login/dologin");
		driver.manage().window().maximize();
		driver.findElement(By.id("btnLogin")).click();
		Alert myalert11=driver.switchTo().alert();
		System.out.println(myalert11.getText());
		myalert11.accept();
		
		
	}

}
