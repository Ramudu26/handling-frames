package handlingautosuggestivedropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class Suggestivedropdown_practices {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
driver.findElement(By.name("field-keywords")).sendKeys("water");
Thread.sleep(5000);
List<WebElement> list=driver.findElements(By.xpath("//div[@class='two-pane-results-container']//div[@class='left-pane-results-container']//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
System.out.println(list.size());

for(int i=0;i<list.size();i++)
{
	System.out.println(list.get(i).getText());
	if(list.get(i).getText().equals("water flosser for teeth"));
	{
	list.get(i).click();
	
}
	}
	
	

	
}}
