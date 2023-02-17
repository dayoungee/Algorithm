import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 1;
        int min = 2;
        if(n == 1){
            System.out.println(cnt);
            return;
        }
        while(min <= n){
            min += 6 * cnt;
            cnt++;
        }
        System.out.println(cnt);
    }

}
