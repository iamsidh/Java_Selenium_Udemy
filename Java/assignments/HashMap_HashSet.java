package assignments;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMap_HashSet {

    public static void hashmapdemo() {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        hm.put("Name", 1);

        hm.put("abc", 2);

        Set<String> keys = hm.keySet();

        for(String key : keys){

            System.out.println("Keys -->" +key+"   "+ hm.get(key));
        }

        for(Map.Entry<String,Integer> entry : hm.entrySet()){

            System.out.println(entry.getKey() + "    "+ entry.getValue());
        }





        //System.out.println(hm);

    }

    public static void hashsetdemo() {

        HashSet<String> hs = new HashSet<String>();

        hs.add("Siddhesh");
        hs.add("Kiran");
        hs.add(null);

        for(String a : hs){

            System.out.println(a);
        }
    }



    public static void main(String[] args) {

        hashmapdemo();
        hashsetdemo();

    }
}
