package dataProvider;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelDataProvider 
{
	XSSFWorkbook wb;
	
	public ExcelDataProvider()
	{
		
		String path=System.getProperty("user.dir")+"/TestData/AppData.xlsx";
		
		try {
			FileInputStream fis=new FileInputStream(new File(path));
			
			wb=new XSSFWorkbook(fis);
		} catch (Exception e) {
			
			System.out.println("Unable to load Excel file "+e.getMessage());
		} 
	
		
	}
	
	public String getStringData(String sheetName,int row,int column)
	{
		String data=wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		
		return data;
	}
	
	
}
