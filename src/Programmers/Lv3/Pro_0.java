package Programmers.Lv3;

import Programmers.logging;

import java.util.HashMap;
import java.util.Map;

// 베스트앨범
public class Pro_0 {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        // answer = [4,1,3,0]
        /*
        0.classic(500)
        1.pop(600)
        2.classic(150)
        3.classic(800)
        4.pop(2500)
         */
        logging.log(solution(genres, plays));
    }

    static int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<genres.length; i++){ map.put(genres[i], plays[i]); }
        logging.log(map);

        return new int[2];
    }
}