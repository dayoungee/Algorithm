
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
        // do while 문을 할 수도 있지만 최초의 한번 일의자리 예외처리를 위해 빼줌
        int ten = (n  % 10) * 10;
        int cal = (n < 10) ? (n * 10) : n;
        int unit = ((cal % 10) + (cal/10)) % 10;
        cal = ten + unit;
        answer++;

        while(n != cal){
            // 가독성 때문에 나눔, ten: 십의자리 연산 unit 일의자리 연산
            ten = (cal % 10 ) * 10;
            unit = ((cal % 10) + (cal/10)) % 10;
            cal = ten + unit;
            answer++;

        }
        System.out.println(answer);
    }

}
