package Programmers.Lv0;

import Programmers.logging;

// 접미사인지 확인하기
public class Pro_22 {
    public static void main(String[] args) {
        String my_string = "banana";
        String is_suffix = "ana";
        logging.log(solution(my_string, is_suffix));
    }

    static int solution(String my_string, String is_suffix) {
        for (int i = 0; i < my_string.length(); i++) {
            if (is_suffix.equals(my_string.substring(i))) {
                return 1;
            }
        }

        return 0;
    }
}