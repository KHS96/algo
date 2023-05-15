package SWEA.d2;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swea_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int tc=1;tc<=t;tc++){
            int n = Integer.parseInt(br.readLine());
            int []arr = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);

            System.out.print("#"+tc+" ");
            for(int x : arr)
                System.out.print(x+" ");
            System.out.println();

        }

    }
}
