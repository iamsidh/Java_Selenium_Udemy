package assignments;

public class DuplicateCharsInString {


    public static void main(String[] args) {

        String str = "w3schooooools";

        char[] ch = str.toCharArray();

        int cnt = 0;

        System.out.println("Duplicate chars are :");

        for (int i = 0; i < str.length(); i++) {

            cnt = 1;

            for (int j = i + 1; j < str.length(); j++) {

                if (ch[i] == ch[j] && ch[i] != ' ') {

                    //Set string[j] to 0 to avoid printing visited character

                    ch[j] = 0;
                    cnt++;
                }
            }

            if (cnt > 1 && ch[i] != 0) {

                System.out.println(ch[i]);
            }
        }

    }
}
