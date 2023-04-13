
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
        combination(new int[m], n, 1,0, m);
        System.out.println(sb);
    }

    private static void combination(int[] out, int num, int start, int depth, int r) {
        if(depth == r){
            for(int n : out) sb.append(n).append(" ");
            sb.append("\n");
            return;
        }
        for(int i = start; i <= num; i++){
            out[depth] = i;
            combination(out, num, i, depth+1, r);
        }
    }


}
