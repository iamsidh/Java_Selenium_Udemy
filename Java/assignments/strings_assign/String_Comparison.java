package assignments.strings_assign;

public class String_Comparison {

    public static void main(String[] args) {

        String a = "SIDDHESH";

        String b = "siddhesh";

        if (a.equals(b)) {

            System.out.println("Strings are equal");
        } else {

            System.out.println("Strings are not equal");
        }

        if (a.equalsIgnoreCase(b)) {

            System.out.println("Strings are equal because case sensitive ignored");
        } else {

            System.out.println("Strings are not equal");
        }
    }
}

