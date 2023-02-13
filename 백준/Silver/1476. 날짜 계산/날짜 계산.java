import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[3];

        int answer = 0;
        while(arr[0] != e || arr[1] != s || arr[2] != m){
            arr[0]++; arr[1]++; arr[2]++;
            answer++;
            if(arr[0] > 15) arr[0] = 1;
            if(arr[1] > 28) arr[1] = 1;
            if(arr[2] > 19) arr[2] = 1;
        }
        System.out.print(answer);
    }
}
