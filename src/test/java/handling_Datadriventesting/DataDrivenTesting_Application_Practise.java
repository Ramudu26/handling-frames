package handling_Datadriventesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utilities.ExcelUtils;

public class DataDrivenTesting_Application_Practise {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
driver.findElement(By.xpath("//div//button[@class='No thanks']")).click();
String filepath=System.getProperty("user.dir")+"\\testdata\\caldata.xlsx";
int rows=ExcelUtils.getRowCount(filepath, "Sheet1");
//System.out.println(rows);
for(int i=1;i<=rows;i++)
{
	String Principle=ExcelUtils.getCellData(filepath, "Sheet1", i, 0);
	String roi=ExcelUtils.getCellData(filepath, "Sheet1", i, 1);
	String Period1=ExcelUtils.getCellData(filepath, "Sheet1", i, 2);
	String Period2=ExcelUtils.getCellData(filepath, "Sheet1", i, 3);
	String frequency=ExcelUtils.getCellData(filepath, "Sheet1", i, 4);
	String Maturity_value=ExcelUtils.getCellData(filepath, "Sheet1", i, 5);
	String Expected_value=ExcelUtils.getCellData(filepath, "Sheet1", i, 6);
	
	driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(Principle);
	driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(roi);
    driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(Period1);
    Select s=new Select(driver.findElement(By.xpath("//select[@name='tenurePeriod']")));
    s.selectByVisibleText(Period2);
    Select s1=new Select(driver.findElement(By.xpath("//select[@name='frequency']")));
    s1.selectByVisibleText(frequency);
    driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")).click();
    
  String actual_value=driver.findElement(By.xpath("//span[@class='gL_27']")).getText();
    if(Double.parseDouble(Expected_value)==Double.parseDouble(actual_value))
    {
    System.out.println("test passed");
    ExcelUtils.setCellData(filepath, "Sheet1", i, 7,"Passed");
    ExcelUtils.fillGreenColor(filepath, "Sheet1", i, 7);
}
    else
    {
    	System.out.println("test failed");
        ExcelUtils.setCellData(filepath, "Sheet1", i, 7,"failed");
        ExcelUtils.fillRedColor(filepath, "Sheet1", i, 7);
    }
    Thread.sleep(3000);
    driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_clear.gif']")).click();
	}
driver.quit();
}
}
