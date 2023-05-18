package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_9940 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            String ans = "Yes";
            int n = Integer.parseInt(br.readLine());
            int []arr = new int[n+1];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=1;i<=n;i++){
                int tmp = Integer.parseInt(st.nextToken());
                if(arr[tmp] == 0){
                    arr[tmp]++;
                }else{
                    ans = "No";
                    break;
                }
            }

            System.out.println("#" + tc + " " + ans);
        }
    }


}
