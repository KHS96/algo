package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_11688 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            String s = br.readLine();
            int a = 1;
            int b = 1;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='L'){
                    b = a+b;
                }else{
                    a = a+b;
                }
            }
            int r = gcd(a,b);
            a /= r;
            b /= r;
            System.out.println("#" + tc + " " + a + " " + b);
        }

    }

    static int gcd(int a, int b){
        while(b!=0){
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }

}
