package note;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class note1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n+1];
        int [][]d = new int[n+1][2];

        for(int i=1;i<=n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        if(n==1){
            System.out.println(arr[1]);
            return ;
        }

        d[1][0] = arr[1];
        d[1][1] = 0;
        d[2][0] = arr[2];
        d[2][1] = arr[1]+arr[2];

        for(int i=3;i<=n;i++){
            d[i][0] = Math.max(d[i-2][1],d[i-2][0])+arr[i];
            d[i][1] = d[i-1][0]+arr[i];
        }
        System.out.println(Math.max(d[n][0],d[n][1]));
    }

}
