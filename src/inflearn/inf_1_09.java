package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_1_09 {
    static int solution(String str){
        int answer = 0;
        str = str.replaceAll("[^0-9]","");
        answer=Integer.parseInt(str);
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        System.out.println(solution(s));
    }
}
