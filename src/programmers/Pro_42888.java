package programmers;

import java.util.ArrayList;
import java.util.HashMap;

public class Pro_42888 {
        public static String[] solution(String[] record) {
        ArrayList<String> answer = new ArrayList<>();
        HashMap<String,String> idName = new HashMap<>();
        for(int i=0;i<record.length;i++){
            String [] temp = record[i].split(" ");
            if(temp.length==3)
                idName.put(temp[1],temp[2]);
        }
        for(int i=0;i<record.length;i++){
            String [] temp = record[i].split(" ");
            String nickname = idName.get(temp[1]);
            if(temp[0].equals("Enter")){
                answer.add(nickname+"님이 들어왔습니다.");
            }else if(temp[0].equals("Leave")){
                answer.add(nickname+"님이 나갔습니다.");
            }
        }
        for(String x : answer.toArray(new String[0])){
            System.out.println(x);
        }

        return answer.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String []record = {"Enter 1234 Muzi","Enter 4567 Prodo","Leave 1234","Enter 1234 Prodo","Change 4567 Ryan"};
        solution(record);
    }
}
