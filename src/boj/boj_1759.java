package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_1759 {
    static int L;
    static char []alp;
    static boolean []visit;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        alp = new char[C];
        visit = new boolean[C];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<C;i++){
            alp[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(alp);
        comb(0,0);
        System.out.println(sb);
    }
    static void comb(int start, int depth){

        if(depth == L){
            if(check()){
                for(int i=0;i< alp.length;i++){
                    if(visit[i]){
                        sb.append(alp[i]);
                    }
                }
                sb.append("\n");
            }
        }

        for(int i=start;i< alp.length;i++){
            visit[i]=true;
            comb(i+1,depth+1);
            visit[i] = false;
        }

    }
    static boolean check(){
        int consonant=0;
        int vowel=0;
        for(int i=0;i<alp.length;i++){
            if(visit[i]){
                char temp = alp[i];
                if(temp == 'i' || temp == 'e' || temp == 'o' || temp=='a' || temp=='u')
                    vowel++;
                else
                    consonant++;
            }
        }

        return vowel>=1 && consonant>=2;
    }
}
