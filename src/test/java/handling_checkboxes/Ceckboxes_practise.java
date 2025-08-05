package handling_checkboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ceckboxes_practise {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
/*List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//System.out.println(checkboxes.size());

/*for(int i=0;i<checkboxes.size();i++)
{
	checkboxes.get(i).click();
}*/

/*for (WebElement ch:checkboxes)
{
	ch.click();
}
	}*/
/*for (int i=4;i<checkboxes.size();i++)
{
	checkboxes.get(i).click();
}*/
	/*for (int i=0;i<3;i++)
	{
		checkboxes.get(i).click();
	}*/


		/*for (int i=0;i<3;i++)
{
	checkboxes.get(i).click();
}
Thread.sleep(5000);
for(int i=0;i<3;i++)
{
	if(checkboxes.get(i).isSelected())
	{
		checkboxes.get(i).click();	}
}*/

	//driver.findElement(By.xpath("//div[@class='table-container']//tr[1]//td[4]")).click();
	//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
}
	

	}

		
		