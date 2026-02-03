package Programmers.Lv0;

import Programmers.logging;

// 첫 번째로 나오는 음수
public class Pro_17 {
    public static void main(String[] args) {
        int[] num_list = {12,4,15,46,38,15};
        logging.log(solution(num_list));
    }

    static int solution(int[] num_list) {
        int answer = 0;

        for (int i : num_list) {
            if (i > 0) {
                answer ++;
            }
        }

        if (answer == num_list.length) {
            return -1;
        }

        answer = 0;

        for (int i : num_list) {
            if (i > 0) {
                answer++;
            } else {
                return answer;
            }
        }
        return answer;
    }
}