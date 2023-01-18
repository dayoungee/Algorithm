
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 1~99 는 한수
        int answer = 99;
        if(n < 100){
            System.out.print(n);
            return;
        }
        else{
            int temp = 110;
            while(n >= temp)
            {
                int h = temp/100;
                int t = (temp%100)/10;
                int u = (temp%10)/1;
                if(u - t == t - h) answer++;
                temp++;
            }
        }
        System.out.print(answer);

    }

}
