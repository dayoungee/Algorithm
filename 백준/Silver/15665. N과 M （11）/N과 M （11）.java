
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static Set<String> set = new LinkedHashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        permutation(arr, new int[m], 0, m);
        for(String s : set){
            System.out.print(s);
        }
    }

    private static void permutation(int[] arr, int[] out, int depth, int r) {
        if(depth == r){
            StringBuilder sb = new StringBuilder();
            for(int n : out) sb.append(n).append(" ");
            sb.append("\n");
            set.add(sb.toString());
            return;
        }
        for(int i = 0; i < arr.length; i++){
            out[depth] = arr[i];
            permutation(arr, out, depth+1, r);
        }
    }

}
