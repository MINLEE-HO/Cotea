package Programmers.Lv1;

import Programmers.logging;

// 숫자 문자열과 영단어
public class Pro_6 {
    public static void main(String[] args) {
        String s = "one4seveneight";
        logging.log(solution(s));
    }

    static int solution(String s) {
        String[] str = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for (int i = 0; i < str.length; i++) {
            s = s.replace(str[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }
}