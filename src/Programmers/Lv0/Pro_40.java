package Programmers.Lv0;

import Programmers.logging;

// 두 수의 나눗셈
public class Pro_40 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;
        logging.log(solution(num1,num2));
    }

    public static int solution(int num1, int num2) {
        double answer = ((double)num1/(double)num2)*1000;

        String temp = "a";
        char gam = 'a';
        if (gam == temp.charAt(0)) {

        }
        return (int)answer;
    }
}