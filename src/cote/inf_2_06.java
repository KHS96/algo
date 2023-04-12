package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class inf_2_06 {

    public static boolean isPrime(int num){
        if(num==1)
            return false;
        for(int i=2;i<num;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }

    static ArrayList<Integer> solution(int[] num) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<num.length;i++){
            int tmp = num[i];
            int res = 0;
            while(tmp!=0){
                int t=tmp%10;
                res= res*10 + t;
                tmp = tmp/10;
            }
            if(isPrime(res)){
                list.add(res);
            }
        }
        return list;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int []num = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        for(int x : solution(num)){
            System.out.print(x+" ");
        }

    }
}
