package assignments;

import java.util.HashMap;
import java.util.Map;

public class OccurrencesOfChars {

    public static void CharacterCount(String inputString) {
        // Creating a HashMap containing char
        // as a key and occurrences as  a value

        Map<Character, Integer> charCount = new HashMap<>();

        // Converting given string to char array

        char[] strArray = inputString.toCharArray();
        // checking each char of strArray
        for (char c : strArray) {
            if (charCount.containsKey(c)) {

                // If char is present in charCountMap,
                // incrementing its count by 1
                charCount.put(c, charCount.get(c) + 1);
            } else {

                // If char is not present in charCountMap,
                // putting this char to charCountMap with 1 as it's value
                charCount.put(c, 1);
            }
        }

        for (Map.Entry entry : charCount.entrySet()) {
            // Printing the charCountMap
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }

    public static void main(String[] args) {

        String str = "Siddhesh";
        CharacterCount(str);
    }

}
