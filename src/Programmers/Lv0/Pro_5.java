package Programmers.Lv0;

import Programmers.logging;

// 원소들의 곱과 합
public class Pro_5 {
    public static void main(String[] args) {
        int[] num_list = {5,7,8,3};
        logging.log(solution(num_list));
    }

    static int solution(int[] num_list) {
        int compbine = 1;
        int plus = 0;
        for (int i : num_list) {
            compbine *= i;
            plus += i;
        }
        int answer = compbine < (plus*plus) ? 1:0;
        return answer;
    }
}
