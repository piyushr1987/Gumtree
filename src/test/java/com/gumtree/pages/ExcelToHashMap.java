package com.gumtree.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToHashMap {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\piyush ramteke\\eclipse-workspace\\E workplace\\Gumtree\\src\\test\\java\\com\\gumtree\\testData\\lumaLoginData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int row = sheet.getLastRowNum();
		Map<String, String> mapData = new LinkedHashMap<String, String>();

		// reading data from excel file
		for (int r = 0; r <= row; r++) {
			String key = sheet.getRow(r).getCell(0).getStringCellValue();
			String value = sheet.getRow(r).getCell(1).getStringCellValue();
			mapData.put(key, value);
		}

		// read data from HashMap
		for (Map.Entry entry : mapData.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
