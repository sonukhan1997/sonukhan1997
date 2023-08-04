package practiceOnly;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import com.actitime.qspiders.genericutility.FileUtility;

public class readDataFromExcel {
@Test
public void readData() throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./src/test/resources/credentials.xlsx");
	Workbook workbook = WorkbookFactory.create(fis);
	Sheet shoukat = workbook.getSheet("shoukat");
	Row name = shoukat.getRow(0);
	Cell value1 = name.getCell(1);
	System.out.println("my name is :"+value1);
	Row phoneno = shoukat.getRow(1);
	Cell value2 =phoneno.getCell(1);
	System.out.println("my phone no. is "+value2);
	Row emailid = shoukat.getRow(2);
	Cell value3 = emailid.getCell(1);
	System.out.println("my emailid is :"+value3);
}
}
