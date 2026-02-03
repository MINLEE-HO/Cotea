package Programmers.Lv0;

import Programmers.logging;

// 카운트 업
public class Pro_18 {
    public static void main(String[] args) {
        int start_num = 3;
        int end_num = 10;
        logging.log(solution(start_num, end_num));
    }

    static int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];
        int n = 0;
        for (int i = start_num; i <= end_num; i++) {
            answer[n++] = i;
        }
        return answer;
    }
}