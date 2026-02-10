package Programmers.Lv0;

import Programmers.logging;

// 제출 내역
public class Pro_26 {
    public static void main(String[] args) {
        String my_string = "programmers";
        String alp = "p";
        logging.log(solution(my_string, alp));
    }

    static String solution(String my_string, String alp) {
        String answer = "";

        for (char c : my_string.toCharArray()) {
            if (alp.equals(String.valueOf(c))) {
                answer += (String.valueOf(c)).toUpperCase();
            } else {
                answer += c;
            }
        }
        return answer;
    }
}