package SWEA.d2;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1859 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int tc = 1; tc <= t; tc++) {

            int n = Integer.parseInt(br.readLine());
            int []arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int max = arr[n-1];
            long ans = 0;
            for(int i=n-2;i>=0;i--){
                if(max > arr[i])
                    ans+=max-arr[i];
                else max = arr[i];
            }
            System.out.println("#"+tc+ " " +ans);



        }
    }
}
