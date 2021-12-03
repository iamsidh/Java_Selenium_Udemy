package assignments;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Siddhesh Madgaonkar";

        String reverse="";

        for(int i = str.length()-1;i>=0;i--){

            reverse = reverse+str.charAt(i);


        }

        System.out.println("Reverse String is  :"+reverse);

        reverseSentence();

    }

    public static void reverseSentence(){

        String str[] = "My name is Siddhesh".split(" ");


        String ans =" ";

        int length = str.length;


        for(int i = length-1; i>=0;i--){
            ans = ans + str[i]+" ";
        }
        System.out.println(ans);
    }
}
