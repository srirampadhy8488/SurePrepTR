package utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {
    private Workbook workbook;

    public ExcelUtils(String filePath) throws IOException {
        FileInputStream inputStream = new FileInputStream(filePath);
        workbook = new XSSFWorkbook(inputStream);
    }

    public String getCellData(String sheetName, int row, int column) {
        Sheet sheet = workbook.getSheet(sheetName);
        Row rowData = sheet.getRow(row);
        Cell cell = rowData.getCell(column);
        return cell.getStringCellValue();
    }
}
