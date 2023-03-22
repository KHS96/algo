package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        StringTokenizer tk = new StringTokenizer(br.readLine());
        for(int i =0;i<n;i++){
            arr[i] = Integer.parseInt(tk.nextToken());
        }
        Arrays.sort(arr);
        int m = Integer.parseInt(br.readLine());
        int []ans = new int[m];

        tk = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            int t = Integer.parseInt(tk.nextToken());
            int l = 0;
            int r = arr.length-1;
            while(l<=r) {
                int idx = (l+r)/2;
                if (t > arr[idx]) {
                    l = idx + 1;
                } else if (t < arr[idx]) {
                    r = idx - 1;
                } else {
                    ans[i] = 1;
                    break;
                }
            }
            System.out.println(ans[i]);
        }
    }
}
