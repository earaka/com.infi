package utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.maven.base.testbase;



public class ExcelReader extends testbase{
	
	FileInputStream fis;
	
	XSSFWorkbook wb;
	
	XSSFSheet sh;
	
	
	public ExcelReader(String sheetPath)
	{
		try
		{
		fis=new FileInputStream(sheetPath);
		
		 wb=new XSSFWorkbook(fis);
		
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public int totalRows(String sheetName)
	{
		sh=wb.getSheet(sheetName);
		
		int rows=sh.getLastRowNum();
		
		rows=rows+1;
		
		return rows;
	}
	
	public int totalcolumns(String sheetName)
	{
		sh=wb.getSheet(sheetName);
		
		short cols=sh.getRow(0).getLastCellNum();
		
		return cols;
	}
	
	
	public String getExcelData(String sheetName, int row, int col)
	{
		sh=wb.getSheet(sheetName);
		
		String data=sh.getRow(row).getCell(col).getStringCellValue();
		
		return data;
	}

}
