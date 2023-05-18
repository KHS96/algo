package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_10580 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int ans = 0;

            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][2];
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i][0] < arr[j][0] && arr[i][1] > arr[j][1]) {
                        ans++;
                    }else if(arr[i][0] > arr[j][0] && arr[i][1] < arr[j][1]){
                        ans++;
                    }
                }
            }

            System.out.println("#" + tc + " " + ans);
        }

    }


}
