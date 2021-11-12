public class Test2 {


    public static void main(String[] args) {

        String str = "wE!c0mE 2 Cog^iZ@nT";

        char[] str1 = str.toCharArray();

        int lenght = str.length();

        System.out.println(str.toUpperCase());

        System.out.println(str.replace("2" ,"Two"));

        //System.out.println(str);



        String rev =" ";

        for(int i = lenght-1;i>=0;i--){
            rev = rev + str1[i];


        }

        System.out.println("Reverse String is : "+rev);



    }
}
