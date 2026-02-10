package Programmers.Lv0;

import Programmers.logging;

// 수 조작하기1
public class Pro_23 {
    public static void main(String[] args) {
        int n = 0;
        String control = "wsdawsdassw";
        logging.log(solution(n,control));
    }

    static int solution(int n, String control) {
        int answer = n;
        for (char c : control.toCharArray()) {
            switch (c) {
                case 'w':
                    answer += 1; break;
                case 's':
                    answer -= 1; break;
                case 'd':
                    answer += 10; break;
                case 'a':
                    answer -= 10; break;
            }
        }
        return answer;
    }
}