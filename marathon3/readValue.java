package marathon3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readValue {

	public static String[][] readData(String fileName) throws IOException {

		// setup the path for excel
		XSSFWorkbook workBook = new XSSFWorkbook("./data/"+fileName+".xlsx");

		// get the specific sheet from workbook based on index or string
		XSSFSheet sheet = workBook.getSheetAt(0);

		// get into the row
		// XSSFRow row = sheet.getRow(0);
		int rowCount = sheet.getLastRowNum();
		short columnCount = sheet.getRow(0).getLastCellNum();

		// String [][]
		String[][] data = new String[rowCount][columnCount];
		
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				// Get into the column using row
				XSSFCell cell = row.getCell(j);
				// To read value from the cell
				String cellValue = cell.getStringCellValue();
				// assign values
				data[i-1][j] = cellValue;
				// print the cell value in console
				System.out.println(cellValue);
			}
		}
		// close the workbook
		workBook.close();
		return data;

	}

}