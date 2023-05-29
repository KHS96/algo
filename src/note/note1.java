package note;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class note1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        int center_nodes = Integer.parseInt(st.nextToken());
        int center_edges = Integer.parseInt(st.nextToken());
        int[] visit = new int[center_nodes + 1];
        int[][] arr = new int[center_nodes + 1][center_nodes + 1];
        for (int i = 0; i < center_edges; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            arr[from][to] = 1;
            arr[to][from] = 1;
        }

        //status 입력받기
        center_nodes = Integer.parseInt(br.readLine());
        int[] status = new int[center_nodes + 1];
        for (int i = 1; i <= center_nodes; i++) {
            status[i] = Integer.parseInt(br.readLine());
            if (status[i] == 3)
                q.offer(i);
        }


        //방문 처리
        while (!q.isEmpty()) {
            int temp = q.poll();
            for (int i = 1; i <= center_nodes; i++) {
                if (arr[temp][i] == 1 || arr[i][temp] == 1) {
                    status[i] = 2;
                    visit[i] = visit[temp] + 1;
                    arr[temp][i] = 0;
                    arr[i][temp] = 0;
                    if (Check(status)) {
                        break;
                    }
                    q.offer(i);

                }
            }
        }
        int ans = 0;
        for (int i = 1; i <= center_nodes; i++) {
//            ans = Math.max(ans, visit[i]);
            System.out.println("i = " + i + " visit[i] = " + visit[i]);
        }
        System.out.println(ans);


    }

    static boolean Check(int[] status) {
        for (int i = 1; i < status.length; i++) {
            if (status[i] == 3)
                return false;
        }
        return true;
    }

}
