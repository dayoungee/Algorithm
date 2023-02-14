import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int chanel = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[10];
        if(n > 0) {
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(st.nextToken());
                arr[num] = true;
            }
        }

        int result = Math.abs(chanel - 100); //초기값 설정

        for(int i = 0; i <= 999999; i++) {
            String str = String.valueOf(i);
            int len = str.length();

            boolean isBreak = false;
            for(int j = 0; j < len; j++) {
                // String -> int
                if(arr[str.charAt(j) - '0']) { //고장난 버튼을 눌러야 하면
                    isBreak = true;
                    break; //더 이상 탐색하지 않고 빠져나온다.
                }
            }
            if(!isBreak) { //i를 누를때 고장난 버튼을 누르지 않는다면
                int min = Math.abs(chanel - i) + len; //i를 누른 후(len) target까지 이동하는 횟수(target - i)
                result = Math.min(min, result);
            }
        }
        System.out.println(result);


    }

}
