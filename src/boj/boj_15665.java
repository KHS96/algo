package boj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class boj_15665 {
    static int n;
    static int m;
    static int []arr = new int[10];
    static int []num;
    static Integer[] rarr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(tk.nextToken());
        m = Integer.parseInt(tk.nextToken());
//        Integer num[] = new Integer[n];
        num = new int[n];

        tk = new StringTokenizer(bf.readLine());
        for(int i=0;i<n;i++){
            num[i] = Integer.parseInt(tk.nextToken());
        }
//        HashSet<Integer> set = new HashSet<>(Arrays.asList(num));
//        rarr = set.toArray(new Integer[0]);
        Arrays.sort(num);

        func(0,0);
        System.out.println(sb);

    }

    static void func(int s,int depth){
        if(depth==m){       //k가 m(뽑아야 하는 수의 개수)
            for(int i=0;i<m;i++){   //다뽑았으면 출력
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        int before = 0;
        for(int i=s;i<n;i++){
            if(before != num[i]){
                arr[depth] = num[i];
                before = num[i];
                func(i,depth+1);
            }

        }
    }
}
