package handling_Datadriventesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writingmode {

	public static void main(String[] args) throws IOException {
		//open the file in writing mode
		FileOutputStream file=new FileOutputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Seleniumwebdriver\\testdata\\Writedata.xlsx");
		//workbook
		XSSFWorkbook workbook =new XSSFWorkbook();	
		//sheet
		XSSFSheet sheet= workbook.createSheet("writeData");
		
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("selenium");
		row1.createCell(1).setCellValue("best course");
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("Java");
		row2.createCell(1).setCellValue("best");
	workbook.write(file);
	}

}
