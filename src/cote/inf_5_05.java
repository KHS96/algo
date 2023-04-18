package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class inf_5_05 {
    static String solution(String a, String b) {
        String ans = "YES";
        Queue<Character> q1 = new LinkedList<>();
        Queue<Character> q2 = new LinkedList<>();
        for(char x : a.toCharArray()){
            q1.offer(x);
        }
        for(char x : b.toCharArray()){
            q2.offer(x);
        }
        while(!q2.isEmpty()){
            char tmp = q2.poll();
            if(q1.contains(tmp)){
               if(q1.poll()!=tmp) {
                   return "NO";
               }
            }
        }
        if(!q1.isEmpty())
            ans="NO";

        return ans;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        System.out.println(solution(a,b));


    }
}
