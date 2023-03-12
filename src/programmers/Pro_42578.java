package programmers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Pro_42578 {
    public static int solution(String[][] clothes) {
        HashMap<String,Integer> map = new HashMap<>();
        int answer = 1;

        for(int i=0;i<clothes.length;i++){
            String type =clothes[i][1];     //옷의 종류를 type에 담는다.
            map.put(type,map.getOrDefault(type,1)+1);   //만약 해당 type의 옷이 존재한다면 개수를 늘려주고 없다면 1을 넣어준다.
        }


        /*
        * Map.Entry 방식
        * 보통key와 value둘다 필요할 때 쓴다.
        * */
/*        Iterator<Map.Entry<String,Integer>> itr = map.entrySet().iterator();

        while(itr.hasNext()){
            Map.Entry<String,Integer> ent = itr.next();
            answer *= ent.getValue();
        }
        */

        /*
        * 일반적인 방식 keySet을 받아오고 map에서 key값에 해당하는 값을 가져와서 계산
        * */

        for(String key : map.keySet()){
            answer *= map.get(key);
        }

        return answer-1;


    }

    public static void main(String[] args) {
        String [][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(clothes));
    }
}
