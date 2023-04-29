
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[26];
        for (char c : str.toCharArray()) {
            arr[c-97]++;
        }
        Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
    }
}
