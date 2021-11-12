package ExelReadWrite;

import org.apache.poi.ss.usermodel.*;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExel {

    public static void main(String[] args) throws Exception {

        File f = new File("C:\\Sidh\\filewriting\\ExelWriteusingLoop.xlsx");

        FileInputStream fi = new FileInputStream(f);

        Workbook workbook = WorkbookFactory.create(fi);

        Sheet sheet0 = workbook.getSheetAt(0);

        Row row = sheet0.getRow(4);

        Cell cell = row.getCell(2);

        System.out.println(cell);


    /*    for (Row row : sheet0) {
            for (Cell cell : row) {
                switch (cell.getCellType()) {
                    case Cell
                }


            }

        }
*/
        fi.close();


    }
}
