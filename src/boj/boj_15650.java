package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_15650 {
    static int n;
    static int m;
    static int[] arr = new int[10];
    static boolean[] chk = new boolean[10];

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(tk.nextToken());
        m = Integer.parseInt(tk.nextToken());
        func(1, 0);

    }

    static void func(int start, int depth) {
        if (depth == m) {       //k가 m(뽑아야 하는 수의 개수)
            for (int i = 0; i < m; i++) {   //다뽑았으면 출력
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= n; i++) {
            arr[depth] = i;
            func(i + 1, depth + 1);
        }
    }
}
