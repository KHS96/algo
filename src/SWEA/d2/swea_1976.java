package SWEA.d2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1976 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int tc = 1; tc <= t; tc++) {
            st = new StringTokenizer(br.readLine());
            int sh = Integer.parseInt(st.nextToken());
            int sm = Integer.parseInt(st.nextToken());
            int eh = Integer.parseInt(st.nextToken());
            int em = Integer.parseInt(st.nextToken());
            int rh=0,rm=sm+em;

            if(sm+em >= 60){
                rh++;
                rm -=60;
            }
            rh +=sh+eh;
            if(rh>12)
                rh%=12;
            System.out.println("#" + tc+" "+ rh+" "+rm);



        }
    }

}
