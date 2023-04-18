package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class inf_5_03 {
    static int solution(String s) {
        int ans = 0;
        Stack<Integer> stk = new Stack<>();
        for(char x : s.toCharArray()){
            if(Character.isDigit(x)){
                stk.push(x-'0');
            }else{
                int b = stk.pop();
                int f = stk.pop();
                switch (x){
                    case '-':
                        stk.push(f-b);
                        break;
                    case '+':
                        stk.push(f+b);
                        break;
                    case '*':
                        stk.push(f*b);
                        break;
                    case '/':
                        stk.push(f/b);
                        break;
                    default:
                        break;
                }
            }
        }
        ans = stk.pop();
        return ans;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(solution(s));


    }
}
