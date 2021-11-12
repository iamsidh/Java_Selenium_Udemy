package properties_Reading_files.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Prop {


    public static void main(String[] args) throws IOException {


        Properties p = new Properties();

        String pcpath = System.getProperty("user.dir");

        FileInputStream fis = new FileInputStream(pcpath+"\\Java\\properties_Reading_files\\config\\objects.properties");

        p.load(fis);

        System.out.println(p.getProperty("name"));
        System.out.println(p.getProperty("salary"));





    }
}
