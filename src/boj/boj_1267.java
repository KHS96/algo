package boj;

import java.io.*;
import java.util.*;

public class boj_1267 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer tk = new StringTokenizer(bf.readLine());
        int [] num = new int [n];
        int sum = 0;
        int y = 0;
        int m = 0;
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(tk.nextToken());
            y += (num[i] / 30)+1;
            m += (num[i] / 60)+1;
        }
        if ((y * 10) > (m * 15)) {
            System.out.println("M " + m * 15);
        } else if ((y * 10) < (m * 15)) {
            System.out.println("Y " + y * 10);
        } else {
            System.out.println("Y M " + y * 10);
        }
    }
}
