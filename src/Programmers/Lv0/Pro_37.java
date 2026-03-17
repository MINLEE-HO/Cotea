package Programmers.Lv0;

import Programmers.logging;

// 문자열 섞기
public class Pro_37 {
    public static void main(String[] args) {
        String str1 = "aaaaa";
        String str2 = "bbbbb";
        logging.log(solution(str1, str2));
    }

    static String solution(String str1, String str2) {
        StringBuilder result = new StringBuilder();

        for (int i=0; i<str1.length(); i++) {
            result.append(str1.charAt(i));
            result.append(str2.charAt(i));
        }

        return result.toString();
    }
}