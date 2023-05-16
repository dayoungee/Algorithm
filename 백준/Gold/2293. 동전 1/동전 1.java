import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());  // 동전의 종류 수
        int k = Integer.parseInt(st.nextToken());  // 목표 금액

        int[] coins = new int[n];  // 동전의 가치를 저장할 배열
        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[k + 1];  // 다이나믹 프로그래밍을 위한 배열
        dp[0] = 1;  // 0원을 만들 수 있는 경우의 수는 1

        for (int i = 0; i < n; i++) {
            for (int j = coins[i]; j <= k; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }

        System.out.println(dp[k]);  // 목표 금액을 만
    }
}