package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_1289 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int tc=1;tc<=t;tc++){
            String temp = br.readLine();
            char before = '0';
            int ans = 0 ;

            for(int i=0;i<temp.length();i++){
                if(before!=temp.charAt(i)){
                    ans++;
                    before = temp.charAt(i);
                }
            }



            System.out.println("#" + tc + " " + ans);
        }
    }

}
