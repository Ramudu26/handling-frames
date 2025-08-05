package handling_Mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactions_Practices {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	


		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();

		
		
		Actions a=new Actions(driver);
	WebElement text1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		text1.sendKeys("hey hw r u");
		a.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
		a.keyDown(Keys.CONTROL).sendKeys("X").keyUp(Keys.CONTROL).build().perform();
		a.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		a.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
		
	}}
		
