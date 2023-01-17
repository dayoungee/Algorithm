
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;
            sb.append(solution(n)).append("\n");
        }
        System.out.print(sb);
    }

    public static int solution(int n){
        int answer = 0;
        for(int i = n + 1; i <= n*2; i++){
            boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) answer++;
        }

        return answer;
    }
    
}
