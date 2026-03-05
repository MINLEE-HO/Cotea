package Programmers.Lv0;

import Programmers.logging;

// 문자열 바꿔서 찾기
public class Pro_30 {
    public static void main(String[] args) {
        String myString = "ABAB";
        String pat = "ABAB";
        logging.log(solution(myString, pat));
    }

    static int solution(String myString, String pat) {
        String answer = "";
        for (Character c : myString.toCharArray()) {
            answer += c == 'A' ? 'B' : 'A';
        }

        if (answer.contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }
}