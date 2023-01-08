import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());

        // 시간, 분, 요리시간
        solution(s, m , c);

    }

    public static void solution(int h, int m, int c){
        int sum = m + c;
        if(sum >= 60){
            h += sum / 60;
            m = sum % 60;
            if(h >= 24){
                h = h - 24;
            }
        }
        else m = sum;
        System.out.println(h + " " + m);
    }
}
