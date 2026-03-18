package Programmers.Lv1;

import Programmers.logging;
import java.util.*;

// 문자열 내 마음대로 정렬하기
public class Pro_9 {
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        logging.log(solution(strings, n));
    }

    static String[] solution(String[] strings, int n) {
        Arrays.sort(strings , (a,b) -> {
            if (a.charAt(n) == b.charAt(n)) {
                return a.compareTo(b);
            }
            return Character.compare(a.charAt(n), b.charAt(n));
        });

        return strings;
    }
}