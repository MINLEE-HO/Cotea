package Programmers.Lv0;

import Programmers.logging;

import java.util.ArrayList;

// 콜라츠 수열 만들기
public class Pro_20 {
    public static void main(String[] args) {
        int n = 10;
        logging.log(solution(n));
    }

    static int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);

        while (n != 1) {
            if (n % 2 == 0) {
                n = n/2;
            } else {
                n = n*3+1;
            }
            list.add(n);
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i< list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}