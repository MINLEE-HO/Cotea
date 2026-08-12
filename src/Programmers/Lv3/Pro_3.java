package Programmers.Lv3;

import java.util.Arrays;
import Programmers.logging;

// hd2
public class Pro_3 {
    public static void main(String[] args) {
        int[] monster = {30, 7, -2, 3};
        // answer = [3,5,6,22];
        logging.log(solution(monster));
    }

    public static int[] solution(int[] monster) {
        // 1. 몬스터를 오름차순 정렬
        Arrays.sort(monster);

        int n = monster.length;
        int[] answer = new int[n];

        // prefixSum = 지금까지 잡은 몬스터 값의 누적합
        int prefixSum = 0;

        // need = 현재까지 필요한 최소 초기 전투력
        int need = 1;

        for (int i = 0; i < n; i++) {
            int cur = monster[i];

            // 현재 몬스터를 만나기 직전 전투력은
            // 초기값 x + prefixSum 이어야 함
            // 이 값이 cur 이상이어야 잡을 수 있음
            int needToFight = cur - prefixSum;

            // 몬스터를 잡고 나면 전투력은
            // x + prefixSum + cur
            // 이 값이 최소 1 이상이어야 함
            int needToSurvive = 1 - (prefixSum + cur);

            // 지금까지 필요한 최소 초기 전투력 갱신
            need = Math.max(need, needToFight);
            need = Math.max(need, needToSurvive);

            // i+1마리를 잡기 위한 최소 초기 전투력
            answer[i] = need;

            // 누적합 갱신
            prefixSum += cur;
        }

        return answer;
    }
}