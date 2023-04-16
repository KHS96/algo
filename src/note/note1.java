package note;

import java.util.*;

public class note1 {
    public static void main(String[] args) {
        String[] kor = {"AAA", "BCD", "AAAAA", "ZY"};
        String[] usa = {"AB", "AA", "TTTT"};
        String[] incs = {"AB BCD AA TTTT AAAAA", "BCD AAA", "AB AAA TTTT BCD", "AA AAAAA AB", "AAA AB BCD"};

        System.out.println(solution(kor, usa, incs));
        List<String> korList = new ArrayList<>(Arrays.asList(kor));
        List<String> usaList = new ArrayList<>(Arrays.asList(usa));

        int cnt = 0 ;

        for(int i=0;i< incs.length;i++){
            String[] temp = incs[i].split(" ");

            boolean chk1 = false;
            boolean chk2 = false;
            for(String x : temp){
                if (korList.contains(x)){
                    chk1=true;
                }
                if(usaList.contains(x)){
                    chk2=true;
                }
            }
            if(chk1 && chk2)
                cnt++;
        }
        System.out.println(cnt);

    }

    public static int solution(String[] kor, String[] usa, String[] incs) {
        List<String> korList = new ArrayList<>(Arrays.asList(kor));
        List<String> usaList = new ArrayList<>(Arrays.asList(usa));

        int max = -1;
        for (int i = 0; i < incs.length; i++) {
            String[] temp = incs[i].split(" ");
            List<String> incsList = new ArrayList<>(Arrays.asList(incs));
        }
        return max;
    }
}
