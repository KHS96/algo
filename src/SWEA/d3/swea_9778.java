package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_9778 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            String ans = "STOP";
            int[] arr = new int[12];
            for (int i = 2; i <= 9; i++) {
                arr[i] = 4;
            }
            arr[10] = 16;
            arr[11] = 4;

            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int temp = Integer.parseInt(br.readLine());
                arr[temp]--;
                sum += temp;
            }

            int high = 0;
            int low = 0;

            for(int i=2;i<=11;i++){
                if(arr[i] != 0 && sum+i < 21){
                    low++;
                }else if(arr[i] != 0 && sum+i >=21){
                    high++;
                }
            }

            if (high >= low) {
                ans = "STOP";
            } else {
                ans = "GAZUA";
            }


            System.out.println("#" + tc + " " + ans);
        }

    }


}
