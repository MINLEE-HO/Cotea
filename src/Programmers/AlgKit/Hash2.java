package Programmers.AlgKit;

import Programmers.logging;

import java.util.HashMap;
import java.util.Map;

// 폰켓몬
public class Hash2 {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,2};
        logging.log(solution(nums));
    }

    public static int solution(int[] nums) {
        int valueCnt = nums.length/2;
        Map<Integer, Integer> map = new HashMap<>();

        for (int val : nums) {
            map.put(val, map.getOrDefault(val,0) + 1);
        }

        return Math.min(map.size(), valueCnt);
    }
}