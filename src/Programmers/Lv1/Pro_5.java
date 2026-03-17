package Programmers.Lv1;

import Programmers.logging;

import java.util.Arrays;

// 예산
public class Pro_5 {
    public static void main(String[] args) {
        int[] d = {2,2,3,3};
        int budget = 10;
        logging.log(solution(d, budget));
    }

    static int solution(int[] d, int budget) {
        Arrays.sort(d);
        int sum = 0;
        int cnt = 0;

        for (int i=0; i<d.length; i++) {
            if (sum + d[i] <= budget) {
                sum += d[i];
                cnt++;
            } else {
                break;
            }
        }
        return cnt;
    }
}