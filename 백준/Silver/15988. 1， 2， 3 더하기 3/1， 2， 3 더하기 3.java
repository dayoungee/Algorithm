import java.io.*;
import java.util.*;

public class Main {
    static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[1_000_001];

        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        for(int i = 4; i < arr.length; i++)
            arr[i] = (arr[i - 1] + arr[i - 2] + arr[i - 3]) % 1_000_000_009;

        StringBuilder sb = new StringBuilder();

        while(n-- > 0) {
            sb.append(arr[Integer.parseInt(br.readLine())]).append("\n");
        }
        System.out.println(sb);
    }
}
