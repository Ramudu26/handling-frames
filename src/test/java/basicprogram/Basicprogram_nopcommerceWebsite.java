package basicprogram;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicprogram_nopcommerceWebsite {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

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
