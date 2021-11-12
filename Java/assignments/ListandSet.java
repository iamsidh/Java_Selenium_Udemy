package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListandSet {

    public static void main(String[] args) {

        //ListDemo();

        SetDemo();

    }

    public static void ListDemo(){

        List <String> Animal = new ArrayList<String>();

        Animal.add("Cat");

        Animal.add("Dog");

        Animal.add("Monkey");

        Animal.add("Cat");

        Animal.add("Tiger");

        // System.out.println(Animal);

        for (String name:Animal) {
            System.out.println(name);

        }
    }

    public static void SetDemo(){

        Set <String> Vegitables = new HashSet<String>();

        Vegitables.add("Banana");

        Vegitables.add("Palak");

        Vegitables.add("Kanda");

        Vegitables.add("Batata");

        Vegitables.add("Kanda");

        for(String veg:Vegitables){

            System.out.println(veg);
        }
    }
}
