package handling_dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdropdown_practices {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Select s=new Select (driver.findElement(By.id("country")));
		s.selectByValue("canada");
		s.selectByVisibleText("Australia");
		s.selectByIndex(4);
		List<WebElement> options=s.getOptions();
	System.out.println(options.size());
	for(int i=0;i<options.size();i++)
	{
		System.out.println(options.get(i).getText());
	}
	
		

	}

}
