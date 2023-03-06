package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_10804 {
    static int []num = new int[21];
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for(int i=1;i<=20;i++){
            num[i] = i;
        }
        for(int i=0;i<10;i++){
            StringTokenizer tk = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(tk.nextToken());
            int b = Integer.parseInt(tk.nextToken());
            swap(num,a,b);
        }
        for(int i=1;i<=20;i++){
            System.out.print(num[i]+ " ");
        }

    }
    private static void swap(int []num,int a,int b){
        while(a<b){
            int temp = num[a];
            num[a] = num[b];
            num[b] = temp;
            a++;
            b--;
        }
    }
}
