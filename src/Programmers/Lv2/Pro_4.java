package Programmers.Lv2;

import Programmers.logging;

import java.util.Arrays;

// 최솟값 만들기
public class Pro_4 {
    public static void main(String[] args) {
        int[] A = {1,2};
        int[] B = {3,4};
        logging.log(solution(A, B));
    }

    static int solution(int[] A, int[] B) {
        int sum = 0;
        Arrays.sort(A);

        Arrays.sort(B);
        for (int i=0; i<B.length/2; i++) {
            int temp = B[i];
            B[i] = B[B.length-i-1];
            B[B.length-i-1] = temp;
        }

        for (int j=0; j<A.length; j++) {
            sum += A[j]*B[j];
        }

        return sum;
    }
}