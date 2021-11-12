package JavaStreams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeHTMLfiles {

    public static void demoWriter1() throws IOException {

        //stream connectivity

        File f = new File("C:\\Sidh\\filewriting\\myHTMLFile.html");

        FileWriter fw = new FileWriter(f);

        BufferedWriter writer = new BufferedWriter(fw);

        writer.write("<html><body><title>Siddhesh Madgaonkar</title><h1>My First HTML Write</h1></body></html");

        writer.close();


    }

    public static void main(String[] args) throws IOException {

        demoWriter1();
    }

    }
