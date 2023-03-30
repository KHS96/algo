package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_1_06 {
    static String solution(String str){
        String answer = new String();
        int []alpha = new int [26];

        for(int i=0;i<str.length();i++){
            char temp = str.charAt(i);
            if(alpha[temp-'a'] == 0){
                alpha[temp-'a']++;
                answer+=temp;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        System.out.println(solution(s));
    }
}
