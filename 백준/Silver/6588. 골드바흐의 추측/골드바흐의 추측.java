
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    static boolean[] check = new boolean[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        checkPrime();
        int a;
        while( (a = Integer.parseInt(br.readLine())) != 0){
            int left = 3, right = a - 3;

            String str = "Goldbach's conjecture is wrong.\n";

            while(left <= right){
                if(!check[left] && !check[right]){
                    str = a + " = " + left + " + " + right + " \n";
                    break;
                }
                // 홀수기 때문에
                left += 2;
                right -= 2;
            }
            sb.append(str);
        }

        System.out.println(sb);
    }

    private static void checkPrime() {
        // true : 소수가 아님
        check[0] = check[1] = true;

        for(int i = 2 ; i <= Math.sqrt(check.length); i++){
            if(check[i]) continue;
            for(int j = i * i; j < check.length; j += i){
                check[j] = true;
            }
        }
    }

}