package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class boj_2468 {
    static int n;
    static int[][] map;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] visit;
    static ArrayList<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        int max = Integer.MIN_VALUE;

        //높이 정보를 받으며 최대 높이를 저장.
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int temp = Integer.parseInt(st.nextToken());
                max = Math.max(temp, max);
                map[i][j] = temp;
            }
        }

        //물에 잠기지 않는 영역의 개수를 저장.
        list = new ArrayList<>();

        for (int depth = 0; depth <= max; depth++) {
            int cnt = 0;
            visit = new boolean[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][j] > depth && !visit[i][j]) {
                        cnt++;
                        dfs(i, j, depth);
                    }
                }
            }
            //비의 양에 따라서 0부터 최대 높이까지 반복하며 영역의 개수를 하나씩 저장.
            list.add(cnt);

        }

        //영역의 개수중 가장 큰 값 출력
        int answer = Collections.max(list);
        System.out.println(answer);

    }

    public static void dfs(int x, int y, int depth) {
        visit[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
            if (map[nx][ny] > depth && !visit[nx][ny])
                dfs(nx, ny, depth);
        }
    }
}
