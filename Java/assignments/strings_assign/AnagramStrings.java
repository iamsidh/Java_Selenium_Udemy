package assignments.strings_assign;

import java.util.Arrays;
import java.util.Locale;

public class AnagramStrings {

    //Two strings are called anagrams if they contain same set of characters but in different order.

    public static void main(String[] args) {

        String s1 = "EAT";

        String s2 = "TEA";

        boolean status = true;

        if(s1.length()!=s2.length()){

            status = false;
        }

        else {

            char[] c1 = s1.toLowerCase().toCharArray();

            char [] c2 = s2.toLowerCase().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            status = Arrays.equals(c1,c2);

        }
        if(status=true){
            System.out.println("String    " +s1+ "    and   "+s2+"   are anagram");

        }else {

            System.out.println("String     " +s1+ "and   "+s2+"    are not anagram");
        }


    }
}
