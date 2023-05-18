package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_10804 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            String ans="";
            String temp = br.readLine();
            char []ch = temp.toCharArray();

            for(int i=ch.length-1;i>=0;i--){
                if(ch[i] == 'q')
                    ans+='p';
                else if(ch[i] == 'p'){
                    ans+='q';
                }else if(ch[i] == 'd'){
                    ans+='b';
                }else{
                    ans+='d';
                }
            }
            System.out.println("#" + tc + " " + ans);

        }

    }

}
