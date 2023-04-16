package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_9663 {
    static int n;
    static int []arr;
    static int count;
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(tk.nextToken());
        arr = new int[n];
        func(0);
        System.out.println(count);
    }

    static void func(int depth){
        if(depth==n){
            count++;
            return;
        }

        for(int i=0;i<n;i++){
            arr[depth]=i;

            if(Check(depth)){
                func(depth+1);
            }
        }

    }

    static boolean Check(int col){
        for(int i=0;i<col;i++){
            if(arr[col] == arr[i]) {
                return false;
            }else if(Math.abs(col-i) == Math.abs(arr[col]-arr[i])){
                return false;
            }
        }
        return true;
    }
}
