package Programmers.Lv3;

import Programmers.logging;

import java.util.*;

// 게임 맵 최단거리
public class Pro_1 {
    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1},
                        {1,0,1,0,1},
                        {1,0,1,1,1},
                        {1,1,1,0,1},
                        {0,0,0,0,1}};
        logging.log(solution(maps));
    }

    public static int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        int[][] dist = new int[n][m];
        dist[0][0] = 1;

        boolean[][] visited = new boolean[n][m];
        visited[0][0] = true;

        Queue<int[]> qu = new LinkedList<>();
        qu.offer(new int[]{0,0});

        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};

        while(!qu.isEmpty()) {
            int[] current = qu.poll();
            int x = current[0];
            int y = current[1];

            for (int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx<0 || ny<0 || nx>=n || ny>=m) { continue; }
                if (visited[nx][ny] || maps[nx][ny] == 0) { continue; }

                visited[nx][ny] = true;
                dist[nx][ny] = dist[x][y] + 1;

                qu.offer(new int[]{nx,ny});
            }
        }

        return dist[n-1][m-1] == 0 ? -1 : dist[n-1][m-1];
    }
}