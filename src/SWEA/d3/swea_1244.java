package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1244 {
    static String[] arr;
    static int max,chance;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr = st.nextToken().split("");
            chance = Integer.parseInt(st.nextToken());
            max = 0 ;
            if(arr.length < chance){
                chance = arr.length;
            }

            dfs(0,0);

            System.out.println("#" + tc + " " + max);
        }
    }

    static void dfs(int start, int cnt){
        if(cnt == chance){
            String result="";
            for(String s : arr){
                result +=s;
            }
            max = Math.max(max,Integer.parseInt(result));
            return;
        }

        for(int i=start; i<arr.length; i++){
            for(int j=i+1;j<arr.length;j++){

                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                dfs(i,cnt+1);

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
