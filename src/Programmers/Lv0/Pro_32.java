package Programmers.Lv0;

import Programmers.logging;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

// 배열의 원소 삭제하기
public class Pro_32 {
    public static void main(String[] args) {
        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};
        logging.log(solution(arr, delete_list));
    }

    static int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> set = new HashSet<>();
        for (int i : delete_list) {
            set.add(i);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int j : arr) {
            if (!set.contains(j)) {
                list.add(j);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}