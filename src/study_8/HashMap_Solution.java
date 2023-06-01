package study_8;

import java.util.*;

public class HashMap_Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        char order = 'a';

        for (char ch : key.toCharArray()) {
            if (!map.containsKey(ch) && Character.isLowerCase(ch)) {
                map.put(ch, order++);
            }
        }

        StringBuilder decoded = new StringBuilder();
        for (char ch : message.toCharArray()) {
            if (ch == ' ') {
                decoded.append(' ');
            } else {
                decoded.append(map.get(ch));
            }
        }
        return decoded.toString();
    }
}