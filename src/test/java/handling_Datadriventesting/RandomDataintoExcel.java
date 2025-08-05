package handling_Datadriventesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RandomDataintoExcel {

	public static void main(String[] args) throws IOException {
		//open the file in writing mode
		FileOutputStream file=new FileOutputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumwebdriver\\testdata\\Randomdata.xlsx");
		//workbook
		XSSFWorkbook workbook =new XSSFWorkbook();	
		//sheet
		XSSFSheet sheet= workbook.createSheet("ranData");
		
		XSSFRow row=sheet.createRow(4);
		XSSFCell cell=row.createCell(2);
		cell.setCellValue("java");
			
		
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("File created");
	}

}
