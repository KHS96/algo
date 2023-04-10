package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_1_12 {
    static int[] answer;

    static String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        s = s.replaceAll("#","1");
        s = s.replaceAll("\\*","0");


        int idx = 0;
        for(int i = 0;i<n;i++){
            String temp = s.substring(idx,idx+7);
            int c = Integer.parseInt(temp,2);
            sb.append((char)c);
            idx+=7;
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
//        StringTokenizer tk = new StringTokenizer(br.readLine());
        System.out.println(solution(s,n));

    }
}
