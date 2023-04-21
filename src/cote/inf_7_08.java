package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class inf_7_08 {
    static int[] dist = new int[10001];
    static boolean[] visit = new boolean[10001];
    static int []dir = {1,-1,5};

    static int solution(int s, int n) {
        int ans = 0;
        Queue<Integer> q = new LinkedList<>();
        Arrays.fill(dist,9999);
        dist[s]=0;

        q.add(s);
        visit[s] = true;
        while (!q.isEmpty()) {
            int tmp = q.poll();
            if(tmp == n) break;
            for(int i=0;i<3;i++){
                int dx = tmp+dir[i];
                if( dx < 0 || dx > 10000) continue;
                if(visit[dx]) continue;
                visit[dx]=true;
                dist[dx] = Math.min(dist[dx],dist[tmp]+1);
                q.offer(dx);
            }

        }

        ans = dist[n];
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        System.out.println(solution(s, n));


    }
}
