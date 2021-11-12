package JavaStreams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {


    public static void main(String[] args) throws IOException {

        demoWriter1();

        demoWriter2();

        demoWriter3();

        demoWriter4();
    }

    public static void demoWriter1() throws IOException {

        //stream connectivity

        File f = new File("C:\\Sidh\\filewriting\\myTextFile.txt");

        FileWriter fw = new FileWriter(f);

        BufferedWriter writer = new BufferedWriter(fw);

        //writing inside the file

        System.out.println("demoWriter1");

        writer.write("Writing first line");

        writer.newLine();

        writer.write("Second Line");

        //close stream

        writer.close();

        System.out.println("File is created");

    }

    public static void demoWriter2() throws IOException {

        //will write file in append mode

        //stream connectivity

        File f = new File("C:\\Sidh\\filewriting\\myTextFile.txt");

        FileWriter fw = new FileWriter(f,true); // for appending = true

        BufferedWriter writer = new BufferedWriter(fw);

        //writing inside the file

        System.out.println("demoWriter2");

        writer.newLine();

        writer.write("Writing first line for append mode");

        writer.newLine();

        writer.write("Second Line for append mode");

        //close stream

        writer.close();

        System.out.println("File is created");


    }

    public static void demoWriter3() throws IOException {   //using loops

        File f = new File("C:\\Sidh\\filewriting\\myTextFile2.txt");

        FileWriter fw = new FileWriter(f);

        BufferedWriter writer = new BufferedWriter(fw);


        for(int i = 0 ; i<5 ; i++){

            for(int j = 0 ; j<4; j++){

                int num = (int)(Math.random()*100);

                writer.write(num+"\t");
            }

            writer.newLine();

        }
        writer.close();

    }

    public static void demoWriter4() throws IOException {   //using loops for csv files

        File f = new File("C:\\Sidh\\filewriting\\myTextFile3.csv");

        FileWriter fw = new FileWriter(f);

        BufferedWriter writer = new BufferedWriter(fw);


        for(int i = 0 ; i<5 ; i++){

            for(int j = 0 ; j<4; j++){

                int num = (int)(Math.random()*100);

                writer.write(num+",");
            }

            writer.newLine();

        }
        writer.close();

    }


}
