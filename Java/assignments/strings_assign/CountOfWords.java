package assignments.strings_assign;

import java.util.HashMap;
import java.util.Map;

public class CountOfWords {
    public static void main(String[] args) {

        String str = "My Name is Siddhesh Sharad Madgaonkar My Age is 27 ";

        String[] strArray = str.split(" ");

        Map<String, Integer> map = new HashMap<>();


        for (int i = 0; i < strArray.length; i++) {

            if (map.containsKey(strArray[i])) {

                int count = map.get(strArray[i]);

                map.put(strArray[i], count + 1);

            } else {

                map.put(strArray[i], 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }
}
