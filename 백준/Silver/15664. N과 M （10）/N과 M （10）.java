
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
        combination(arr, new int[m], new boolean[n],0,0, m);
        for(String s : set){
            System.out.print(s);
        }
    }

    private static void combination(int[] arr, int[] out, boolean[] visited, int start, int depth, int r) {
        if(depth == r){
            StringBuilder sb = new StringBuilder();
            for(int n : out) sb.append(n).append(" ");
            sb.append("\n");
            set.add(sb.toString());
            return;
        }
        for(int i = start; i < arr.length; i++){
            if(!visited[i]){
                visited[i] = true;
                out[depth] = arr[i];
                combination(arr, out, visited, i, depth+1, r);
                visited[i] = false;
            }
        }
    }


}
