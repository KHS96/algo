package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_9480 {
    static int rs;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int tc=1;tc<=t;tc++){
            int n = Integer.parseInt(br.readLine());
            rs = 0;
            boolean [][] arr = new boolean[n][26];

            for(int i =0;i<n;i++){
                char[] str = br.readLine().toCharArray();
                for(int j=0;j< str.length;j++){
                    arr[i][str[j]-'a'] = true;
                }
            }
            dfs(0,n,arr,new int[26]);

            System.out.println("#" + tc + " " + rs);
        }
    }

    static void dfs(int depth, int cnt, boolean [][] arr, int[] check){
        if(depth == cnt){
            int flag = 0;
            for(int i=0;i<check.length;i++){
                if(check[i] >= 1){
                    ++flag;
                }
            }
            if(flag ==26)
                rs++;

            return;
        }

        for(int j=0;j<arr[depth].length;j++){
            if(arr[depth][j]){
                check[j]++;
            }
        }
        dfs(depth+1,cnt,arr,check);
        for(int j=0;j<arr[depth].length;j++){
            if(arr[depth][j]){
                check[j]--;
            }
        }
        dfs(depth+1,cnt,arr,check);
    }

}
