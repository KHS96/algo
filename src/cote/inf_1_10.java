package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_1_10 {
    static int []answer;

    static void solution(String s,String t){
        int p = 1000;
        answer[0] = p;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==t.charAt(0)){
                answer[i] = 0;
                p=0;
            }else{
                answer[i] = ++p;
            }
        }
        p=1000;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==t.charAt(0)){
                answer[i] = 0;
                p=0;
            }else{
                p++;
                if(answer[i] > p)
                    answer[i] = p;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());

        String s = tk.nextToken();
        answer = new int[s.length()];
        String t = tk.nextToken();
        solution(s,t);
        for(int x: answer)
            System.out.print(x+" ");

    }
}
