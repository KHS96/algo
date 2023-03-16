package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class boj_2667 {
    static int []dx = {-1,0,1,0};
    static int []dy = {0,1,0,-1};
    static int [][] visit;
    static int [][] map;
    static ArrayList<Integer> answer;
    static int N;
    static int cnt;
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bf.readLine()); // 점 개수
        visit = new int[N][N];
        map = new int[N][N];
        for(int i=0; i<N ;i++){
            String t = bf.readLine();
            for (int j=0;j<N;j++){
                map[i][j] = t.charAt(j)-'0';
            }
        }
        answer = new ArrayList<>();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(map[i][j] == 1 && visit[i][j] == 0){
                    cnt = 1;
                    dfs(i,j);
                    answer.add(cnt);
                }
            }
        }
        Collections.sort(answer);
        System.out.println(answer.size());
        for(int x : answer)
            System.out.println(x);
    }
    public static void dfs(int x,int y){
        visit[x][y] = 1;

        for(int i = 0 ;i<4;i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx >=0 && nx < N && ny >=0 && ny <N){
                if(map[nx][ny] == 1 && visit[nx][ny] == 0){
                    dfs(nx,ny);
                    cnt++;
                }
            }
        }
    }
}
