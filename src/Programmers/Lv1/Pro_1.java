package Programmers.Lv1;

import Programmers.logging;

import java.util.HashSet;
import java.util.Set;

// 폰켓몬
public class Pro_1 {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,2};
        logging.log(solution(nums));
    }

    static int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int val : nums) set.add(val);
        return nums.length/2  < set.size() ? nums.length/2 : set.size();
    }
}