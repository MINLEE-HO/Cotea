package Programmers.Lv1;

import Programmers.logging;
import java.util.*;

// 두 개 뽑아서 더하기
public class Pro_8 {
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        logging.log(solution(numbers));
    }

    static int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }

        int[] answer = new int[set.size()];
        int num = 0;

        for (int val : set) {
            answer[num++] = val;
        }
        Arrays.sort(answer);
        return answer;
    }
}