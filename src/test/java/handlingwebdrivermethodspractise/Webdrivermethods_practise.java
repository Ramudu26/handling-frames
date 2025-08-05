package handlingwebdrivermethodspractise;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdrivermethods_practise {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		
		//get methods()
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		String windowid=driver.getWindowHandle();
		System.out.println(windowid);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowids=driver.getWindowHandles();
		System.out.println(windowids);
		
		
		//conditional methods()- isDispalyed, isEnabled, isSelected
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.name("gender")).click();
	    driver.close();
		
		
		//navigational commands
		
		driver.get("https://demo.nopcommerce.com/");
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		//windowhandles practise-
	
		//approach 1
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	Set<String> windowids1=driver.getWindowHandles();
	List<String> windowlist=new ArrayList(windowids1);
	String parentid=windowlist.get(0);
	String childid=windowlist.get(1);
	driver.switchTo().window(childid);
	System.out.println(driver.getTitle());
	driver.switchTo().window(parentid);
	System.out.println(driver.getTitle());
	
		//approach 2
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowids11=driver.getWindowHandles();
		List<String> windowlist1=new ArrayList(windowids11);
		for(String wid:windowids11)
		{
			String title=driver.switchTo().window(wid).getTitle();
			if(title.equals("Human Resources Management Software | OrangeHRM HR Software "))
			{
				System.out.println(driver.getCurrentUrl());
				driver.close();
				
			}
		}
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	List<WebElement>	links=driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div/a"));
	System.out.println(links.size());
	for(WebElement li: links)
	{
		li.click();
		System.out.println(li.getText());
	}
	Set<String> windowidss=driver.getWindowHandles();
	System.out.println(windowidss);
	for(String wids: windowidss)
	{
		String title=driver.switchTo().window(wids).getTitle();
		System.out.println(driver.getCurrentUrl());
		String title1=driver.switchTo().window(wids).getTitle();
		if(title1.equals("Selenium - Wikipedia")||title1.equals ("Selenium (software) - Wikipedia")||title1.equals("Selenium dioxide - Wikipedia"))
				{
			System.out.println(driver.getCurrentUrl());
			driver.close();
				}
	}
	}
	

}
