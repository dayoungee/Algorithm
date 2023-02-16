import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean[] arr = new boolean[10001];
        for (int i = 1; i < 10001; i++){
            int n = solution(i);
            if(n < 10001){
                arr[n] = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            if (!arr[i]) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int solution(int num) {
        int sum = num;

        while(num != 0){
            sum += (num % 10); 
            num = num/10;	
        }

        return sum;
    }

}
