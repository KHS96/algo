package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj_4949 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer tk = new StringTokenizer(bf.readLine());
        while (true) {
            String s = br.readLine();
            if (s.equals("."))
                break;
            Stack<Character> stk = new Stack<>();
            boolean flag = true;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '[') {
                    stk.push(c);
                } else if (c == ')') {
                    if (!stk.isEmpty() && stk.peek() == '(') {
                        stk.pop();
                    } else {
                        flag = false;
                        break;
                    }
                } else if (c == ']') {
                    if (!stk.isEmpty() && stk.peek() == '[') {
                        stk.pop();
                    } else {
                        flag = false;
                        break;
                    }
                }
            }
            if(flag && stk.isEmpty()){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
