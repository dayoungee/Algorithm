
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Integer[] arr = new Integer[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr, Collections.reverseOrder());

        int answer = 0;
        for(int num : arr){
            if(m / num < 0) continue;
            answer += (m/num);
            m %= num;
            if(m == 0) break;
        }
        System.out.println(answer);
    }
}
