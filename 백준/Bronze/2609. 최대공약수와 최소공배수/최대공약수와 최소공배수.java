import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.println(GCD(n,m));
        System.out.println(LCM(n,m));

    }

    public static int GCD(int n, int m) {
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

    public static int LCM(int n, int m){
        return n * m / GCD(n,m);
    }


}