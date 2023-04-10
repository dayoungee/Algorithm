
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        int sum = 0;
        int answer = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            answer += sum;
        }
        System.out.println(answer);
    }
}
