package assignments.strings_assign;

public class Duplicate_chars {

    public static void main(String[] args) {

        String s = "hello my name is Siddhesh";

        //String s = "w3schools";
        int cnt = 0;

        char[] ch = s.toCharArray();

        System.out.println("Duplicate chars are :");

        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j < s.length(); j++) {

                if (ch[i] == ch[j] && ch[i]!=' ') {

                    System.out.print(ch[j]);
                    cnt++;
                    break;
                }


            }
        }

    }
}
