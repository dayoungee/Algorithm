import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int [n];
        int answer = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                if(arr[i] > arr[j]) dp[i] = Math.max(dp[j] + 1, dp[i]);
            }
            answer = Math.max(dp[i], answer);
        }
        System.out.println(answer);
    }
}
