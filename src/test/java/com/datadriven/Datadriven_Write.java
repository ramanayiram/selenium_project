package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Write {
	
	public static void Write_data() throws IOException   {
		
		File f = new File("C:\\Users\\srire\\eclipse-workspace\\Maven_project\\actor and movie.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet createSheet = wb.createSheet("Family details");
		
		Row createRow = createSheet.createRow(1);
		
		Cell createCell = createRow.createCell(1);
		
		createCell.setCellValue("sl.no");
		
		wb.getSheet("Family details").getRow(1).createCell(2).setCellValue("Name");
		wb.getSheet("Family details").getRow(1).createCell(3).setCellValue("Relationship");
		wb.getSheet("Family details").getRow(1).createCell(4).setCellValue("Age");
		wb.getSheet("Family details").createRow(2).createCell(1).setCellValue("1");
		wb.getSheet("Family details").getRow(2).createCell(2).setCellValue("Ayiram");
		wb.getSheet("Family details").getRow(2).createCell(3).setCellValue("Father");
		wb.getSheet("Family details").getRow(2).createCell(4).setCellValue("62");
		wb.getSheet("Family details").createRow(3).createCell(1).setCellValue("2");
		wb.getSheet("Family details").getRow(3).createCell(2).setCellValue("Nachiyar");
		wb.getSheet("Family details").getRow(3).createCell(3).setCellValue("Mother");
		wb.getSheet("Family details").getRow(3).createCell(4).setCellValue("58");
		wb.getSheet("Family details").createRow(4).createCell(1).setCellValue("3");
		wb.getSheet("Family details").getRow(4).createCell(2).setCellValue("Seeethalakshmi");
		wb.getSheet("Family details").getRow(4).createCell(3).setCellValue("Sister");
		wb.getSheet("Family details").getRow(4).createCell(4).setCellValue("36");
		wb.getSheet("Family details").createRow(5).createCell(1).setCellValue("4");
		wb.getSheet("Family details").getRow(5).createCell(2).setCellValue("Srirengan");
		wb.getSheet("Family details").getRow(5).createCell(3).setCellValue("Elderbrother");
		wb.getSheet("Family details").getRow(5).createCell(4).setCellValue("31");
		wb.getSheet("Family details").createRow(6).createCell(1).setCellValue("5");
		wb.getSheet("Family details").getRow(6).createCell(2).setCellValue("Laxmanan");
		wb.getSheet("Family details").getRow(6).createCell(3).setCellValue("Youngerbrother");
		wb.getSheet("Family details").getRow(6).createCell(4).setCellValue("24");
		
		FileOutputStream fos =new FileOutputStream(f);
		
		wb.write(fos);
		wb.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		Write_data();
	}
	
	

}
