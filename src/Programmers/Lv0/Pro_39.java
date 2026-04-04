package Programmers.Lv0;

import Programmers.logging;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 
public class Pro_39 {
    public static void main(String[] args) {
        int[] arr = {1,6,3,4,5};
        logging.log("original");
        System.out.println(Arrays.toString(arr));

//        Arrays.sort(arr);
//        logging.log("arryas.sort");
//        System.out.println(Arrays.toString(arr));

        List<Integer> list = new ArrayList<>();
        for (int val : arr) {
            list.add(val);
        }

        logging.log("original list");
        System.out.println(Arrays.toString(list.toArray()));

        Collections.sort(list);
        logging.log("Collections list");
        System.out.println(Arrays.toString(list.toArray()));

        Collections.sort(list, Collections.reverseOrder());
        logging.log("Collections reverOrder list");
        System.out.println(Arrays.toString(list.toArray()));


    }
}