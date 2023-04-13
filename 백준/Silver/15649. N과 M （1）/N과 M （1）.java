
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static int answer = 0;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        permutation(new int[m], new boolean[n], 0, m);
        System.out.println(sb);
    }

    public static void permutation(int[] out, boolean[] visted, int depth, int r){
        if(depth == r){
            for(int n : out) sb.append(n).append(" ");
            sb.append("\n");
            return;
        }
        for(int i = 0; i < visted.length; i++){
            if(!visted[i]){
                visted[i] = true;
                out[depth] = i+1;
                permutation(out,visted, depth+1, r);
                visted[i] = false;
            }
        }

    }

}
