package Programmers.Lv1;

import static Programmers.logging.log;

// 평균 구하기
public class Pro_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        log(solution(arr));
    }

    static double solution(int[] arr){
        double answer = 0.0;
        for (int val : arr) { answer += val; }
        return answer/arr.length;
    }

}