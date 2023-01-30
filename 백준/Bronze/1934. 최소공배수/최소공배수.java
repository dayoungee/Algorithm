
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            st = new StringTokenizer(br.readLine());
            // 유클리트 호제법을 사용할 것
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            sb.append(lcm(n, m)).append("\n");
        }

        System.out.println(sb);
    }

    static int gcd(int n, int m) {
        if(n < m){
            int temp = n;
            n = m;
            m = temp;
        }

        while(m != 0){
            int r = n % m;
            n = m;
            m = r;
        }
        return n;
    }

    static int lcm(int n, int m) {
        return n * m / gcd(n , m);
    }

}