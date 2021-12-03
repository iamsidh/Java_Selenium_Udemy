package properties_Reading_files.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Prop {


    public static void main(String[] args) throws IOException {


        Properties prop = new Properties();

        String pcpath = System.getProperty("user.dir");

        FileInputStream fis = new FileInputStream(pcpath+"/Java/properties_Reading_files/config/objects.properties");

        prop.load(fis);

        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("salary"));





    }
}
