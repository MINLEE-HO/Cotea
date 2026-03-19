package Programmers.Lv2;

import Programmers.logging;

// 이진 변환 반복하기
public class Pro_5 {
    public static void main(String[] args) {
        String s = "110010101001";
        logging.log(solution(s));
    }

    static int[] solution(String s) {
        int zero = 0;
        int cnt = 0;
        int col = 0;
        while(!s.equals("1")) {
            cnt++;
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    zero++;
                    col++;
                }
            }
            s = Integer.toBinaryString(s.length()-col);
            col = 0;
        }

        return new int[]{cnt, zero};
    }
}