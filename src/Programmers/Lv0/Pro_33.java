package Programmers.Lv0;

import Programmers.logging;

// 코드 처리하기
public class Pro_33 {
    public static void main(String[] args) {
        String code = "abc1abc1abc";
        logging.log(solution(code));
    }

    static String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;

        for (int i=0; i<code.length(); i++) {
            char c = code.charAt(i);

            if (c == '1') {
                mode = mode == 0 ? 1:0;
                continue;
            }

            if(mode == 0) {
                if(i % 2 == 0) ret.append(c);
            } else {
                if(i % 2 != 0) ret.append(c);
            }

        }
        return ret.isEmpty() ? "EMPTY" : ret.toString();
    }
}