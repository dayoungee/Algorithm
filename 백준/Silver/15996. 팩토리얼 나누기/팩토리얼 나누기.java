import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 팩토리얼
        int a = Integer.parseInt(st.nextToken()); // 찾아야 될 제곱수

        int m = n/a; // a의 배수 개수
        int cnt = m; // cnt는 a의 배수의 개수를 담는다.
        // cnt에 a 배수의 개수를 담고
        // A^2의 배수의 개수
        // A^3의 배수의 개수
        // 위반복문을 반복해 A의 총 누적곱을 담는다.
        while(m>=a){
            m /= a; //반복문을 시행할수록 a^(시행횟수+1)의 배수의 개수
            cnt += m;
        }
        System.out.print(cnt);

    }

}
