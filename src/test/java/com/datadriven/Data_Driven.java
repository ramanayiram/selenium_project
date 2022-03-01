package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven{

	private static void readRowValue() throws IOException {
		
		File f= new File("C:\\Users\\srire\\eclipse-workspace\\Maven_project\\actor and movie.xlsx");
		
		FileInputStream fis = new FileInputStream (f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet sheetAt = w.getSheetAt(0);
		
		Row row = sheetAt.getRow(4);
		
		int numberOfCells = row.getPhysicalNumberOfCells();
		
		for (int i = 0; i < numberOfCells; i++) {
			Cell cell = row.getCell(i);
			
			CellType cellType = cell.getCellType();
			
			if (cellType.equals(CellType.STRING)) {
			
				String cellValue = cell.getStringCellValue();
				
			System.out.println(cellValue);
			}
			else if (cellType.equals(CellType.NUMERIC)) {
				
				double value = cell.getNumericCellValue();
				
				int num = (int) value;
				
			}				
		}
			
	}	
	public static void readCellValue() throws IOException {
	
        File f= new File("C:\\Users\\srire\\eclipse-workspace\\Maven_project\\actor and movie.xlsx");
		
		FileInputStream fis = new FileInputStream (f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet sheetAt = w.getSheetAt(0);
		
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		for (int i = 0; i < numberOfRows; i++) {
			
			Row row = sheetAt.getRow(i);
			
			Cell cell = row.getCell(1);
			
			CellType cellType = cell.getCellType();
			
			if (cellType.equals(CellType.STRING)) {
				
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
			}
				else if (cellType.equals(CellType.NUMERIC)) {
					double value = cell.getNumericCellValue();
					int num = (int) value;
					System.out.println(value);
				}				
			}
			
		}

	public static void main(String[] args) throws IOException {
		System.out.println("4th Row data");
		readRowValue();
		System.out.println("1st cell Data");
		readCellValue();
		
	}
		

	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

