package boj;

import java.io.*;
import java.util.*;
public class boj_7576 {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int[][] map;
    static int[][] dist;
    static Queue<int[]> q;
    static int n,m;
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        q = new LinkedList<>();
        map = new int[m][n];
        dist = new int[m][n];

        for(int i=0;i<m;i++){
            st = new StringTokenizer(bf.readLine());
            for(int j=0;j<n;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 1)
                    q.add(new int[] {i,j});
                if(map[i][j] == 0)
                    dist[i][j] = -1;
            }
        }
        while(!q.isEmpty()){
            int [] t = q.poll();
            int x = t[0];
            int y = t[1];
            for(int i = 0;i<4;i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                //범위 체크
                if(nx < 0 || nx >= m || ny <0 || ny>=n ) continue;
                //거리가 0보다 크면 방문한적이 있으니까 continue
                if(dist[nx][ny] >= 0) continue;
                dist[nx][ny] = dist[x][y] + 1;  //이전까지의 거리에서 +1
                q.offer(new int[] {nx,ny});
            }
        }
        int ans  = 0 ;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dist[i][j] == -1){       //토마토가 익지않았다면
                    System.out.println("-1");
                    return;
                }
                ans = Math.max(dist[i][j],ans);
            }
        }
        System.out.println(ans);
    }

}
