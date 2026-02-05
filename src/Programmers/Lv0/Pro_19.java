package Programmers.Lv0;

import Programmers.logging;

// 접두사인지 확인하기
public class Pro_19 {
    public static void main(String[] args) {
        String my_string = "banana";
        String is_prefix = "nan";
        logging.log(solution(my_string, is_prefix));
    }

    static int solution(String my_string, String is_prefix) {
        for (int i = 0; i < my_string.length(); i++) {
            if (is_prefix.equals(my_string.substring(0,i))) {
                return 1;
            }
        }
        return 0;

        // if (my_string.startsWith(is_prefix)) return 1;
        // return 0;
    }
}

// String.startsWith 메소드 기억