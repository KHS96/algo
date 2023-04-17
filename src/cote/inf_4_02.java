package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class inf_4_02 {
    static String solution(String a, String b) {
        String ans = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : a.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(char x : b.toCharArray()){
            map.put(x,map.getOrDefault(x,0)-1);
        }

        for(char c : map.keySet()){
            if(map.get(c) != 0)
                ans = "NO";
        }

        return ans;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        System.out.println(solution(a,b));

    }
}
