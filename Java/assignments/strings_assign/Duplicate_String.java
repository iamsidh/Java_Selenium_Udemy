package assignments.strings_assign;

public class Duplicate_String {

    public static void main(String[] args) {

        String str1 = "EAT";

        String str2 = "TEA";

        String str3 = "EAAT";

        String str4 = str1.concat(str2);

        String str5 = str4.concat(str3);

        char [] strings = str5.toCharArray();

        for(int i = 0 ; i<str5.length();i++){

            for(int j =i+1 ; j<str5.length()-1;j++){

                if(strings[i]==strings[j]){
                    System.out.println("Duplicate chars");
                    return;

                }
                else {
                    System.out.println("No Duplicate");

                }
            }
        }

    }

}