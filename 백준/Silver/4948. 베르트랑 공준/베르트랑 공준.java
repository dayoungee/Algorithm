

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static boolean check[] = new boolean[246913];
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        checkPrime();
        
        while(true){
            int n = Integer.parseInt(br.readLine());
            
            if(n == 0) break;
            
            int answer = 0;
            for(int i = n + 1; i <= n * 2; i++){
                if(!check[i]) answer++;
            }
            sb.append(answer).append("\n");
        }
        
        System.out.print(sb);
    }

    private static void checkPrime() {
        for(int i = 2; i <= Math.sqrt(check.length); i++){
            if(check[i] == false){
                for(int j = i*i; j <= check.length; j= j+i){
                    check[j] = true;
                }
            }
        }
    }
}
