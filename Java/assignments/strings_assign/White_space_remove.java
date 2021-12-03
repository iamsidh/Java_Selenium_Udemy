package assignments.strings_assign;

public class White_space_remove {

    public static void main(String[] args) {

        String s = " India    is    my country";

       String s1= s.replaceAll("( )+"," ");

        System.out.println(s1);
    }
}
