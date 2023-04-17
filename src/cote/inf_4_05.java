package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class inf_4_05 {
    static int solution(int n, int m,int []arr) {
        int ans = -1;
        TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    ts.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }
        int idx = 0;
        for(int x : ts){
            idx++;
            if(idx == m)
                return x;
        }



        return ans;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(n,k,arr));


    }
}
