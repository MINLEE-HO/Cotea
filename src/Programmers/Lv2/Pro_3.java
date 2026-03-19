package Programmers.Lv2;

import Programmers.logging;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// 올바른 괄호
public class Pro_3 {
    public static void main(String[] args) {
        String s = "(()(";
        logging.log(solution(s));
    }

    static boolean solution(String s) {
        int cnt = 0;
        for (char c: s.toCharArray()) {
            if (c == '(') {
                cnt++;
            } else {
                cnt--;
            }

            if (cnt < 0) {
                return false;
            }
        }
        return cnt==0;
    }
}