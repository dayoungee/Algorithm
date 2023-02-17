import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(n % i == 0) arr.add(i);
        }
        Collections.sort(arr);
        if(arr.size() < m) System.out.print("0");
        else                 System.out.print(arr.get(m-1));
    }

}
