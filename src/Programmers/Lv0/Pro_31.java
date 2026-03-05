package Programmers.Lv0;

import Programmers.logging;

// 정수 찾기
public class Pro_31 {
    public static void main(String[] args) {
        int[] num_list = {1,2,3,4,5};
        int n = 3;
        logging.log(solution(num_list, n));
    }

    static int solution(int[] num_list, int n) {
        for (int i : num_list) {
            if (i == n) {
                return 1;
            }
        }
        return 0;
    }
}