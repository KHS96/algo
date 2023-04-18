package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class inf_5_04 {
    static int solution(String s) {
        int ans = 0;
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            char tmp = s.charAt(i);
            if(tmp == '(')
                stk.push(tmp);
            else{
                stk.pop();
                if(s.charAt(i-1) == '(')
                    ans+=stk.size();
                else
                    ans+=1;
            }
        }
        return ans;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(solution(s));


    }
}
