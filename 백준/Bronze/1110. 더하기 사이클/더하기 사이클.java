
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        solution(n);
    }

    static public void solution(int n){
        int answer = 0;
        int original = n;
        do{
            // 가독성 때문에 나눔, ten: 십의자리 연산 unit 일의자리 연산
            int ten = (n % 10 ) * 10;
            int unit = ((n % 10) + (n/10)) % 10;
            n = ten + unit;
            answer++;

        }while(n != original);

        System.out.println(answer);
    }
}
