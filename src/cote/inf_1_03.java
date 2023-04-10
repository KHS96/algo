package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_1_03 {
    static String solution(String str){
        String answer="";
        String []temp = str.split(" ");
        int m=Integer.MIN_VALUE;
        for(String x : temp){
            int len = x.length();
            if(len>m){
                m=len;
                answer=x;
            }

        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }
}
