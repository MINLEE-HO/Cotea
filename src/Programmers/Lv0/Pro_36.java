package Programmers.Lv0;

import Programmers.logging;

// 문자열 겹쳐쓰기
public class Pro_36 {
    public static void main(String[] args) {
        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        int s = 2;
        logging.log(solution(my_string, overwrite_string, s));
    }

    static String solution(String my_string, String overwrite_string, int s) {
        String front = my_string.substring(0, s);
        String back = my_string.substring(s+ overwrite_string.length());
        return front + overwrite_string + back;
    }
}