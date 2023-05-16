package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class swea_16800 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int tc=1;tc<=t;tc++){
            long n = Long.parseLong(br.readLine());
            long ans = 0 ;
            long x = 0;
            long y = 0;
            for(long i=1;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    x = i;
                    y = (n/i);
                }
            }
            ans = x-1 + y-1;



            System.out.println("#" + tc + " " +ans);
        }
    }

}
