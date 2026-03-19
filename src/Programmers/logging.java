package Programmers;

import java.util.Arrays;
import java.util.Map;

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

    public static void log(Map map) {
        System.out.println(map);
    }

    public static void log(double n) { System.out.println(n); }

    public static void log(long[] arr) { System.out.println(Arrays.toString(arr)); }

    public static void log(String[] arr) { System.out.println(Arrays.toString(arr)); }

    public static void log(boolean flag) { System.out.println(flag); }

}
