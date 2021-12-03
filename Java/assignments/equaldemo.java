package assignments;

public class equaldemo {

    public static void main(String[] args) {


        String s1 = new String("Aniket");

        String s2 = new String("Aniket");

        if(s1==s2){

            System.out.println("equal using ==");
        }

        else {

            System.out.println("not equal using ==");
        }

        if(s1.equals(s2)){

            System.out.println("equal using string equal");
        }
        else {

            System.out.println("not equal using string equal");
        }
    }
}
