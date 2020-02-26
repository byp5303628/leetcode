package com.sapphire.leetcode.algorithm.question804;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Author: 柏云鹏
 * Date: 2019/5/21.
 */
public class UniqueMorseCode {
    public int uniqueMorseRepresentations(String[] words) {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String[] codes = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        Map<Character, String> map = new HashMap<Character, String>();
        char[] charArray = chars.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            map.put(c, codes[i]);
        }

        Set<String> hashSet = new HashSet<String>();

        for (String word : words) {
            StringBuilder sb= new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(map.get(c));
            }

            hashSet.add(sb.toString());
        }

        return hashSet.size();
    }
}
