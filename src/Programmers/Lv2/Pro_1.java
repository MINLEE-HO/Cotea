package Programmers.Lv2;

import Programmers.logging;

// 최댓값과 최솟값
public class Pro_1 {
    public static void main(String[] args) {
        String s = "-1 -2 -3 -4";
        logging.log(solution(s));
    }

    static String solution(String s) {
        String[] arr = s.split(" ");
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);

        for (String val : s.split(" ")) {
            if (Integer.parseInt(val) > max) {
                max = Integer.parseInt(val);
            } else if (Integer.parseInt(val) < min) {
                min = Integer.parseInt(val);
            }
        }

        return String.valueOf(min + " " + max);
    }
}