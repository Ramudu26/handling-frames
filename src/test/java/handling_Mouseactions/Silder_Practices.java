package handling_Mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Silder_Practices {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	


		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();

		
		
		Actions a=new Actions(driver);
		WebElement min_slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		System.out.println("location of min slider:"+min_slider.getLocation());// (59, 250)
		a.dragAndDropBy(min_slider, 123, 250).build().perform();
		System.out.println("location of min slider:"+min_slider.getLocation()); //(181, 250)
		WebElement max_slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		System.out.println("location of max slider:"+max_slider.getLocation());// (59, 250)
		a.dragAndDropBy(max_slider, -123, 250).build().perform();
		System.out.println("location of max slider:"+max_slider.getLocation()); //(181, 250)
		
		
	}}
		
