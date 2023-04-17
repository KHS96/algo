package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class inf_5_01 {
    static String solution(String s) {
        String ans="YES";
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            char t = s.charAt(i);
            if(t== '(')
                stk.push(t);
            else{
                if(stk.isEmpty()) return "NO";
                stk.pop();
            }
        }
        if(!stk.isEmpty())
            return "NO";

        return ans;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(solution(s));


    }
}
