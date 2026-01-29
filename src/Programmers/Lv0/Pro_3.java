package Programmers.Lv0;

import Programmers.logging;

// 마지막 두 원소
public class Pro_3 {
    public static void main(String[] args) {
        int[] num_list = {2,1,6};
//        int[] num_list = {5,2,1,7,5};
        logging.log(solution(num_list));
    }

    static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }

        if (num_list[num_list.length-1] > num_list[num_list.length-2]) {
            answer[num_list.length] = (num_list[num_list.length-1])-(num_list[num_list.length-2]);
        } else {
            answer[num_list.length] = (num_list[num_list.length-1])*2;
        }


        return answer;
    }
}
