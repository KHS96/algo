package boj;

import java.util.*;
import java.io.*;

public class boj_10773 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Stack<Integer> stk = new Stack<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(bf.readLine());
            if (tmp != 0) {
                stk.push(tmp);
            } else {
                stk.pop();
            }
        }
        for (int i = 0; i < stk.size(); i++)
            sum += stk.elementAt(i);

        System.out.println(sum);
    }
}
