/*

input:givenastring
output:2

input:howareyou
output:2
 */

package hash;

import java.util.HashMap;

public class FirstCharacter {
    public static int firstUniqChar(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        HashMap<Character, Integer> dic = new HashMap<Character, Integer>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (dic.containsKey(chars[i])) {
                int newValue = dic.get(chars[i]) + 1;
                dic.put(chars[i], newValue);
            } else {
                dic.put(chars[i], 1);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (dic.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
