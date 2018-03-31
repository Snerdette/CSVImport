package main.java.excel;

import main.java.entities.User;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by klafrance on 8/8/2016.
 */
public class UsersImport {
    static ArrayList<User> userList =new ArrayList<User> ();
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

                    while (rowIterator.hasNext()) {
                        User user = new User();
                        Row row = (Row) rowIterator.next();
                        Iterator cellIterator = row.cellIterator();

                        CELL:
                        while (cellIterator.hasNext()) {
                            Cell cell = (Cell) cellIterator.next();

                            int cellNumber = cell.getColumnIndex();

                            switch(cellNumber) {
                                case 0 :
                                    int id = (int) cell.getNumericCellValue();
                                    user.setId(id);
                                    break;
                                case 1 :
                                    user.setLastName(cell.getStringCellValue());
                                    break;
                                case 2 :
                                    user.setFirstName(cell.getStringCellValue());
                                    break;
                                case 3 :
                                    user.setPhoneNumber(cell.getStringCellValue());
                                    break;
                                case 4 :
                                    user.setEmail(cell.getStringCellValue());
                                    break;
                                case 5 :
                                    user.setStreetAddress(cell.getStringCellValue());
                                    break;
                                case 6 :
                                    user.setCity(cell.getStringCellValue());
                                    break;
                                case 7 :
                                    user.setState(cell.getStringCellValue());
                                    break;
                                case 8 :
                                    user.setTitle(cell.getStringCellValue());
                                    break;
                                case 9 :
                                    user.setManager(cell.getStringCellValue());
                                    break;
                                case 10 :
                                    user.setOffice(cell.getStringCellValue());
                                    break;
                                case 11 :
                                    user.setHireDate(cell.getDateCellValue());
                                    break;
                                case 12 :
                                    break CELL;
                                default:
                                    break CELL;
                            }

                            addToList(user);
                            System.out.println(user);
                        }
                        System.out.println(user);
                    }

            }
            printUsers();
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userList;
    }

    static void printUsers() {
        for (User user : userList) {
            System.out.print(user+ ", ");
        }
    }

    static void addToList(User user) {
        userList.add(user);
    }
}
