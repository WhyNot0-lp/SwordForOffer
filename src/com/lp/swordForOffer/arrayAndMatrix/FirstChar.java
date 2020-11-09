package com.lp.swordForOffer.arrayAndMatrix;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author lp
 * @date 2020/11/6 17:04
 */
public class FirstChar {

    /*
     * 在一个字符串中找到第一个只出现一次的字符，并返回它的位置。字符串只包含 ASCII 码字符。
     *
     * Input: abacc
     * Output: b
     *
     * */

    public static int FirstNotRepeatingChar1(String str) {
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) == null) {
                map.put(chars[i], i);
            } else {
                Integer num = map.get(chars[i]);
                map.put(chars[i], num);
            }
        }

        Set<Character> keys = map.keySet();
        Character target = 0;

        for (Character key : keys) {
            if (map.get(key) == 1) {
                target = key;
            }
        }

        int i = str.indexOf(target);
        return i;
    }


    public static int FirstNotRepeatingChar2(String str) {
        int[] cnts = new int[128];
        for (int i = 0; i < str.length(); i++) {
            cnts[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (cnts[str.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }


    public static int FirstNotRepeatingChar3(String str) {
        BitSet bs1 = new BitSet(128);
        BitSet bs2 = new BitSet(128);
        for (char c : str.toCharArray()) {
            if (!bs1.get(c) && !bs2.get(c)) {
                // 0 0 -> 0 1
                bs1.set(c);
            } else if (bs1.get(c) && !bs2.get(c)) {
                // 0 1 -> 1 1
                bs2.set(c);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // 0 1
            if (bs1.get(c) && !bs2.get(c))
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "abacc";
//        int i = FirstNotRepeatingChar1(str);
//        int i = FirstNotRepeatingChar2(str);
        int i = FirstNotRepeatingChar3(str);
        System.out.println(i);

    }


}