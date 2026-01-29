package Programmers;

import java.util.Arrays;

public class logging {
    public static void log(String s) {
        System.out.println(s);
    }

    public static void log(int n) {
        System.out.println(n);
    }

    public static void log(int[] n) {
        System.out.println(Arrays.toString(n));
    }
}
