package boj;

import java.io.*;
import java.util.*;


public class boj_10799 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        Stack<Character> stack = new Stack<>();
        int ans = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if( c == '('){          // ( 괄호가 나오면 무조건 push
                stack.push(c);
                continue;
            }
            if(c==')'){             // ) 괄호가 나온다면 우선 pop
                stack.pop();

                if(s.charAt(i-1) == '('){       //pop한 이전의 괄호가 ( 괄호이면 레이저 이므로 이때까지 쌓인 스택의 크기만큼 +
                    ans += stack.size();
                }else{                          //pop한 이전의 괄호가 ) 괄호이면 쇠막대기의 끝이므로 + 1
                    ans += 1;
                }
            }
        }
        System.out.println(ans);
    }


}
