package handling_Mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick_Doubleclick_Practices {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	

	//	driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		
		Actions a=new Actions(driver);
		
		//Right click()
		/*WebElement button=driver.findElement(By.xpath("//*[text()='right click me']"));
		a.contextClick(button).build().perform();
		WebElement edit=driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-edit']"));
		edit.click();
		driver.switchTo().alert().accept(); */
		
		//Double click()
		
		WebElement textbox1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement textbox2=driver.findElement(By.xpath("//input[@id='field2']"));
		
		WebElement button1=driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		textbox1.clear();
		textbox1.sendKeys("hey");
		a.doubleClick(button1).build().perform();
		
		//validation box2 should contains hey 
		String text=textbox2.getAttribute("value");
		if(text.equals("hey"))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
	}

}}
