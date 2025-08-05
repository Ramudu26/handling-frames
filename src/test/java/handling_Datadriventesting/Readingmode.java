package handling_Datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readingmode {

	public static void main(String[] args) throws IOException {
		//open the file in reading mode
		FileInputStream file=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumwebdriver\\testdata\\MYdata.xlsx");
		//workbook
		XSSFWorkbook workbook =new XSSFWorkbook(file);	
		//sheet
		XSSFSheet sheet= workbook.getSheetAt(0);
		//rows
		int noofrows=sheet.getLastRowNum();
		//cells
		int noofcells=sheet.getRow(0).getLastCellNum();
		
		System.out.println(noofrows);
		System.out.println(noofcells);
        
		//Reading data from each row and column
		
		for(int r=0;r<=noofrows;r++)
		{
			XSSFRow currentrow=sheet.getRow(r);
			for(int c=0;c<noofcells;c++)
			{
				XSSFCell cell=currentrow.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		workbook.close();
		file.close();
	}

}
