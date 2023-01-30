
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 유클리트 호제법을 사용할 것
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        System.out.println(gcd(n, m));
        System.out.println(lcm(n, m));

    }
    // 유클리드 호제법을 사용한 최대 공약수
    static int gcd(int n, int m){
        if(n<m) // 유클리드 호제법 조건 n > m 이어야 함
        {
            int temp = n;
            n = m;
            m = temp;
        }
        /**
         * 유클리드 호제법:
         * 두 수가 서로 상대방 수를 나누어서 결국 원하는 수를 얻는 알고리즘
         * 24, 18 일때
         * 24와 18을 나눈 다 => 나머지 6
         * 18과 6을 나눈다 => 나누어 떨어진다. 몫은 3으로 최대 공약수의 값이 이다.
         * */
        while(m!=0) {
            int r = n % m;
            n = m;
            m = r;
        }
        return n;
    }
    /**
     * 최소 공배수 = 두수의 곱 / 최대공약수
     * */
    static int lcm(int n, int m){
        return n * m / gcd(n,m);
    }
}