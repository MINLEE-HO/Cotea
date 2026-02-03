package Programmers.Lv0;

import Programmers.logging;

// 이어 붙인 수
public class Pro_16 {
    public static void main(String[] args) {
        int[] num_list = {3,4,5,2,1};
        logging.log(solution(num_list));
    }

    static int solution(int[] num_list) {
        String odd = "";
        String even = "";
        for (int i : num_list) {
            if (i % 2 == 0) {
                even += String.valueOf(i);
            } else {
                odd += String.valueOf(i);
            }
        }
        return Integer.parseInt(even) + Integer.parseInt(odd);
    }
}