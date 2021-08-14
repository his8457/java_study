package javaBasic.fileReadWrite;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class ReadExcelFile {
	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		FileInputStream fis = new FileInputStream("src/sampleFiles/adm_code.xls");
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		
		HSSFSheet sheet = workbook.getSheetAt(0);
		
		int realRow = sheet.getPhysicalNumberOfRows();
		
		HSSFRow row = null;
		HSSFCell cell = null;
		
		for(int i = 0; i < realRow; i++) {
			row = sheet.getRow(i);
			
			for(int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				cell = row.getCell(j);
				//System.out.println("row[" + i + "]" + " : cell[" + cell + "]");
				System.out.print(cell + "          ");
			}
			System.out.println();
		}
	}
}