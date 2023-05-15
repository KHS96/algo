package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj_2531 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int d = Integer.parseInt(st.nextToken());
        int[] eated = new int[d + 1];
        int k = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        for (int i = 0; i < k; i++) {
            if (eated[arr[i]] == 0) {
                cnt++;
            }
            eated[arr[i]]++;

        }
        int max = cnt;

        for (int i = 1; i < n; i++) {
            if (max <= cnt) {
                max = cnt;
                if(eated[c] == 0){
                    cnt++;
                }
            }

            //시작점 이동 및 체크
            eated[arr[i - 1]]--;
            if (eated[arr[i - 1]] == 0) {
                cnt--;
            }


            int end = (i + k - 1) % n;
            if (eated[arr[end]] == 0) {
                cnt++;
            }
            eated[arr[end]]++;

        }
        System.out.println(max);


    }
}
