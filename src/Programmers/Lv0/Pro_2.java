package Programmers.Lv0;

import Programmers.logging;

// 홀짝에 따라 다른 값 반환하기
public class Pro_2 {
    public static void main(String[] args) {
        int n = 10;
        logging.log(solution(n));
    }

    static int solution(int n) {
        int answer = 0;
        if (n%2 == 0) {
            for (int i = 0; i <= n; i+=2) {
                answer += Math.pow(i,2);
            }
        }  else {
            for (int i = 1; i <= n; i+=2) {
                answer += i;
            }
        }
        return answer;
    }
}
