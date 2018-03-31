package main.java;

import main.java.excel.Excel;

import java.util.List;

/**
 * Created by klafrance on 7/12/2016.
 */

public class AppRunner {



    public static void main(String args[]) throws Exception {
        AppRunner app = new AppRunner();
        List questionList = Excel.getData();
    }


}

