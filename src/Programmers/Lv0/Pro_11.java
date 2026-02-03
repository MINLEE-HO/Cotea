package Programmers.Lv0;

import java.util.Scanner;

// 홀짝 구분하기
public class Pro_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String answer = n%2==0 ? " is even" : " is odd";
        System.out.println(n+answer);
    }
}