package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_1_07 {
    static String solution(String str){
        String answer = "NO" ;
//        str = str.toUpperCase();
        String temp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(temp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        System.out.println(solution(s));
    }
}
