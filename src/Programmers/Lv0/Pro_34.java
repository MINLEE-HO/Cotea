package Programmers.Lv0;

import Programmers.logging;

import java.util.*;

// 전국 대회 선발 고사
public class Pro_34 {
    public static void main(String[] args) {
        int[] rank = {1,2,3};
        boolean[] attendance = {true, true, true};
        logging.log(solution(rank, attendance));
    }

    static int solution(int[] rank, boolean[] attendance) {
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<rank.length; i++) {
            if (attendance[i]) {
                list.add(i);
            }
        }
        list.sort((a,b) -> rank[a] - rank[b]);
        return 10000*list.get(0) + 100*list.get(1) + list.get(2);
    }
}