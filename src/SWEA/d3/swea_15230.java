package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_15230 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            String temp = br.readLine();
            int len = temp.length();
            int ans = 0;

            for(int i=0;i<len;i++){
                if(temp.charAt(i) == 'a'+i){
                    ans++;
                }else{
                    break;
                }
            }



            System.out.println("#" + tc + " " + ans);
        }
    }

}
