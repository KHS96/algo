package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_2230 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int lt=0;
        int rt=0;
        int ans = Integer.MAX_VALUE;
        while(lt< n && rt <n){
            if(arr[rt]-arr[lt] >= m){
                ans = Math.min(ans,arr[rt]-arr[lt]);
                lt++;
            }else{
                rt++;
            }
        }
        System.out.println(ans);

    }
}
