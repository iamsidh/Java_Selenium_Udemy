package assignments.strings_assign;

import java.util.HashMap;
import java.util.Map;

public class CountOfWords {
    public static void main(String[] args) {

        String str = "My Name is Siddhesh Sharad Madgaonkar My Age is 27 ";

        String[] split = str.split(" ");

        Map<String, Integer> map = new HashMap<>();


        for (int i = 0; i < split.length; i++) {

            if (map.containsKey(split[i])) {

                int count = map.get(split[i]);

                map.put(split[i], count + 1);

            } else {

                map.put(split[i], 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }
}
