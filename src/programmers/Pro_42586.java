package programmers;

import java.util.*;
public class Pro_42586 {
    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<progresses.length;i++){
            int d = (int) Math.ceil((100-progresses[i])/(double)speeds[i]);
            q.offer(d);
//            System.out.println(q.poll());
        }

        int n=1;
        int temp = q.poll();
        while(!q.isEmpty()){
//            System.out.println(temp);
            if(temp >= q.peek()){
                n++;
                q.poll();
                if(q.isEmpty())
                    list.add(n);
            }else{
                list.add(n);
                n=0;
                temp = q.peek();
            }
        }
        int [] answer = new int[list.size()];

        int idx = 0;
        for(int x : list)
            answer[idx++] = x;

        return answer;
    }

    public static void main(String[] args) {
        int []p = {93,30,55};
        int []s = {1,30,5};
        int [] res = solution(p,s);
        for(int x : res)
            System.out.println(x);
    }

}
