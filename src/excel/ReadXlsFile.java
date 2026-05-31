package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadXlsFile {

	public static void main(String[] args) throws IOException {
		// Open .xls file
		FileInputStream file = new FileInputStream("C:\\smita\\Selenium\\Read.xls");

		// Create Workbook (.xls → HSSFWorkbook)
		HSSFWorkbook workbook = new HSSFWorkbook(file);

		// Get first sheet
		HSSFSheet sheet = workbook.getSheetAt(0);

		// Get total number of rows
		int totalRows = sheet.getLastRowNum();

		System.out.println("Total Rows: " + totalRows);

		// Loop through rows
		for (int i = 0; i <= totalRows; i++) {

			HSSFRow row = sheet.getRow(i);

			if (row != null) {

				int totalCells = row.getLastCellNum();

				// Loop through cells
				for (int j = 0; j < totalCells; j++) {

					HSSFCell cell = row.getCell(j);

					if (cell != null) {
						System.out.print(cell.toString() + "  ");
					}
				}

				System.out.println(); // new line after each row
			}
		}

		workbook.close();
		file.close();
	}

}
