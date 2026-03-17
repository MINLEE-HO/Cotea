package Programmers.Lv1;

import Programmers.logging;

// 문자열을 정수로 바꾸기
public class Pro_4 {
    public static void main(String[] args) {
        String s = "-1234";
        logging.log(solution(s));
    }

    static int solution(String s) {

        return Integer.valueOf(s);
    }
}