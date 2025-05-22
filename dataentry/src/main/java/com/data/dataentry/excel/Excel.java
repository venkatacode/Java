package com.data.dataentry.excel;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.data.dataentry.bin.Products;

public class Excel {
	
	public static String[] Headers= {
			"id",
			"name",
			"desc",
	};
	public static  String Sheet_name="Products_List";
	
	public static ByteArrayInputStream dataToexcel(List<Products> list) throws IOException {
		
		Workbook workbook =new XSSFWorkbook();
		ByteArrayOutputStream out=new ByteArrayOutputStream();
		try {
			Sheet sheet =workbook.createSheet(Sheet_name);
		    Row row= sheet.createRow(0);
		for(int i=0;i<Headers.length;i++) {
			Cell cell=row.createCell(i);
			cell.setCellValue(Headers[i]);
		}
		int rowindex=1;
		for(Products product:list) {
			Row data=sheet.createRow(rowindex);
			rowindex++;
			data.createCell(0).setCellValue(product.getProductid());
			data.createCell(1).setCellValue(product.getProductname());
			data.createCell(2).setCellValue(product.getProductdesc());
		}
		workbook.write(out);
		return new ByteArrayInputStream(out.toByteArray());
		
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("failed to import");
			return null;
		}
		finally {
			workbook.close();
			out.close();
			
		}
	}
 }
