package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_1_01 {
    static int solution(String str, char t){
        int answer=0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==t)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char c = br.readLine().charAt(0);
        System.out.println(solution(str,c));
    }
}
