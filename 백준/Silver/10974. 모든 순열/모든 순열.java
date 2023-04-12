
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        permutation(new int[n], new boolean[n], 0, n);
        System.out.println(sb);
    }

    public static void permutation(int[] out, boolean[] visited, int depth, int r){
        if(depth == r){
            for(int n : out) sb.append(n).append(" ");
            sb.append("\n");
            return;
        }
        for(int i = 1; i <= r; i++){
            if(!visited[i-1]){
                visited[i-1] = true;
                out[depth] = i;
                permutation(out, visited, depth+1, r);
                visited[i-1] = false;
            }
        }
    }

}
