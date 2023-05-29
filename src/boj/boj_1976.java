package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1976 {
    static int n;
    static int m;

    static int[] arr;

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(bf.readLine());
        m = Integer.parseInt(bf.readLine());
        arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }


        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j = 1; j <= n; j++) {
                int temp = Integer.parseInt(st.nextToken());
                if (temp == 1) {
                    union(i, j);
                }
            }
        }

        st = new StringTokenizer(bf.readLine());
        int from = Integer.parseInt(st.nextToken());

        for (int i = 1; i < m; i++) {
            int to = Integer.parseInt(st.nextToken());

            if (find(from) != find(to)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");

    }

    public static int find(int num) {
        if (arr[num] == num)
            return num;
        return arr[num] = find(arr[num]);
    }

    public static void union(int x, int y) {
        x = find(x);
        y = find(y);

        if (x != y) {
            if (x < y) {
                arr[y] = x;
            } else {
                arr[x] = y;
            }
        }

    }

}
