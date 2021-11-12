package ExelReadWrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingExel {


    public static void main(String[] args) throws Throwable {

        WriteWithLoops();

    }

    public static void WriteWithoutLoop() throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("First Sheet");  // here workbook reference has been taken

        //XSSFSheet sheet = new XSSFSheet(); we cannot open sheet before opening workbook

        Row row0 = sheet.createRow(0);

        Cell cellA = row0.createCell(0);

        Cell cellB = row0.createCell(1);

        cellA.setCellValue("First cell");

        cellB.setCellValue("Second cell");

        //connecting stream

        File f = new File("C:\\Sidh\\filewriting\\ExelWrite.xlsx");

        FileOutputStream fo = new FileOutputStream(f);

        workbook.write(fo);

        //close stream

        fo.close();

    }

    public static void WriteWithLoops() throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("First Sheet");

        for (int rows = 0; rows < 10; rows++) {

            Row row = sheet.createRow(rows);

            for (int cols = 0; cols < 10; cols++) {

                Cell cell = row.createCell(cols);

                cell.setCellValue((int) (Math.random() * 100));

            }

            //connecting stream

            File f = new File("C:\\Sidh\\filewriting\\ExelWriteusingLoop.xlsx");

            FileOutputStream fo = new FileOutputStream(f);

            workbook.write(fo);

            //close stream

            fo.close();
        }

    }
}
