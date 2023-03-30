package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_1_07 {
    static String solution(String str){
        String answer = new String();
        str = str.toUpperCase();
        int lt = 0;
        int rt = str.length()-1;
        char []ch = str.toCharArray();

        while(lt<rt){
            char temp = ch[lt];
            ch[lt] = ch[rt];
            ch[rt] = temp;
            lt++;
            rt--;
        }
        if(str.equals(String.valueOf(ch).toString()))
            return "YES";
        else{
            return "NO";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        System.out.println(solution(s));
    }
}
