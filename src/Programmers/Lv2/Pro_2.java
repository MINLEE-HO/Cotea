package Programmers.Lv2;

import Programmers.logging;

import java.util.Locale;

// JadenCase 문자열 만들기
public class Pro_2 {
    public static void main(String[] args) {
        String s = "3people unFollowed me";
        logging.log(solution(s));
    }

    static String solution(String s) {
        StringBuilder st = new StringBuilder();
        boolean firstWord = true;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                st.append(c);
                firstWord = true;
            } else {
                if (firstWord) {
                    st.append(Character.toUpperCase(c));
                    firstWord = false;
                } else {
                    st.append(Character.toLowerCase(c));
                }
            }
        }
        return st.toString();
    }
}