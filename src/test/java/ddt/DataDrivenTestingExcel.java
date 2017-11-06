package ddt;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;

public class DataDrivenTestingExcel {

	XSSFWorkbook wb;

	@BeforeClass
	public void setupExcel() throws Exception {

		File src = new File("C:\\Users\\shakir\\IdeaProjects\\MFPS Project\\TestData\\Login.xlsx");
		FileInputStream fis = new FileInputStream(src);

		// Load The complete workbook
		wb = new XSSFWorkbook(fis);

	}

	@Test(dataProvider = "createUser")
	public void createAccount(String fname, String lname, double type) {

		System.out.println("User First Name is " + fname);
		System.out.println("User Last Name is " + lname);
		System.out.println("Type of the Course " + type);

	}

	@DataProvider(name = "createUser")
	public Object[][] getData() {

		int count = wb.getSheet("mydata").getPhysicalNumberOfRows();

		Object[][] arr = new Object[count][3];

		for (int i = 0; i < count; i++) {

			arr[i][0] = wb.getSheet("mydata").getRow(i).getCell(0).getStringCellValue();
			arr[i][1] = wb.getSheet("mydata").getRow(i).getCell(1).getStringCellValue();
			arr[i][2] = wb.getSheet("mydata").getRow(i).getCell(2).getNumericCellValue();
		}

		return arr;

	}

}
