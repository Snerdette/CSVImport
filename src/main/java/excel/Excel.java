/*
package main.java.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


*/
/**
 * Created by klafrance on 7/12/2016.
 *//*

public class Excel {

    static ArrayList<Question> questionList =new ArrayList<Question> ();
    static String filePath = "/UsersImport/klafrance/Desktop/Survey/Data.xlsx";

    static List getData() {
        List excelList = null;
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(filePath);
            Workbook workbook = new XSSFWorkbook(fis);
            int numberOfSheets = workbook.getNumberOfSheets();

            for (int i = 0; i < numberOfSheets; i++) {
                Sheet sheet = workbook.getSheetAt(i);
                Iterator rowIterator = sheet.iterator();
                String sheetName = sheet.getSheetName();
                System.out.println(sheetName);

                if(sheetName.equals("Question")) {
                    while (rowIterator.hasNext()) {
                        Question question = new Question();
                        Row row = (Row) rowIterator.next();
                        Iterator cellIterator = row.cellIterator();

                        CELL:
                        while (cellIterator.hasNext()) {
                            Cell cell = (Cell) cellIterator.next();

                            if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
                                question.setQuestionText(cell.getStringCellValue());
                            } else if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
                                if (cell.getColumnIndex() == 1) {
                                    question.setResponseTypeId((int) (cell.getNumericCellValue()));
                                }
                            } else {
                                break CELL;
                            }
                            addToList(question);
                            System.out.println(question);
                        }
                        System.out.println(question);
                    }

                } else if(sheetName.equals("Response Type")) {
                    while (rowIterator.hasNext()) {
                        ResponseType responseType = new ResponseType();
                        Row row = (Row) rowIterator.next();
                        Iterator cellIterator = row.cellIterator();

                        CELL:while (cellIterator.hasNext()) {
                            Cell cell = (Cell) cellIterator.next();

                            if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
                                responseType.setId((int)cell.getNumericCellValue());
                            } else if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
                                if (cell.getColumnIndex() == 1) {
                                    responseType.setName(cell.getStringCellValue());
                                }
                            } else {
                                break CELL;
                            }

                        }
                    }
                }
            }
            printQuestions();
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return questionList;
    }

    static void printQuestions() {
        for (Question question : questionList) {
            System.out.print(question+ ", ");
        }
    }

    static void addToList(Question question) {
        questionList.add(question);
    }
}
*/
