package handling_dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdropdown_practise {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement> colorss=driver.findElements(By.xpath("//select[@id='colors']//option"));
/*System.out.println(colorss.size());
	}*/
		
for(int i=0;i<colorss.size();i++)
{
	colorss.get(i).click();
	System.out.println(colorss.get(i).getText());

}
}}