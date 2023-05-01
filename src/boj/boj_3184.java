package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_3184 {
    static int []dx = {-1,0,1,0};
    static int []dy = {0,1,0,-1};
    static char [][]map;
    static boolean [][]visit;
    static int R;
    static int C;
    static int []ans = new int[2];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        // .: 땅, #: 울타리, V: 늑대, O: 양
        map = new char[R][C];
        visit = new boolean[R][C];

        int s = 0;
        int w = 0;

        for(int i=0;i<R;i++){
            String temp = br.readLine();
            for(int j=0;j<C;j++){
                map[i][j] = temp.charAt(j);
            }
        }

        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(!visit[i][j] && !(map[i][j] == '#')){
                    ans[0]=ans[1]=0;
                    int []x = dfs(i,j);
                    if( !(x[0] == 0 && x[1] == 0)){
                        if(x[1] >= x[0]){
                            w += x[1];
                        }else if(x[1] < x[0]){
                            s += x[0];
                        }
                    }

                }
            }
        }
        System.out.println(s);
        System.out.println(w);
    }
    static int[] dfs(int x,int y){

        visit[x][y] = true;
        if(map[x][y] == 'o')
            ans[0]++;
        if(map[x][y] == 'v')
            ans[1]++;

        for(int i=0;i<4;i++){
            int nx = x+dx[i];
            int ny = y+dy[i];

            if(nx < 0 || ny < 0 || nx >= R || ny >=C) continue;
            if(visit[nx][ny] || map[nx][ny]=='#') continue;
            dfs(nx,ny);
        }

        return ans;
    }
}
