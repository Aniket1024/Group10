package com.SauceDemo.UtilityClasses;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelDateFetch 
{
	public void logindatafetching(WebDriver driver) throws IOException 
	{
		FileInputStream file=new FileInputStream("./ExcelFiles/batch details.xlsx");
		XSSFWorkbook book=	new	XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheet("Sheet2");	
		
		XSSFRow row=sheet.getRow(0);
		XSSFCell cell=row.getCell(0);
		String username=cell.getStringCellValue();
		
		XSSFRow row1=sheet.getRow(0);
		XSSFCell cell1=row1.getCell(1);
		String password=cell1.getStringCellValue();
		
//		int RowNum=sheet.getLastRowNum();
//		for(int i=0;i<RowNum;i++)
//		{
//			XSSFRow row=sheet.getRow(i);
//			
//			int CellNum=row.getLastCellNum();
//			for(int j=0;j<CellNum;j++)
//			{
//				XSSFCell cell=row.getCell(j);	
//				String data=cell.getStringCellValue();	
//			}
//		}
	}
}
