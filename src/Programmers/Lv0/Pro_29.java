package Programmers.Lv0;

import Programmers.logging;

// 정수 부분
public class Pro_29 {
    public static void main(String[] args) {
        double flo = 1.42;
        logging.log(solution(flo));
    }

    static int solution(double flo) {
        return (int) flo;
    }
}