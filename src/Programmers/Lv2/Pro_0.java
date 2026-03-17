package Programmers.Lv2;

import Programmers.logging;

import java.util.HashMap;
import java.util.Map;

// 의상
public class Pro_0 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat","face"},
                                {"blue_sunglasses","face"},
                                {"green_turban","face"}};
        logging.log(solution(clothes));
    }

    static int solution(String[][] clothes){
        Map<String,Integer> map = new HashMap<>();
        int answer = 1;
        for (int i=0; i<clothes.length; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1],0) + 1);
        }

        for (int cnt : map.values()){
            answer *= (cnt + 1);
        }
        return answer-1;
    }
}