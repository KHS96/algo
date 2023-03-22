package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj_2504 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stk = new Stack<>();
        String s = bf.readLine();
        int ans = 0;
        int tmp = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                tmp *= 2;
                stk.push(c);
            } else if (c == '[') {
                tmp *= 3;
                stk.push(c);
            } else if (c == ')') {
                if (stk.isEmpty() || stk.peek() != '(') {
                    System.out.println(0);
                    return;
                }
                if (s.charAt(i-1) == '(') {
                    ans += tmp;
                }
                stk.pop();
                tmp /= 2;
            } else if (c == ']') {
                if (stk.isEmpty() || stk.peek() != '[') {
                    System.out.println(0);
                    return;
                }
                if (s.charAt(i-1)  == '[') {
                    ans += tmp;
                }
                stk.pop();
                tmp /= 3;
            }
        }
        if(stk.isEmpty())
            System.out.println(ans);
        else
            System.out.println(0);

    }
}
