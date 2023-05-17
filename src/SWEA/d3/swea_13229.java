package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_13229 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String []day = {"MON","TUE","WED","THU","FRI","SAT","SUN"};

        for (int tc = 1; tc <= t; tc++) {
            String s = br.readLine();
            int ans = 0;

            for(int i=0;i<7;i++){
                if(s.equals(day[i])){
                    if(i==6)
                        ans=7;
                    else
                        ans=6-i;
                }
            }

            System.out.println("#" + tc + " " + ans);
        }

    }

}
