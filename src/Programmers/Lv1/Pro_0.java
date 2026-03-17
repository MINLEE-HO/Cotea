package Programmers.Lv1;

import Programmers.logging;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// 완주하지 못한 선수
public class Pro_0 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden", "leo"};
        String[] completion = {"eden", "kiki", "leo"};
        logging.log(solution(participant, completion));
    }

    static String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : participant) map.put(s, map.getOrDefault(s,0) + 1);
        for (String s : completion) map.put(s, map.getOrDefault(s,0) -1);

        for (String val : map.keySet()) {
            if (map.get(val) > 0) return val;
        }

        return "";
    }
}