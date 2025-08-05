package handlingcss_xpathlocators_practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_locators_practise {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();

		driver.get("https://tutorialsninja.com/demo/");

		//id- tag#id
		
		WebElement logo=driver.findElement(By.cssSelector("div#logo"));
		
         System.out.println("passed");
	

	
		//classname - tag.classname
		
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("books");
		
		//attribute - tag[attribute='value']
		
		driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("hi");
		
		//class attribute - tag.classname[attribute='value']
		
		driver.findElement(By.cssSelector("input.form-control[placeholder='Search']")).sendKeys("hiiiiiiiiiii");
}}
