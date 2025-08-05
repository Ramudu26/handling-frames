package basiclocatorspractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basiclocatorspractise {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://www.demoblaze.com/index.html");
		driver.get("https://demo.nopcommerce.com/");
		
		// Total no of links in the webpage
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total no of links"+" "+links.size());
		
		
		// Total no of images in the webpage
		
				List<WebElement> images=driver.findElements(By.tagName("img"));
				System.out.println("Total no of images"+" "+images.size());
				
		//Click on any product link using link text/partial link text
				
				driver.findElement(By.linkText("Samsung galaxy s6")).click();
				driver.findElement(By.partialLinkText("Nokia lumia")).click();
				
		//id
				driver.findElement(By.id("small-searchterms")).sendKeys("titans");
				
		//name
				
				driver.findElement(By.name("q")).sendKeys("james");
				
				
	}

}
