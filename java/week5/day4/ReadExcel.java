package week5.day4;

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
		//Index starts from 0S
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
	
		
		String firstCname = sheet.getRow(1).getCell(0).getStringCellValue();
		String firstfName = sheet.getRow(1).getCell(1).getStringCellValue();
		String firstLName = sheet.getRow(1).getCell(2).getStringCellValue();
		String firstPhNo = sheet.getRow(1).getCell(3).getStringCellValue();
	
		System.out.println(firstCname);
		System.out.println(firstfName);
		System.out.println(firstLName);
		System.out.println(firstPhNo);
		
		System.out.println("------------------------------------");
		
		//As in the above 4 lines, only the index is changed, we can use for loop. Here it should be i<3, in general i<column count
		for(int i = 1; i <= rowCount; i++) {
			for(int j = 0;j < colCount; j++) {
				String celValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(celValue);
			}
		}
		
		
	}

}


// In order to convert Numeric cell value to String, then add ' in front of the numeric value in the excel 




