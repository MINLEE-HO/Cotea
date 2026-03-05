package Programmers.Lv0;

import Programmers.logging;

// l로 만들기
public class Pro_28 {
    public static void main(String[] args) {
        String myString = "abcdevwxyz";
        logging.log(solution(myString));
    }

    static String solution(String myString) {
        return myString.replaceAll("[a-k]", "l");
//        return myString.replaceAll("[^l-z]", "l");
    }
}