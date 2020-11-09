package com.lp.swordForOffer.arrayAndMatrix;

/**
 * @author lp
 * @date 2020/11/6 9:02
 */
public class ReplaceBlank {

    /*
     * 将一个字符串中的空格替换成 "%20"。
     *
     * Input:"A B"
     * Output:"A%20B"
     * */


    public static String replaceSpace(StringBuffer str) {
        int p1 = str.length() - 1;
        for (int i = 0; i <= p1; i++) {
            if (str.charAt(i) == ' ') {
                str.append("  ");
            }
        }

        int p2 = str.length() - 1;
        for (int i = p2; i > 0; i--) {
            if (p1 > 0 && p1 <= p2) {
                char c = str.charAt(p1--);
                if (c == ' ') {
                    str.setCharAt(p2--, '0');
                    str.setCharAt(p2--, '2');
                    str.setCharAt(p2--, '%');
                } else {
                    str.setCharAt(p2--, c);
                }
            }
        }

        return str.toString();
    }

    public static String replaceSpace2(StringBuffer str) {
        int P1 = str.length() - 1;
        for (int i = 0; i <= P1; i++) {
            if (str.charAt(i) == ' ') {
                str.append("  ");
            }
        }

        int P2 = str.length() - 1;
        while (P1 >= 0 && P2 > P1) {
            char c = str.charAt(P1--);

            if (c == ' ') {
                str.setCharAt(P2--, '0');
                str.setCharAt(P2--, '2');
                str.setCharAt(P2--, '%');
            } else {
                str.setCharAt(P2--, c);
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace(new StringBuffer("A  B ")));
    }
}
