package basicprogram;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicprogram_opencartWebsite {

	public static void main(String[] args) {
	
WebDriver driver =new ChromeDriver();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.manage().window().maximize();

driver.get("https://tutorialsninja.com/demo/");

//validating the title - i.e. Your Store

String act_title=driver.getTitle();
if(act_title.equals("Your Store"))
{
	System.out.println("Test Passed");
}
else {
	 System.out.println("Test Failed");
		}
driver.close();
}
   

}