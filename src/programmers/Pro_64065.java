package programmers;

import java.util.HashMap;

public class Pro_64065 {
    public static int[] solution(String s) {
        HashMap<String, Integer> map = new HashMap<>();

        String []t = s.split(",|\\{|\\}");

        for(String temp : t){
            if(!temp.equals(""))
                map.put(temp, map.getOrDefault(temp,0)+1);
        }
        int[] answer = new int[map.size()];
        for(String key : map.keySet()){
            System.out.println(key + " " + map.get(key));
            answer[map.size() - map.get(key)] = Integer.parseInt(key);
        }

        return answer;
    }

    public static void main(String[] args) {
        int [] ans = solution("{{4,2,3},{3},{2,3,4,1},{2,3}}");
        StringBuilder sb = new StringBuilder("[");

        for(int a : ans){
            sb.append(a);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");

        System.out.println(sb);
    }
}
