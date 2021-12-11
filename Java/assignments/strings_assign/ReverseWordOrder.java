package assignments.strings_assign;

public class ReverseWordOrder {

    public static void main(String[] args) {

        String str = "My name is Dattaraj";
        //output: "YM Eman Si JarattaD";

        String[] str1 = str.split(" ");

        for (int i = 0; i < str1.length; i++) {

            char[] ch = str1[i].toCharArray(); // {'M','y'}

            String revCh = "";

            for (int j = ch.length - 1; j >= 0; j--) {

                if (j == ch.length - 1) {

                    revCh = revCh + Character.toUpperCase(ch[j]);

                } else {

                    revCh = revCh + ch[j];
                }
            }

            System.out.print(revCh + " ");
        }
    }
}