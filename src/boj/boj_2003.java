package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int ans = 0;

        int lt=0,rt=0;
        while(lt<n && rt<n){
            int temp=0;
            for(int i=lt;i<=rt;i++){
                temp += arr[i];
            }

            if(temp == m){
                ans++;
                rt++;
            }else if(temp < m){
                rt++;
            }else if(temp > m){
                lt++;
            }
        }
        System.out.println(ans);
    }
}
