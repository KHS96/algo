package programmers;

import java.sql.SQLOutput;
import java.util.*;

public class Pro_67256 {

        public static String solution(int[] numbers, String hand) {
            StringBuilder answer = new StringBuilder();
            int cLx = 3;    //현재 왼손 x좌표
            int cLy = 0;    //현재 왼손 y좌표
            int cRx = 3;    //현재 오른손 x좌표
            int cRy = 2;    //현재 오른손 y좌표

            //각 키패드별 x,y좌표
            int[] xpos = {3, 0, 0, 0, 1, 1, 1, 2, 2, 2};
            int[] ypos = {1, 0, 1, 2, 0, 1, 2, 0, 1, 2};

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                    answer.append("L");
                    cLx = xpos[numbers[i]];
                    cLy = ypos[numbers[i]];
                } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                    answer.append("R");
                    cRx = xpos[numbers[i]];
                    cRy = ypos[numbers[i]];
                } else {
                    if (Math.abs(xpos[numbers[i]] - cRx) + Math.abs(ypos[numbers[i]] - cRy) <
                            Math.abs(xpos[numbers[i]] - cLx) + Math.abs(ypos[numbers[i]] - cLy)) {
                        answer.append("R");
                        cRx = xpos[numbers[i]];
                        cRy = ypos[numbers[i]];
                    } else if (
                            Math.abs(xpos[numbers[i]] - cRx) + Math.abs(ypos[numbers[i]] - cRy) >
                                    Math.abs(xpos[numbers[i]] - cLx) + Math.abs(ypos[numbers[i]] - cLy)) {
                        answer.append("L");
                        cLx = xpos[numbers[i]];
                        cLy = ypos[numbers[i]];
                    } else {
                        if (hand.equals("right")) {
                            answer.append("R");
                            cRx = xpos[numbers[i]];
                            cRy = ypos[numbers[i]];
                        } else {
                            answer.append("L");
                            cLx = xpos[numbers[i]];
                            cLy = ypos[numbers[i]];
                        }
                    }
                }
            }
            return answer.toString();
        }

    public static void main(String[] args) {
        int []num = {1,3,4,5,8,2,1,4,5,9,5};
        String hand = "right";
        System.out.println(solution(num,hand));
    }
}
