package Assignmentutilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutilities {

	public FileInputStream fil;

	public FileOutputStream fo;

	public XSSFWorkbook workbook;

	public XSSFSheet sheet;

	public XSSFRow row;
	public XSSFCell cell;
	public CellStyle style;
	String path = null;

	public excelutilities(String path) {
		this.path = path;
	}

	public int getRowcount(String sheetName) throws IOException {
		fil = new FileInputStream(path);
		workbook = new XSSFWorkbook(fil);
		sheet = workbook.getSheet(sheetName);
		int rowcount = sheet.getLastRowNum();
		workbook.close();
		fil.close();
		return rowcount;
	}

	public int getcellcount(String sheetName, int rownum) throws IOException {
		fil = new FileInputStream(path);
		workbook = new XSSFWorkbook(fil);
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rownum);
		int cellcount = row.getLastCellNum();
		workbook.close();
		fil.close();
		return cellcount;
	}

	public String getCelldata(String SheetName, int rownum, int colnum) throws IOException {

		fil = new FileInputStream(path);
		workbook = new XSSFWorkbook(fil);
		sheet = workbook.getSheet(SheetName);
		row = sheet.getRow(rownum);
		cell = row.getCell(colnum);

		DataFormatter formatter = new DataFormatter();

		String data;
		try {
			data = formatter.formatCellValue(cell);
		} catch (Exception e) {
			data = "";

		}

		workbook.close();

		fil.close();
		return data;

	}

}
