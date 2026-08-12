package Programmers.AlgKit;

import Programmers.logging;

import java.util.*;
import java.util.stream.Stream;

// 완주하지 못한 선수
public class Hash1 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        logging.log(solution(participant,completion));
    }

    public static String solution(String[] participant, String[] completion) {
        Map<String,Integer> map = new HashMap<>();
        String[] newOne = Stream.concat(Arrays.stream(participant), Arrays.stream(completion))
                .toArray(String[]::new);

        for (String val : newOne) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        for (String temp : map.keySet()) {
            if (map.get(temp) != 2) {
                return temp;
            }
        }

        return "Error Problem";
    }
}