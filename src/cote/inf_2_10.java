package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_2_10 {
    static int []dx = {-1,0,1,0};
    static int []dy = {0,1,0,-1};

    static int solution(int n, int[][] num) {
        int answer = 0 ;
        int chk = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                chk=0;
                for(int k=0;k<4;k++){
                    int x = i+dx[k];
                    int y = j+dy[k];
                    if(x<0 || y<0 || x>=n || y>=n) continue;
                    if(num[i][j] <= num[x][y]){
                        chk=1;
                        break;
                    }
                }
                if(chk==0)
                    answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [][]num = new int[n][n];
        StringTokenizer st;
        for(int i=0;i<n;i++){
             st = new StringTokenizer(br.readLine());
             for(int j=0;j<n;j++){
                 num[i][j] = Integer.parseInt(st.nextToken());
             }
        }

        System.out.println(solution(n,num));


    }
}
