package boj;

import java.util.*;
import java.io.*;

public class boj_1475 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[10];
        int n = Integer.parseInt(bf.readLine());
        int ans = 0;

        while (n != 0) {
            if(n%10==9)
                num[6]++;
            else{
                num[n % 10]++;
            }

            n /= 10;
        }

        num[6] = num[6]/2 + num[6]%2;
        Arrays.sort(num);
        ans = num[9];
        System.out.println(ans);

    }
}
