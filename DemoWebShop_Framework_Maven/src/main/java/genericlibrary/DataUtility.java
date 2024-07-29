package genericlibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {
	public String getDataFromProperties(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/CommonData.Properties");
		Properties pro=new Properties();
		pro.load(fis);
		String value = pro.getProperty(key);
		return value;

	}

	public String getDataFromExcel(String sheet,int rowNum,int cellNum) throws EncryptedDocumentException, IOException
	{
		File f =new File("‪‪./src/test/resources/TestData/Book1.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheet);
		String value= sh.getRow(rowNum).getCell(cellNum).toString();
		return value;
	}
	
	
	public Object[][] getmultipleDataFromExcel(String sheetname) throws EncryptedDocumentException, IOException {
		File f =new File("./src/test/resources/TestData/Book1.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("RegisterData");

		int lastrownum = sh.getPhysicalNumberOfRows();
		int lastcellnum =sh.getRow(0).getPhysicalNumberOfCells();
		Object [][] arr = new Object[lastcellnum-1] [lastcellnum];
		for(int i =1 ; i<lastrownum;i++) {
			for ( int j=0 ;j<lastcellnum;j++) {
				arr[i-1][j]=sh.getRow(i).getCell(j).toString();

			}
		}
		return arr;
	}
}
