package JavaStreams;

import java.io.*;

public class ReadingFiles {


    public static void main(String[] args) throws IOException {

        //stream for reading files

        File f = new File("C:\\Sidh\\filewriting\\myTextFile.txt");

        FileReader fr = new FileReader(f);

        BufferedReader reader = new BufferedReader(fr);

        //read text file
        String line = null;

       while ((line = reader.readLine())!=null){

           System.out.println(line);
       }

       reader.close();
    }
}
