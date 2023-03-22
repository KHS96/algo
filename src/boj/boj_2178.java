package boj;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_2178 {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] map;
    static int[][] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tk.nextToken());
        int m = Integer.parseInt(tk.nextToken());
        Queue<int[]> q = new LinkedList<>();

        map = new int [n][m];
        dist = new int[n][m];

        for(int i=0;i<n;i++){
            String s = br.readLine();
            for(int j=0;j<m;j++){
                map[i][j] = s.charAt(j)-'0';
            }
        }
        dist[0][0] = 1;
        q.offer(new int[] {0,0});

        while(!q.isEmpty()){
            int[] t = q.poll();
            int x = t[0];
            int y = t[1];
            for(int i =0;i<4;i++){
                int nx = x+dx[i];
                int ny = y+dy[i];

                if(nx <0 || ny <0 || nx>=n || ny>=m) continue;
                if(map[nx][ny] !=1 || dist[nx][ny] != 0) continue;
                dist[nx][ny] = dist[x][y]+1;
                q.offer(new int[] {nx,ny});
            }
        }
        System.out.println(dist[n-1][m-1]);
    }
}
