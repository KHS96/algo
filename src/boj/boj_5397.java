package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj_5397 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        for (int i = 0; i < n; i++) {
            StringBuilder ans = new StringBuilder();
            Stack<String> lstk = new Stack<>();
            Stack<String> rstk = new Stack<>();
            String temp = bf.readLine();

            for (int j = 0; j < temp.length(); j++) {
                char cmd = temp.charAt(j);
                switch (cmd) {
                    case '<':
                        if (!lstk.isEmpty())
                            rstk.push(lstk.pop());
                        break;
                    case '>':
                        if (!rstk.isEmpty())
                            lstk.push(rstk.pop());
                        break;
                    case '-':
                        if (!lstk.isEmpty())
                            lstk.pop();
                        break;
                    default:
                        lstk.push(cmd + "");
                        break;
                }
            }
            while (!lstk.isEmpty())
                rstk.push(lstk.pop());
            while (!rstk.isEmpty())
                ans.append(rstk.pop());
            System.out.println(ans);
        }

    }
}
