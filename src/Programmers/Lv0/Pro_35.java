package Programmers.Lv0;

import Programmers.logging;

import java.util.Scanner;

// 대소문자 바꿔서 출력하기
public class Pro_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder temp = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            String c = s.substring(i, i+1);
            if (c.matches("[A-Z]")) {
                temp.append(c.toLowerCase());
            } else {
                temp.append(c.toUpperCase());
            }
        }
        System.out.println(temp);
    }
}

// aBcDeFg