package Programmers.Lv1;

import Programmers.logging;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// k번째 수
public class Pro_7 {
    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};
        logging.log(solution(array, commands));
    }

    static int[] solution (int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<commands.length; i++) {
            for (int j=commands[i][0]-1; j<commands[i][1]; j++) {
                list.add(array[j]);
            }
            Collections.sort(list);
            answer[i] = list.get(commands[i][2] -1);
            list.clear();
        }

        return answer;
    }
}