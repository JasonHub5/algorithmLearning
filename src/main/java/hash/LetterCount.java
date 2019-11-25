package hash;

import java.util.HashMap;

public class LetterCount {
    public static int letterCount(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        HashMap<Character, Integer> dic = new HashMap<Character, Integer>();
        char[] chars = str.replace(" ", "").toCharArray();
        int max = 0;
        for (char val : chars) {
            if (dic.containsKey(val)) {
                int newValue = dic.get(val) + 1;
                if (max < newValue) {
                    max = newValue;
                }
                dic.put(val, newValue);
            } else {
                dic.put(val, 1);
            }
        }
        return max;
    }
}
