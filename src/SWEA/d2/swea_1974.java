package SWEA.d2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1974 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= n; tc++) {
            int[][] arr = new int[9][9];
            int chk = 1;

            //가로체크
            for (int i = 0; i < 9; i++) {
                int[] num = new int[10];
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 9; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                    if (num[arr[i][j]] != 0) {
                        chk = 0;
                        break;
                    }
                    num[arr[i][j]]++;
                }
            }

            //세로체크
            for (int j = 0; j < 9; j++) {
                int[] num = new int[10];
                for (int i = 0; i < 9; i++) {
                    if (num[arr[i][j]] != 0) {
                        chk = 0;
                        break;
                    }
                    num[arr[i][j]]++;
                }
            }


            //박스체크
            for (int i = 0; i < 9; i += 3) {
                for (int j = 0; j < 9; j += 3) {
                    int[] num = new int[10];

                    for (int k = i; k < i + 3; k++) {
                        for (int s = j; s < j + 3; s++) {
                            if (num[arr[k][s]] != 0) {
                                chk = 0;
                                break;
                            }
                            num[arr[k][s]]++;
                        }
                    }
                }
            }

            System.out.println("#" + tc + " " + chk);


        }

    }


}
