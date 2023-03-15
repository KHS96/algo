package programmers;

import java.util.*;
public class Pro_1844 {
    int [] dx = {-1,0,1,0};
    int [] dy = {0,1,0,-1};
    int n;
    int m;
    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        int answer = 0;

        int [][]visit = new int[n][m];
        bfs(maps,visit);

        answer = visit[n-1][m-1];
        if(answer==0)
            return -1;

        return answer;
    }
    public void bfs(int [][] maps, int [][] visit){
        Queue<int []> q = new LinkedList<>();
        int x = 0;
        int y = 0;
        visit[x][y] = 1;
        q.add(new int []{x,y});

        while(!q.isEmpty()){
            int[] temp = q.poll();
            int cx = temp[0];
            int cy = temp[1];

            for(int i =0;i<4;i++){
                int nx = cx+dx[i];
                int ny = cy+dy[i];
                if(nx >= 0 && nx < n && ny >=0 && ny < m){
                    if(visit[nx][ny] == 0 && maps[nx][ny] == 1){
                        visit[nx][ny] = visit[cx][cy] + 1;
                        q.add(new int [] {nx,ny});
                    }
                }
            }
        }
    }

}
