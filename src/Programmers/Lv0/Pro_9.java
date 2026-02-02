package Programmers.Lv0;

import Programmers.logging;

// n개 간격의 원소들
public class Pro_9 {
    public static void main(String[] args) {
        int[] num_list = {4,2,6,1,7,6};
        int n = 4;
        logging.log(solution(num_list,n));
    }

    static int[] solution(int[] num_list, int n) {
        int size = (num_list.length + n - 1) / n;
        int x = 0;
        int[] answer = new int[size];

        for (int i = 0; i < size; i++) {
            answer[i] = num_list[x];
            x += n;
        }
        return answer;
    }
}