package main.java.excel;


/**
 * Created by klafrance on 7/12/2016.
 */
public class WriteToFile {

    /*private static final String FILE_PATH = "/UsersImport/klafrance/Desktop/Computer wipe/Final/Results.xlsx";
    private static final WriteToFile INSTANCE = new WriteToFile();

    public static WriteToFile getInstance() {
        return INSTANCE;
    }

    WriteToFile() {
        writeResultsToExcel();
    }

    public static void writeResultsToExcel(){

        Workbook workbook = new XSSFWorkbook();
        Sheet ResultsSheet = workbook.createSheet("Results");
        int rowIndex = 0;
        int cellIndex = 0;
*/
        /*Row row = ResultsSheet.createRow(rowIndex++);
        row.createCell(cellIndex++).setCellValue("ID");
        row.createCell(cellIndex++).setCellValue("Winner");

        for(Winner winner : excelList){

            row = ResultsSheet.createRow(rowIndex++);
            cellIndex = 0;

            row.createCell(cellIndex++).setCellValue(winner.getId());
            row.createCell(cellIndex++).setCellValue(winner.getUsername());
        }*/

        /*try {
            ResultsSheet.autoSizeColumn(0);
            ResultsSheet.autoSizeColumn(1);
            FileOutputStream fos = new FileOutputStream(FILE_PATH);
            workbook.write(fos);
            fos.close();

            System.out.println(FILE_PATH + " is successfully written");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
}

