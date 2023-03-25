package boj;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_7562 {

    static int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[][] map;
    static boolean[][] visit;
    static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            q = new LinkedList<>();
            int I = Integer.parseInt(br.readLine());
            map = new int[I][I];
            visit = new boolean[I][I];
            StringTokenizer tk = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(tk.nextToken());
            int y1 = Integer.parseInt(tk.nextToken());
            tk = new StringTokenizer(br.readLine());
            int x2 = Integer.parseInt(tk.nextToken());
            int y2 = Integer.parseInt(tk.nextToken());

            q.offer(new int[] {x1,y1});
            visit[x1][y1] = true;

            while(!q.isEmpty()){
                int []temp = q.poll();
                int x = temp[0];
                int y = temp[1];

                if(x == x2 && y == y2)
                    break;

                for(int dir=0;dir<8;dir++){
                    int nx = x+dx[dir];
                    int ny = y+dy[dir];

                    if(nx<0 || ny <0 || nx>=I || ny >=I) continue;
                    if(visit[nx][ny] || map[nx][ny]!=0) continue;
                    map[nx][ny] = map[x][y] + 1;
                    q.offer(new int[] {nx,ny});
                }
            }
            System.out.println(map[x2][y2]);
        }
    }
}
