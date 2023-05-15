package SWEA.d2;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=1;i<=n;i++){
            int cnt = 0;
            if(i%10 == 3 || i%10 == 6 ||i%10 == 9){
                cnt++;
            }
            if((i/10)%10 == 3 || (i/10)%10 == 6 || (i/10)%10 == 9)
                cnt++;
            if(i/100 == 3 || i/100 == 6 || i/100 == 9)
                cnt++;

            if(cnt == 0){
                System.out.print(i);
            }else{
                for(int j=0;j<cnt;j++){
                    System.out.print("-");
                }
            }
            System.out.print(" ");
        }

    }
}
