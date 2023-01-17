
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            String answer = solution(num, str);
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }

    public static String solution(int n, String str){
        String answer = "";
        String[] arr = str.split("");
        for(String s : arr){
            for(int i = 0; i < n; i++){
                answer += s;
            }
        }
        return answer;
    }
}
