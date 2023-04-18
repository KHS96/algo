package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class inf_5_02 {
    static String solution(String s) {
        String ans="";
        Stack<Character> stk = new Stack<>();
        for(char x : s.toCharArray()){
            if(x != ')'){
                stk.push(x);
            }else{
                while(stk.pop() != '(');
            }
        }
        for(int i=0;i<stk.size();i++){
            ans += stk.get(i);
        }

        return ans;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(solution(s));


    }
}
