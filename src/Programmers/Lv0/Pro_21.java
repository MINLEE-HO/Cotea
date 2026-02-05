package Programmers.Lv0;

import Programmers.logging;

import java.util.*;

// 주사위 게임2
public class Pro_21 {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = 4;
        logging.log(solution(a, b, c));
    }

    static int solution(int a, int b, int c) {

        int sum1 = a+b+c;
        int sum2 = (a*a) + (b*b) + (c*c);
        int sum3 = (a*a*a) + (b*b*b) + (c*c*c);

        if (a == b && b == c) {
            return sum1 * sum2 * sum3;
        } else if (a == b || b == c || c == a) {
            return sum1 * sum2;
        } else {
            return sum1;
        }
    }
}