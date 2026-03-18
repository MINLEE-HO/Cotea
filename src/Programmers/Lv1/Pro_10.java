package Programmers.Lv1;

import Programmers.logging;

import java.util.HashMap;
import java.util.Map;

// 카드 뭉치
public class Pro_10 {
    public static void main(String[] args) {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        logging.log(solution(cards1, cards2, goal));
    }

    static String solution(String[] cards1, String[] cards2, String[] goal) {
        int cnt1 = 0;
        int cnt2 = 0;
        for (String temp : goal) {
            if (cnt1 < cards1.length && temp.equals(cards1[cnt1])) {
                cnt1++;
            } else if (cnt2 < cards2.length && temp.equals(cards2[cnt2])) {
                cnt2++;
            }
            else {
                return "No";
            }
        }
        return "Yes";
    }
}