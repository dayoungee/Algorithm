import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        while(n --> 0){
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            float[] arr = new float[m];
            float sum = 0;
            for(int i = 0; i < m; i++){
                arr[i] = Integer.parseInt(st.nextToken());
                sum += arr[i];
            }
            sb.append(solution(arr, sum)).append("%\n");
        }
        System.out.print(sb);
    }
    public static String solution(float[] arr, float sum){
        float answer = 0.0f;
        float cnt = 0;
        float avg = (sum/(arr.length*100)) * 100;
        for(int i = 0; i < arr.length; i++){
            if(avg < arr[i]) cnt++;
        }
        answer = cnt/arr.length * 100;
        return String.format("%.3f", answer);
    }

}
