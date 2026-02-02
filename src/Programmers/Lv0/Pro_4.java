package Programmers.Lv0;

import Programmers.logging;

// flag에 따라 다른 값 반환하기
public class Pro_4 {
    public static void main(String[] args) {
        int a = -4;
        int b = 7;
        boolean flag = true;
        logging.log(solution(a,b,flag));
    }

    static int solution(int a, int b, boolean flag) {
        int answer = flag ? a+b:a-b;
        return answer;
    }
}
