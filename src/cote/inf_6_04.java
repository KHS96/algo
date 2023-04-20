package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_6_04 {
    static int[] solution(int s, int n, int[] arr) {
        int[] ans = new int[s];
        for (int x : arr) {
            int pos = -1;

            //cache에 있는지 확인 후에 hit라면 인덱스 저장
            for (int i = 0; i < s; i++) {
                if (x == ans[i]) {
                    pos = i;
                }
            }
            if (pos == -1) {
                for (int i = s - 1; i >= 1; i--) {
                    ans[i] = ans[i - 1];
                }
            } else {
                for (int i = pos; i >= 1; i--) {
                    ans[i] = ans[i - 1];
                }
            }
            ans[0] = x;


        }


        return ans;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int x : solution(s, n, arr)) {
            System.out.print(x + " ");
        }


    }
}
