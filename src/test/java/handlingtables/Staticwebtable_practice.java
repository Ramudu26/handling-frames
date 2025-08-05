package handlingtables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Staticwebtable_practice {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//no of rows in the table
		
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(rows);
		
		//no of columns in the table
		
		int columns=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println(columns);
		
		//Read data from particular row and column i.e.3rd row and 1st column
		
		WebElement specificrowandcolumn =driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]//td[1]"));
		System.out.println(specificrowandcolumn.getText()); 
		
		//Read each row and column
		
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=columns;c++)
			{
				String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(data+"\t");
			}
			System.out.println();
		}
		
		//print booknames whose author is Amit
		
		for (int r=2;r<=rows;r++)
		{
			String authorname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if(authorname.equals("Amit"))
			{
				String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(bookname+""+authorname);
			}
			
			
		}
		
		//print total amount of all the books
		int total=0;
		for (int r=2;r<=rows;r++)
		{
		
		String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
		total=total+Integer.parseInt(price);
		
	}
		System.out.println(total);

}}
