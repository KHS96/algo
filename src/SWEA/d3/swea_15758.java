package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class swea_15758 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            String s2 = st.nextToken();
            String ans = "yes";
            int len1 = s1.length();
            int len2 = s2.length();

            for(int i=0;i<len1;i++){
                s2 += s1.charAt(i);
            }
            for(int i=0;i<len2;i++){
                s1 += s2.charAt(i);
            }
            len1 = s1.length()-1;
            while(len1>0){
                if(s1.charAt(len1) != s2.charAt(len1))
                    ans = "no";
                len1--;
            }

            System.out.println("#" + tc + " " + ans);
        }
    }

}
