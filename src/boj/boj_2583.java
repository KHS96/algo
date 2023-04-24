package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj_2583 {
    static int[][] map;
    static int[][] visit;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int m,n;
    static ArrayList<Integer> ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        map = new int[m][n];
        visit = new int [m][n];
        for(int i=0;i<k;i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int a=x1;a<x2;a++){
                for(int b=y1;b<y2;b++){
                    map[b][a] = 1;
                }
            }
        }

        ans = new ArrayList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(map[i][j]==0 && visit[i][j]==0){
                    bfs(i,j);
                }
            }
        }
        System.out.println(ans.size());
        Collections.sort(ans);
        for(int x : ans){
            System.out.print(x+" ");
        }
    }
    public static void bfs(int x,int y){
        int area = 0;
        Queue<int[]> q = new LinkedList<>();
        visit[x][y]=1;
        q.offer(new int[] {x,y});
        while(!q.isEmpty()){
            area++;
            int []tmp = q.poll();
            int cx = tmp[0];
            int cy = tmp[1];
            for(int i=0;i<4;i++){
                int nx = cx+dx[i];
                int ny = cy+dy[i];

                if(nx<0 || ny<0 || nx>=m || ny>=n) continue;
                if(visit[nx][ny]==1 || map[nx][ny]==1) continue;
                q.offer(new int[] {nx,ny});
                visit[nx][ny]=1;
            }
        }
        ans.add(area);
    }
}
