import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static boolean[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        check = new boolean[m+1];
        
        getPrime(m);
        int min = Integer.MAX_VALUE, sum = 0;
        for(int i = n; i <= m; i++){
            if(check[i] == false){
                min = Math.min(i, min);
                sum += i;
            }
        }
        if(sum == 0 && min == Integer.MAX_VALUE) System.out.print(-1);
        else System.out.print(sum + "\n" + min);

    }
    public static void getPrime(int m){
        check[0] = true;
        check[1] = true;
        for(int i = 2; i <= Math.sqrt(m); i++){
            if(!check[i]){
                for(int j = i*i; j <= m; j = j+i){
                    check[j] = true;
                }
            }
        }
    }

}