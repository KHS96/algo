package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class swea_14413 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static char[][] map;
    static boolean[][] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            map = new char[n][m];
            visit = new boolean[n][m];
            Queue<int[]> q = new LinkedList<>();
            String ans = "possible";
            for (int i = 0; i < n; i++) {
                String temp = br.readLine();
                for (int j = 0; j < m; j++) {
                    char ch = temp.charAt(j);
                    if (ch != '?') {
                        q.offer(new int[]{i, j});
                    }
                    map[i][j] = ch;
                }
            }

            while (!q.isEmpty()) {
                int[] pos = q.poll();
                int x = pos[0];
                int y = pos[1];
                visit[x][y] = true;
                char c = map[x][y];

                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                    if (visit[nx][ny]) continue;
                    if (map[nx][ny] == '?') {
                        q.offer(new int[]{nx, ny});
                        if (c == '#') {
                            map[nx][ny] = '.';
                        } else {
                            map[nx][ny] = '#';
                        }
                    } else if (map[nx][ny] == c) {
                        ans = "impossible";
                    }
                }

            }


            System.out.println("#" + tc + " " + ans);
        }
    }

}
