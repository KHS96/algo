package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Pro_178871 {
    public static String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        for (int i = 0; i < callings.length; i++) {
            int temp = map.get(callings[i]);

            String t = players[temp]; // kai
            players[temp] = players[temp-1];
            players[temp-1] = t;

            map.put(t, map.get(t) - 1);
            map.put(players[temp],map.get(players[temp])+1);
        }

        return players;
    }

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        String[] ans = solution(players, callings);

        for (String s : ans)
            System.out.println(s);
    }
}
