package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class inf_6_01 {
    static int[] solution(int n, int[] arr) {

        for(int i=0;i<n-1;i++){
            int idx = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[idx]){
                    idx = j;
                }
            }
            int tmp = arr[idx]; //찾은 최소값
            arr[idx] = arr[i];
            arr[i] = tmp;

        }

        return arr;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int x : solution(n,arr)){
            System.out.print(x+" ");
        }


    }
}
