package SWEA.D2;

import java.io.IOException;

public class swea_2027 {
    public static void main(String[] args) throws IOException {
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==j)
                    System.out.print("#");
                else
                    System.out.print("+");
            }
            System.out.println();
        }
    }
}
