package handling_Datadriventesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DynamicDataintoExcel {

	public static void main(String[] args) throws IOException {
		//open the file in writing mode
		FileOutputStream file=new FileOutputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumwebdriver\\testdata\\Dynamicdata.xlsx");
		//workbook
		XSSFWorkbook workbook =new XSSFWorkbook();	
		//sheet
		XSSFSheet sheet= workbook.createSheet("DyData");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many rows:");
		int noofrows=sc.nextInt();
		System.out.println("Enter how many cells:");
		int noofcells=sc.nextInt();
		
		for(int r=0;r<=noofrows;r++)
		{
			XSSFRow currentrow=sheet.createRow(r);
			for(int c=0;r<=noofcells;c++)
			{
				XSSFCell cell=currentrow.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("File created");
	}

}
