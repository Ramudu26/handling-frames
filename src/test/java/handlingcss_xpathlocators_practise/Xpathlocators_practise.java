package handlingcss_xpathlocators_practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathlocators_practise {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.get("https://tutorialsninja.com/demo/");

		//tagname[@attribute='value']
		
		driver.findElement(By.xpath("//img[@title='MacBook']")).click(); 

		 //xpath with single element
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("amazon"); 
		
		//xpath with multiple element
		
		driver.findElement(By.xpath("//input[@type='text'] [@placeholder='Search']")).sendKeys("amazonnnnn"); 
		
		//xpath with 'and' operator
		 
		driver.findElement(By.xpath("//input[@type='text'and @placeholder='Search']")).sendKeys("select");  
		
		//xpath with 'or' operator
		 
		driver.findElement(By.xpath("//input[@type='text' or @placeholder='Search']")).sendKeys("selecttttt");  
		
		//xpath with text()- inner text
		
		 
		driver.findElement(By.xpath("//a[text()='Desktops']")).click(); 
		boolean displaystatus=driver.findElement(By.xpath("//*[text()='Featured']")).isDisplayed();
		System.out.println(displaystatus); 
		
		//xpath with contains()
		driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("super"); 
		
		//xpath with starts-with()
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("super"); 
				
		//chained xpath
		
		driver.findElement(By.xpath("//div[@class='swiper-slide text-center swiper-slide-duplicate swiper-slide-active']/a/img")).click();
		
	}

}
