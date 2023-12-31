package week5.day3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	@Test
	public void readExcelData() throws IOException {
		
		//Open the Excel book
		XSSFWorkbook book = new XSSFWorkbook("./data/CreateLead.xlsx");
		
		//To get the sheet by using index
		//Index starts from 0
		XSSFSheet sheet = book.getSheetAt(0);
		
		//To get the row count
		//Row count starts from 0
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row count is : " + rowCount);
		
		//To get the total column count
		//Column count starts from 1
		int colCount = sheet.getRow(rowCount).getLastCellNum();
		System.out.println("Column count is : " + colCount);
	
		//To print the value "Babu"
		//To get the value, both the index of column and row will start from 0. Hence to print "Babu" we need to give index value as 1 and not 2
		String stringCellValue = sheet.getRow(2).getCell(1).getStringCellValue();
		System.out.println("Cell value is : " + stringCellValue);
	
	}

}




