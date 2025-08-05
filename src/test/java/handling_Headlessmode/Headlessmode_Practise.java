package handling_Headlessmode;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlessmode_Practise {

	public static void main(String[] args) {
		
		ChromeOptions  options=new ChromeOptions();
		options.addArguments("--incognito");
WebDriver driver =new ChromeDriver(options);
        
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	


		driver.get("https://demo.nopcommerce.com/");

		//validating the title - i.e. nopCommerce demo store. Home page title
		String act_title=driver.getTitle();
		if(act_title.equals("nopCommerce demo store. Home page title"))
		{
			
			System.out.println("Test Passed");
		}
		else {
			 System.out.println("Test Failed");
				}
		driver.close();
		}
		

	}


