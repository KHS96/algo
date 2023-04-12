package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_2_09 {

    static int solution(int n, int[][] num) {
        int max = 0;

        //가로
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<n;j++){
                sum+=num[i][j];
            }
            max = Math.max(max,sum);
        }

        //세로
        for(int j=0;j<n;j++){
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=num[i][j];
            }
            max = Math.max(max,sum);
        }

        //오른쪽아래 대각선
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=num[i][i];
            max = Math.max(max,sum);
        }

        //왼쪽아래 대각선
        sum = 0;
        for(int i=0;i<n;i++){
            sum+=num[n-1-i][i];
            max = Math.max(max,sum);
        }




        return max;
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
