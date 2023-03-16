package boj;

import java.util.*;
import java.io.*;
public class boj_1717 {
    static int [] arr;
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(tk.nextToken());
        int m = Integer.parseInt(tk.nextToken());
         arr = new int[n+1];
        for(int i = 1;i<=n;i++){
            arr[i] = i;
        }

        for(int i=0;i<m;i++) {
            tk = new StringTokenizer(bf.readLine());
            int c = Integer.parseInt(tk.nextToken());
            int a = Integer.parseInt(tk.nextToken());
            int b = Integer.parseInt(tk.nextToken());

            if (c == 0) {
                arr[find(b)] = arr[find(a)];
            } else if (c == 1) {
                if (find(a) == find(b))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }

    public static int find(int num){
        if(arr[num] == num)
            return num;
        return arr[num]=find(arr[num]);
    }

}
