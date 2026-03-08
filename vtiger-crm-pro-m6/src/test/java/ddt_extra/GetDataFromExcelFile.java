package ddt_extra;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataFromExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./src/test/resources/testScriptData.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		String value1 = wb.getSheet("org").getRow(2).getCell(0).getStringCellValue();
		
		
		System.out.println(value1);

		
		
		
//		boolean value2 = wb.getSheet("org").getRow(2).getCell(2).getBooleanCellValue();
//		double value3 = wb.getSheet("org").getRow(2).getCell(3).getNumericCellValue();

//		cell.getNumericCellValue();
//		cell.getBooleanCellValue();

//		System.out.println(value2);
//		System.out.println(value3);

		wb.close();
	}
}
