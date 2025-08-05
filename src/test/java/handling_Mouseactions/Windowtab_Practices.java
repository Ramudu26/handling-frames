package handling_Mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowtab_Practices {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	


		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		//driver.get("https://demo.nopcommerce.com/");
		//driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		
				
	}}
		
