package boj;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_1012 {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] map;
    static int[][] visit;
    static Queue<int[]> q = new LinkedList<>();
    static int n, m;
    static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < N; tc++) {
            ans=0;
            StringTokenizer tk = new StringTokenizer(br.readLine());
            m = Integer.parseInt(tk.nextToken());
            n = Integer.parseInt(tk.nextToken());
            int k = Integer.parseInt(tk.nextToken());


            map = new int[n][m];
            visit = new int[n][m];

            for (int i = 0; i < k; i++) {
                tk = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(tk.nextToken());
                int y = Integer.parseInt(tk.nextToken());
                map[y][x] = 1;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (map[i][j] == 1 && visit[i][j]==0) {
                        visit[i][j] = 1;
                        q.offer(new int[]{i, j});
                        bfs();
                    }
                }
            }
            System.out.println(ans);
        }

    }

    public static void bfs() {
        ans++;
        while (!q.isEmpty()) {
            int[] t = q.poll();
            int x = t[0];
            int y = t[1];
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (map[nx][ny] != 1 || visit[nx][ny] != 0) continue;
                visit[nx][ny] = 1;
                q.offer(new int[]{nx, ny});
            }
        }
    }
}
