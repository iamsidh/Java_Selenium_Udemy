package assignments;

public class Palindrom {

    //string same as reverse  e.g NITIN

    public static void main(String[] args) {

        String str ="madam";

        int lenght = str.length();

        String rev="";

        for(int i= lenght-1;i>=0;i--){

             rev= rev + str.charAt(i);

        }

        if(str.equals(rev)){

            System.out.println(str+"  "+"String is Palindrom");
        }

        else {

            System.out.println(str+"  "+"String is not palindrom");
        }






    }
}
