package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteXlsFile {

	public static void main(String[] args) throws IOException {

		// Create an object of File class to open .xls file
		File file = new File("C:\\smita\\Selenium\\Read.xls");

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);

		// creating workbook instance that refers to .xls file
		HSSFWorkbook wb = new HSSFWorkbook(inputStream);

		// creating a Sheet object using the sheet Name
		HSSFSheet sheet = wb.getSheet("sheet1");

		// Create a row object to retrieve row at index 3
		HSSFRow row2 = sheet.createRow(8);

		// create a cell object to enter value in it using cell Index
		row2.createCell(0).setCellValue("Pooja");
		row2.createCell(1).setCellValue("Jane");
		row2.createCell(2).setCellValue("djanes@gmail.com");
		row2.createCell(3).setCellValue("Male");
		row2.createCell(4).setCellValue("8786858432");
		row2.createCell(5).setCellValue("ParkLane,FlatC1,NewJersey");

		// write the data in excel using output stream
		FileOutputStream outputStream = new FileOutputStream("C:\\smita\\Selenium\\write.xls");
		wb.write(outputStream);
		wb.close();
	}

}
