package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_3_04 {
    static int solution(int n,int k, int[] a) {
        int lt=0;
        int sum=0;
        int ans=0;
        for(int rt=0;rt<n;rt++){
            sum+=a[rt];
            if(sum == k){
                ans++;
            }
            while(sum>=k){
                sum -= a[lt++];
                if(sum==k){
                    ans++;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr1 = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(n,k,arr1));


    }
}
