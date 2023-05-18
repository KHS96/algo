package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class swea_10965 {
    static int MAX = 10000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        List<Integer> primeArr = new ArrayList<>();

        boolean[] prime = new boolean[MAX+1];
        prime[0] = prime[1] = true;
        for (int i = 2; i * i <= MAX; i++) {
            if (!prime[i]) {
                primeArr.add(i * i);
                for (int j = i * i; j <= MAX; j += i) {
                    prime[j] = true;
                }
            }
        }


        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            int ans = 0;

            for (int i = 0; i < primeArr.size(); i++) {
                int div = primeArr.get(i);

                if (n < div) {
                    break;
                }
                while (true) {
                    if (n % div == 0) {
                        n /= div;
                    }else{
                        break;
                    }
                }
            }


            System.out.println("#" + tc + " " + n);
        }

    }


}
