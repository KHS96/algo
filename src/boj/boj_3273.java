package boj;

import java.util.*;
import java.io.*;

public class boj_3273 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] num = new int[n];
        int ans = 0;
        StringTokenizer tk = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(tk.nextToken());
        }
        int sum = Integer.parseInt(bf.readLine());
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                temp = num[i] + num[j];
                if (sum == temp) {
                    ans++;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
