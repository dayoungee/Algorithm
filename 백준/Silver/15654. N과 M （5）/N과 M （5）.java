
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        permutation(arr, new int[m], new boolean[n], 0, m);
        System.out.println(sb);
    }

    public static void permutation(int[] arr, int[] out, boolean[] visited, int depth, int r){
        if(depth == r){
            for(int n : out) sb.append(n).append(" ");
            sb.append("\n");
            return;
        }
       for(int i = 0; i < arr.length; i++){
           if(!visited[i]){
               visited[i] = true;
               out[depth] = arr[i];
               permutation(arr, out, visited, depth+1, r);
               visited[i] = false;
           }
       }
    }
}
