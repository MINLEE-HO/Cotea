package Programmers.Lv0;

import Programmers.logging;

// 문자열 곱하기
public class Pro_14 {
    public static void main(String[] args) {
        String my_string = "string";
        int k = 3;
        logging.log(solution(my_string, k));
    }

    static String solution(String my_string, int k) {
        String answer = "";
        int i = 0;
        while(i<k) {
            answer += my_string;
            i++;
        }
        return answer;
//        return my_string.repeat(k);
    }
}

// {String}.repeat 메소드 기억