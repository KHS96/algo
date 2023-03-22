package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_2512 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];

        StringTokenizer tk = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tk.nextToken());
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(bf.readLine());

        int l = 0;
        int r = arr[arr.length-1];
        while (l <= r) {
            long ans = 0 ;
            int idx = (l + r) / 2;
            for(int i=0;i<n;i++){
                if(arr[i] < idx){
                    ans+=arr[i];
                }else{
                    ans+=idx;
                }
            }
            if(ans >= m){
                r = idx-1;
            }else{
                l = idx+1;
            }
        }
        System.out.println(r);
    }
}
