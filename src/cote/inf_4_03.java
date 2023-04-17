package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class inf_4_03 {
    static ArrayList<Integer> solution(int n,int k,int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<k-1;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int lt = 0;

        for(int rt=k-1;rt<n;rt++){
            map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
            list.add(map.size());
            if(map.get(arr[lt])==1){
                map.remove(arr[lt]);
            }else{
                map.put(arr[lt],map.get(arr[lt])-1);
            }

            lt++;
        }

        return list;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int x : solution(n,k,arr)){
            System.out.print(x+" ");
        }

    }
}
