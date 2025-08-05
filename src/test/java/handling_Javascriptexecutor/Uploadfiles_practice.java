package handling_Javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfiles_practice {

	public static void main(String[] args) throws InterruptedException {
		
		
        WebDriver driver =new ChromeDriver();
        
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);
/*single file upload		
driver.findElement(By.xpath("//input[@name='filesToUpload']")).sendKeys("C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumwebdriver\\testdata\\text1.txt");
	*/
	//multiple files upload
String file1="C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumwebdriver\\testdata\\text1.txt";
String file2="C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumwebdriver\\testdata\\text2.txt";

driver.findElement(By.xpath("//input[@name='filesToUpload']")).sendKeys(file1+"\n"+file2);
int nooffilesuploaded=driver.findElements(By.xpath("//input[@name='filesToUpload']")).size();
System.out.println(nooffilesuploaded);
	}

}
