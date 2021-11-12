package assignments;

import java.io.*;

public class Practice extends DateFormat {




    public Practice() throws IOException {

        try {
            FileReader file = new FileReader("C:\\Sidh\\filewriting\\myTextFile2.txt");

            BufferedReader reader = new BufferedReader(file);

            System.out.println(reader.readLine());
        } finally {

        }


    }

    public static void main(String[] args) throws IOException {

        DateFormat f = new DateFormat();

        System.out.println("Siddhesh_"+f.datedemo());


    }
}
