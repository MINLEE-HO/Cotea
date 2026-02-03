package Programmers.Lv0;

import Programmers.logging;
import java.util.ArrayList;
import java.util.Arrays;

// n 번째 원소부터
public class Pro_10 {
    public static void main(String[] args) {
        int[] num_list = {5,2,1,7,5};
        int n = 2;
        logging.log(solution(num_list, n));
    }

    static int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = n-1; i < num_list.length; i++) {
            list.add(num_list[i]);
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i<list.size();i++){
            answer[i] = list.get(i);
        }

        return answer;
//         return Arrays.copyOfRange(num_list, n - 1, num_list.length);
    }
}

// Arrays.copyOfRange(대상리스트, n번째부터 , n번째까지) << 신규 메소드