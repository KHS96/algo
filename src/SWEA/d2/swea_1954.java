package SWEA.d2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_1954 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int dx[] = {0, 1, 0, -1};
        int dy[] = {1, 0, -1, 0};

        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            int[][] map = new int[n][n];
            int cnt = 1;

            int dir = 0;
            int x = 0;
            int y = 0;

            while(cnt <= n*n){
                map[x][y] = cnt;
                int nx = x + dx [dir];
                int ny = y + dy [dir];

                if(nx <0 || ny <0 || nx>=n || ny>=n || map[nx][ny]!=0){
                    dir++;
                    if(dir%4==0)
                        dir=0;

                    nx = x+dx[dir];
                    ny = y+dy[dir];
                }
                x = nx;
                y = ny;
                cnt++;
            }
            System.out.println("#"+tc);
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(map[i][j]+ " ");
                }
                System.out.println();
            }

        }

    }
}
