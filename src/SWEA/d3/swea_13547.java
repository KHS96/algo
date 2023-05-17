package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_13547 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            String s = br.readLine();
            String ans ="YES";
            int cnt = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='x')
                    cnt++;
            }
            if(15-cnt>=8)
                ans="YES";
            else
                ans="NO";

            System.out.println("#" + tc + " " + ans);
        }

    }

}
