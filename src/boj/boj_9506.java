package boj;

import java.io.*;
import java.util.*;

public class boj_9506 {

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringBuilder s = new StringBuilder(" = ");
            int a = Integer.parseInt(bf.readLine());
            if(a==-1)
                return;
            int sum = 0;
            for (int i = 1; i <= a / 2; i++) {
                if (a % i == 0) {
                    sum += i;
                    if(i == a/2)
                        s.append(i);
                    else
                        s.append(i + " + ");
                }
            }
            if (a == sum) {
                System.out.println(a+ "" + s);
            } else {
                System.out.println(a + " is NOT perfect.");
            }
        }
    }
}
