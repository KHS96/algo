package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_5014 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int F = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int U = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int[] cnt = new int[1000001];
        Arrays.fill(cnt, Integer.MAX_VALUE);
        cnt[S] = 0;

        Queue<Integer> q = new LinkedList<>();
        q.offer(S);

        while (!q.isEmpty()) {
            int temp = q.poll();

            if (temp == G) {
                System.out.println(cnt[G]);
                return;
            }

            int tx = temp + U;
            if (tx >= 1 && tx <= F && cnt[tx] > cnt[temp] + 1) {
                q.offer(tx);
                cnt[tx] = cnt[temp] + 1;
            }


            tx = temp - D;
            if (tx >= 1 && tx <= F && cnt[tx] > cnt[temp] + 1) {
                q.offer(tx);
                cnt[tx] = cnt[temp] + 1;
            }

        }
        System.out.println("use the stairs");
    }
}
