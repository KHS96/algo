package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_2_11 {
    static int solution(int n, int[][] num) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int cnt = 0 ;
            for(int j=0;j<n;j++){
                for(int k=0;k<5;k++){
                    if(num[i][k] == num[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max){
                max = cnt;
                answer=i+1;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [][]num = new int[n][5];
        StringTokenizer st;
        for(int i=0;i<n;i++){
             st = new StringTokenizer(br.readLine());
             for(int j=0;j<5;j++){
                 num[i][j] = Integer.parseInt(st.nextToken());
             }
        }

        System.out.println(solution(n,num));


    }
}
