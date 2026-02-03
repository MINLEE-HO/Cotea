package Programmers.Lv0;

import Programmers.logging;

// 공배수
public class Pro_15 {
    public static void main(String[] args) {
        int number = 55;
        int n = 10;
        int m = 5;
        logging.log(solution(number, n, m));
    }

    static int solution(int number, int n, int m) {
        int answer = number%n==0 && number%m==0 ? 1 : 0;
        return answer;
    }
}