package handlingtables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamictablewithPagination {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	//No of rows	
int rows=driver.findElements(By.xpath("//div[@class='table-container']//tr")).size();
System.out.println(rows);
//No of columns
int columns=driver.findElements(By.xpath("//div[@class='table-container']//th")).size();
System.out.println(columns);

/*Read data from each row and column and then click the checkbox each row
for (int r=1;r<=rows;r++)
{
	for (int c=1;c<=columns;c++)
	{
		driver.findElement(By.xpath("//div[@class='table-container']//tr["+r+"]//td["+c+"]"));
	
	}*/
//no.of pages
int tot_pages=driver.findElements(By.xpath("//ul[@class='pagination']//li")).size();
System.out.println(tot_pages);

//click every page till last page

for (int p=1;p<=tot_pages;p++)
{
	if(p>1)
	{
	WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//li["+p+"]"));
	active_page.click();
	Thread.sleep(3000);
}
	for (int r=1;r<=rows;r++)
	{
	String Name=driver.findElement(By.xpath("//div[@class='table-container']//tr["+r+"]//td[2]")).getText();
	System.out.println(Name);

}}}}