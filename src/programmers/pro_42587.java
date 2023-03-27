package programmers;

import java.util.*;

public class pro_42587 {
    public static int solution(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        Map<String, Integer> map1 = new HashMap<>(); //str1
        Map<String, Integer> map2 = new HashMap<>(); //str2
        Set<String> set = new HashSet<>(); // 합집합용
        int ans = 0, total = 0;

        for(int i =0;i<str1.length()-1;i++){
            String temp = str1.substring(i,i+2);
            if(Character.isAlphabetic(temp.charAt(0)) && Character.isAlphabetic(temp.charAt(1))){
                map1.put(temp,map1.getOrDefault(temp,0)+1);
                set.add(temp);
            }
        }

        for(int i =0;i<str2.length()-1;i++){
            String temp = str2.substring(i,i+2);
            if(Character.isAlphabetic(temp.charAt(0)) && Character.isAlphabetic(temp.charAt(1))){
                map2.put(temp,map2.getOrDefault(temp,0)+1);
                set.add(temp);
            }
        }

        for(String s : set){
            total += Math.max(map1.getOrDefault(s,0),map2.getOrDefault(s,0));
        }

        for(String s : map2.keySet()){
            if(map1.containsKey(s))
                ans+=Math.min(map1.get(s), map2.get(s));
        }

        if(total == 0 ) return 65536;
        return ans * 65536 / total;

    }
    public static void main(String[] args) {
        String s1 = "FRANCE";
        String s2 = "french";
        System.out.println(solution(s1,s2));
    }


}
