package Programmers.Lv0;

import Programmers.logging;

// 조건 문자열
public class Pro_38 {
    public static void main(String[] args) {
        String ineq = ">";
        String eq = "!";
        int n = 41;
        int m = 78;
        logging.log(solution(ineq, eq, n, m));
    }

    static int solution(String ineq, String eq, int n, int m) {
        if (ineq.equals("<") && n < m && eq.equals("=")) return 1;
        else if (ineq.equals(">") && n > m && eq.equals("=")) return 1;

        return 0;
    }
}