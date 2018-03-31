package main.java.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * Created by klafrance on 7/12/2016.
 */
public class GetExcelSheetNames {

    public static void main(String[] args) {

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("/Temp/Test1.xls");

            HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);

            // for each sheet in the workbook
            for (int i = 0; i < workbook.getNumberOfSheets(); i++) {

                System.out.println("Sheet name: " + workbook.getSheetName(i));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}