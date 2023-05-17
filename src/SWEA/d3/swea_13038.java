package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class swea_13038 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int[] arr = new int[7];
            int n = Integer.parseInt(br.readLine());
            Queue<Integer> q = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 7; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                if (arr[i] == 1)
                    q.add(i);
            }
            int min = Integer.MAX_VALUE;
            while (!q.isEmpty()) {
                int idx = 0;
                int cnt = 0;
                int s = q.poll();
                while (true) {
                    idx++;
                    if (arr[s % 7] == 1) {
                        cnt++;
                    }
                    if (cnt == n) {
                        min = Math.min(min, idx);
                        break;
                    }
                    s++;
                }

            }

            System.out.println("#" + tc + " " + min);
        }

    }

}
