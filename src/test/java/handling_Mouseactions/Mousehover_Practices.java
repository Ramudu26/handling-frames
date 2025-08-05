package handling_Mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover_Practices {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	

		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();

		Actions a=new Actions(driver);
		WebElement desktops=driver.findElement(By.xpath("//*[text()='Desktops']"));
		a.moveToElement(desktops).build().perform();
		WebElement mac=driver.findElement(By.xpath("//*[text()='Mac (1)']"));
		a.moveToElement(mac).build().perform();
		mac.click();
	}

}
