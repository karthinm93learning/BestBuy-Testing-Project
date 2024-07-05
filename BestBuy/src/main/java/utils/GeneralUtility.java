package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class GeneralUtility {
	
	public static ExtentReports reports;
	public static ExtentTest test;
	public static Properties prop;
	public static FileInputStream file;
	public static XSSFWorkbook book;
	public static XSSFSheet sheet;
	

	public static void reportInit() {
		
		ExtentSparkReporter html = new ExtentSparkReporter("./Report.html");
		reports = new ExtentReports();
		reports.attachReporter(html);
	}
	
	public static void prop() throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+ "/signupdatas.properties");
		prop = new Properties();
		prop.load(file);
	
	}
	
	public static Object[][] readExcel(String sheetname) throws Exception {
		
		
			String path = "E:\\Selenium Projects\\BestBuy\\Datas.xlsx";
			file = new FileInputStream(path);
			book = new XSSFWorkbook(file);
			XSSFSheet sheet = book.getSheet(sheetname);
			int row= sheet.getLastRowNum();
			int col = sheet.getRow(1).getLastCellNum();
			Object data[][] = new Object[row][col];
			
			for(int i = 1; i <= row; i++) {
				for(int j= 0; j < col; j++) {
					data[i-1][j] = sheet.getRow(i).getCell(j).toString();
				}
			}
		return data;
	
	}
	
}

