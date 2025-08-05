package handlingtables;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticwebtable_practice3 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		

		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		Select from=new Select (driver.findElement(By.xpath("//select[@name='fromPort']")));
		from.selectByVisibleText("Boston");
		Select to=new Select (driver.findElement(By.xpath("//select[@name='toPort']")));
		to.selectByVisibleText("Berlin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		int rows=driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
		System.out.println("number of rows in table:"+rows); //5
		for(int r=1;r<=rows;r++)
		{
		driver.findElement(By.xpath("//table[@class='table']//tbody//tr[3]/td[1]//input")).click();
		break;
		}
			driver.findElement(By.id("inputName")).sendKeys("John");
			driver.findElement(By.id("address")).sendKeys("1403 American Beauty Ln");
			driver.findElement(By.id("city")).sendKeys("Columbus");
			driver.findElement(By.id("state")).sendKeys("OH");
			driver.findElement(By.id("zipCode")).sendKeys("43240");
			driver.findElement(By.id("creditCardNumber")).sendKeys("6789067345231267");
			driver.findElement(By.id("creditCardYear")).clear();
			driver.findElement(By.id("creditCardYear")).sendKeys("2023");
			driver.findElement(By.id("nameOnCard")).sendKeys("John Canedy");
			driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
			
			String msg=driver.findElement(By.xpath("//h1")).getText();
				
			if(msg.contains("Thank you for your purchase"))
			{
			System.out.println("Success !! Passed");
			}
			else
			{
			System.out.println("Failed");	
			}
			
			driver.quit();
				

	}}