package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_22862 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int lt = 0;
        int rt = 0;
        int cnt = 0;
        int max = Integer.MIN_VALUE;
        while (rt < n) {

            if (cnt < k) {
                if (arr[rt] % 2 == 1)
                    cnt++;
                rt++;
                max = Math.max(max, rt - lt - cnt);
            }else if(arr[rt]%2 == 0){
                rt++;
                max = Math.max(max, rt - lt - cnt);
            }else{
                if(arr[lt] % 2 ==1){
                    cnt--;
                }
                lt++;
            }
        }

        System.out.println(max);

    }
}
