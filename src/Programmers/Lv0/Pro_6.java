package Programmers.Lv0;

import Programmers.logging;

// 더 크게 합치기
public class Pro_6 {
    public static void main(String[] args) {
        int a = 9;
        int b = 91;
        logging.log(solution(a,b));
    }

    static int solution(int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);
        return Integer.parseInt(ab) > Integer.parseInt(ba) ? Integer.valueOf(ab) : Integer.valueOf(ba);
    }
}