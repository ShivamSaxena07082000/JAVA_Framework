package Utilities;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ExcelUtility
{
    String path;
    public ExcelUtility(String path)
    {
        this.path = path;
    }
    public int getRowCount(String sheetName) throws IOException {
        FileInputStream fi = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fi);
        XSSFSheet sheet = workbook.getSheet(sheetName);
        int rowCount = sheet.getLastRowNum();
        workbook.close();
        fi.close();
        return rowCount;
    }
    public int getCellCount(String sheetName, int rowNum) throws IOException {
        FileInputStream fi = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fi);
        XSSFSheet sheet = workbook.getSheet(sheetName);
        XSSFRow row = sheet.getRow(rowNum);
        int cellcount = row.getLastCellNum();
        workbook.close();
        fi.close();
        return cellcount;
    }

    public String getCellData(String sheetName, int rowNum, int colNum) throws IOException {
        FileInputStream fi = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fi);
        XSSFSheet sheet = workbook.getSheet(sheetName);
        XSSFRow row = sheet.getRow(rowNum);
        XSSFCell cell = row.getCell(colNum);

        DataFormatter formatter = new DataFormatter();
        String data;
        try
        {
            data= formatter.formatCellValue(cell);
        }
        catch (Exception e)
        {
            data="";
        }
        workbook.close();
        fi.close();
        return data;
    }
}
