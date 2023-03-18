package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj_2493 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] num = new int[n];
        int[] ans = new int[n];
        StringTokenizer tk = new StringTokenizer(bf.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(tk.nextToken());
            map.put(num[i],i+1);
        }
        ans[0] = 0;
        stk.push(num[0]);

        for(int i =1;i<n;i++){
            while(!stk.isEmpty() && stk.peek() <= num[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                ans[i] = 0;
            }
            else
                ans[i] = map.get(stk.peek());
            stk.push(num[i]);

        }
        for(int x : ans){
            System.out.print(x+ " ");

        }
    }
}
