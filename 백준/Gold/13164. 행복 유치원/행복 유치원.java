
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
        int[] arr = new int[n];
        int[] arr2 = new int[n-1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < arr.length; i++) arr2[i-1] = arr[i] - arr[i-1];
        
        int answer = 0;
        Arrays.sort(arr2);
        for(int i = 0; i < n-m; i++) answer += arr2[i];

        System.out.println(answer);
    }
}
