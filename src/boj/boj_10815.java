package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj_10815 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int []sg = new int[n];

        StringTokenizer tk = new StringTokenizer(bf.readLine());
        for(int i=0;i<n;i++){
            sg[i] = Integer.parseInt(tk.nextToken());
        }
        Arrays.sort(sg);

        int m = Integer.parseInt(bf.readLine());
        int []ans = new int[m];
        tk = new StringTokenizer(bf.readLine());
        for(int i=0;i<m;i++){
            int l = 0;
            int r = sg.length-1;
            int tmp = Integer.parseInt(tk.nextToken());
            while(l<=r){
                int idx = (l+r)/2;
                if(sg[idx] > tmp){
                    r = idx-1;
                }else if(sg[idx] < tmp){
                    l = idx+1;
                }else{
                    ans[i] = 1;
                    break;
                }
            }
        }

        for(int x : ans){
            System.out.print(x + " ");
        }
    }
}
