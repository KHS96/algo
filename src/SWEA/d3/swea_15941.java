package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_15941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int tc=1;tc<=t;tc++){
            int n = Integer.parseInt(br.readLine());
            System.out.println("#" + tc + " " +n*n);
        }
    }

}
