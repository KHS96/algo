package SWEA.d2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_1989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= n; tc++) {
            String temp = br.readLine();
            boolean chk = true;
            char[] ch = temp.toCharArray();
            int len = ch.length;
            for (int i = 0; i < len / 2; i++) {
                if (ch[len - 1 - i] != ch[i]) {
                    chk = false;
                }
            }
            if(chk){
                System.out.println("#" + tc + " " + 1);
            }else{
                System.out.println("#" + tc + " " + 0);
            }


        }

    }
}
