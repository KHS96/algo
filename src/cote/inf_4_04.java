package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class inf_4_04 {
    static int solution(String a, String b) {
        int ans=0;

        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        for(char x : b.toCharArray()){
            bm.put(x,bm.getOrDefault(x,0)+1);
        }
        int L = b.length();
        for(int i=0;i<L-1;i++){
            am.put(a.charAt(i),am.getOrDefault(a.charAt(i),0)+1);
        }
        int lt=0;
        for(int rt=L-1;rt<a.length();rt++){
            am.put(a.charAt(rt),am.getOrDefault(a.charAt(rt),0)+1);
            if(am.equals(bm)){
                ans++;
            }
            am.put(a.charAt(lt),am.get(a.charAt(lt))-1);
            if(am.get(a.charAt(lt))==0)
                am.remove(a.charAt(lt));
            lt++;
        }

        return ans;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String s2 = br.readLine();

        System.out.println(solution(s1,s2));

    }
}
