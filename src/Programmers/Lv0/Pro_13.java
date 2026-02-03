package Programmers.Lv0;

import Programmers.logging;

// 문자열의 앞의 n글자
public class Pro_13 {
    public static void main(String[] args) {
        String my_string = "ProgrammerS123";
        int n = 11;
        logging.log(solution(my_string, n));
    }

    static String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }
;}