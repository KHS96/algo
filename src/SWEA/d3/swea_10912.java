package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_10912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            StringBuilder sb = new StringBuilder("");
            int []alp = new int[26];
            String temp = br.readLine();
            for(int i=0;i<temp.length();i++){
                int ch = temp.charAt(i)-'a';
                alp[ch]++;
            }
            for(int i=0;i<26;i++){
                if(alp[i]%2==1){
                    sb.append((char)('a'+i));
                }
            }
            if(sb.length()==0)
                sb.append("Good");

            System.out.println("#" + tc + " " + sb);
        }

    }

}
