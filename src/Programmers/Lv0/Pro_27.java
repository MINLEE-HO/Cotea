package Programmers.Lv0;

import Programmers.logging;

// 조건에 맞게 수열 변환하기 3
public class Pro_27 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,100,99,98};
        int k = 3;
        logging.log(solution(arr, k));
    }

    static int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        int num = 0;
        for (int i : arr) {
            if (k % 2 == 0) {
                answer[num++] = i+k;
            } else {
                answer[num++] = i*k;
            }
        }
        return answer;
    }
}