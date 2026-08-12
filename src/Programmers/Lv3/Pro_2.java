package Programmers.Lv3;

import java.util.Arrays;
import Programmers.logging;

// hd1
public class Pro_2 {
    public static void main(String[] args) {
        int h = 2;
        int w = 5;
        int[] necessary = {1, 8, 5};
        // answer = 6;

//        int h = 4;
//        int w = 4;
//        int[] necessary = {1,10,8,16};
        // answer = 8;

        logging.log(solution(h, w, necessary));
    }

    public static int solution(int h, int w, int[] necessary) {
        // 1은 시작점이므로 necessary에 있더라도 따로 방문 대상으로 둘 필요 없음
        int[] targets = Arrays.stream(necessary)
                .filter(x -> x != 1)
                .toArray();

        int n = targets.length;

        // 필수 방문 지점이 없으면 이동 0
        if (n == 0) {
            return 0;
        }

        // 시작점(1) + targets 의 좌표
        int[][] pos = new int[n + 1][2];

        // 시작점 1 -> (0,0)
        pos[0][0] = 0;
        pos[0][1] = 0;

        // targets 좌표 저장
        for (int i = 0; i < n; i++) {
            int num = targets[i];
            pos[i + 1][0] = (num - 1) / w; // row
            pos[i + 1][1] = (num - 1) % w; // col
        }

        // dist[i][j] : pos[i]에서 pos[j]까지 맨해튼 거리
        int[][] dist = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                dist[i][j] = Math.abs(pos[i][0] - pos[j][0])
                        + Math.abs(pos[i][1] - pos[j][1]);
            }
        }

        int INF = Integer.MAX_VALUE / 4;
        int[][] dp = new int[1 << n][n];

        for (int i = 0; i < (1 << n); i++) {
            Arrays.fill(dp[i], INF);
        }

        // 시작점에서 각 target으로 바로 가는 초기값
        for (int i = 0; i < n; i++) {
            dp[1 << i][i] = dist[0][i + 1];
        }

        // 비트마스크 DP
        for (int mask = 0; mask < (1 << n); mask++) {
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) == 0) continue; // i를 방문 안했으면 skip
                if (dp[mask][i] == INF) continue;

                for (int j = 0; j < n; j++) {
                    if ((mask & (1 << j)) != 0) continue; // 이미 방문한 곳이면 skip

                    int nextMask = mask | (1 << j);
                    dp[nextMask][j] = Math.min(
                            dp[nextMask][j],
                            dp[mask][i] + dist[i + 1][j + 1]
                    );
                }
            }
        }

        int fullMask = (1 << n) - 1;
        int answer = INF;

        for (int i = 0; i < n; i++) {
            answer = Math.min(answer, dp[fullMask][i]);
        }

        return answer;
    }
}