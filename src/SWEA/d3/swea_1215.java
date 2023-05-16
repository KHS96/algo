package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_1215 {
    static char[][] map = new char[8][8];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = 10;
        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            int ans = 0;
            for(int i=0;i<8;i++){
                String temp = br.readLine();
                for(int j=0;j<8;j++){
                    map[i][j] = temp.charAt(j);
                }
            }

            for(int i=0;i<8;i++){
                for(int j=0;j<=8-n;j++){
                    String temp = "";
                    for(int k=j;k<j+n;k++){
                        temp+=map[i][k];
                    }
                    if(Check(temp))
                        ans++;
                }
            }
            for(int j=0;j<8;j++){
                for(int i=0;i<=8-n;i++){
                    String temp = "";
                    for(int k=i;k<i+n;k++){
                        temp+=map[k][j];
                    }
                    if(Check(temp))
                        ans++;
                }
            }


            System.out.println("#" + tc + " " + ans);
        }
    }
    static  boolean Check(String s){
        int len = s.length();
        System.out.println(s);

        for(int i=0;i<len/2;i++){
            if(s.charAt(i) != s.charAt(len-i-1))
                return false;
        }

        return true;
    }

}
