package Programmers.Lv0;

import Programmers.logging;

import java.util.Locale;

// 대문자로 바꾸기
public class Pro_7 {
    public static void main(String[] args) {
        String myString = "aBcDeFg";
        logging.log(solution(myString));
    }

    static String solution(String myString) {
        return myString.toUpperCase();
    }
}