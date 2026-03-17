package Programmers.Lv1;

import Programmers.logging;

// x만큼 간격이 있는 n개의 숫자
public class Pro_3 {
    public static void main(String[] args) {
        int x = -4;
        int n = 2;
        logging.log(solution(x, n));
    }

    static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i=0; i<n; i++) {
            answer[i] = x + ((long) i *x);
        }
        return answer;
    }
}