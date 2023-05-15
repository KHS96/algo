package SWEA.d2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_1945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= n; tc++) {
            int[] arr = new int[5];
            int temp = Integer.parseInt(br.readLine());

            while (temp > 1) {
                if (temp % 11 == 0) {
                    temp /= 11;
                    arr[4]++;
                } else if (temp % 7 == 0) {
                    temp /= 7;
                    arr[3]++;
                } else if (temp % 5 == 0) {
                    temp /= 5;
                    arr[2]++;
                }else if (temp % 3 == 0){
                    temp /= 3;
                    arr[1]++;
                }else if (temp % 2 == 0){
                    temp /= 2;
                    arr[0]++;
                }
            }
            System.out.print("#"+tc+" ");
            for(int x : arr){
                System.out.print(x+" ");
            }
            System.out.println();

        }

    }
}
