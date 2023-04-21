package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class inf_7_11 {
    static int [][]map = new int[7][7];
    static int [][]dist = new int[7][7];
    static int []dx = {-1,0,1,0};
    static int []dy = {0,1,0,-1};

    static int solution() {
        int ans = -1;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {0,0});
        while(!q.isEmpty()){
            int []temp = q.poll();
            int x = temp[0];
            int y = temp[1];
            map[x][y]=1;

            for(int i=0;i<4;i++){
                int nx = x+dx[i];
                int ny = y+dy[i];
                if(nx<0 || ny <0 || nx >=7 || ny>=7) continue;
                if(map[nx][ny]==1) continue;
                map[nx][ny]=1;
                dist[nx][ny] = dist[x][y]+1;
                q.offer(new int[] {nx,ny});
            }
        }
        ans=dist[6][6];

        if(map[6][6]==0)
            return -1;

        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0;i<7;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<7;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(solution());


    }
}
