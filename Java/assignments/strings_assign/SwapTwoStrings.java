package assignments.strings_assign;

public class SwapTwoStrings {

    public static void main(String[] args) {

        String s1 = "Siddhesh";

        String s2 = "Madgaonkar";

        System.out.println("Before Swapping : "+s1+"   "+s2);

        s1 = s1+s2;

        s2 = s1.substring(0,s1.length()-s2.length());

        s1 = s1.substring(s2.length());

        System.out.println("After Swapping : "+s1+"   "+s2);
    }
}
