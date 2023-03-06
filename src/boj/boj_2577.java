package boj;

import java.io.*;
import java.util.*;

public class boj_2577 {


    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int res = 1;
        for (int i = 0; i < 3; i++) {
            res *= Integer.parseInt(bf.readLine());
        }

        while (res != 0) {
            arr[res % 10]++;
            res /= 10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
