package Programmers.Lv0;

import Programmers.logging;

// 문자열의 뒤의 n글자
public class Pro_1 {
    public static void main(String[] args) {
        String my_string = "ProgrammerS123";
        int n = 11;
        logging.log(solution(my_string, n));
    }

    static String solution(String my_string, int n) {
        String answer = my_string.substring(my_string.length()-n, my_string.length());
        return answer;
    }
}
