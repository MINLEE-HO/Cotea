package Programmers.Lv1;

import Programmers.logging;

// 자연수 뒤집어 배열로 만들기
public class Pro_11 {
    public static void main(String[] args) {
        long n = 12345;
        logging.log(solution(n));
    }

    public static int[] solution(long n) {
        String temp = String.valueOf(n);
        int[] answer = new int[temp.length()];

        int val = 0;
        while (n>0) {
            answer[val++] = (int)(n%10);
            n /= 10;
        }
        return answer;
    }
}