package Programmers.Lv0;

import Programmers.logging;

import java.util.Arrays;

// 문자 리스트를 문자열로 변환하기
public class Pro_8 {
    public static void main(String[] args) {
        String[] arr = {"a","b","c"};
        logging.log(solution(arr));
    }

    static String solution(String[] arr){
        String answer = "";
        for (String c : arr) {
            answer += c;
        }
        return answer;
    }
}