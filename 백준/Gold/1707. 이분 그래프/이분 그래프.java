import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static ArrayList<ArrayList<Integer>> list;
    static int[] visited;
    static boolean result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken()); // 정점
            int e = Integer.parseInt(st.nextToken()); // 간선 수
            list = new ArrayList<>();
            result = true;
            for(int i = 0; i <= v; i++) list.add(new ArrayList<>());
            visited = new int[v+1];
            for(int i = 0; i < e; i++){
                st = new StringTokenizer(br.readLine());
                int from = Integer.parseInt(st.nextToken()); // 시작
                int to = Integer.parseInt(st.nextToken()); // 끝
                list.get(from).add(to);
                list.get(to).add(from);
            }

            for(int i = 1; i < v; i++){
                if(visited[i] == 0) DFS(i, 1);
            }

            if(result) System.out.println("YES");
            else       System.out.println("NO");

        }
    }

    private static void DFS(int i, int color) {
        visited[i] = color;

        if(!result) return;

        Iterator<Integer> it = list.get(i).listIterator();
        while(it.hasNext()){
            int n = it.next();
            if(visited[n] == visited[i]){
               result = false;
               return;
            }
            if(visited[n] == 0) DFS(n, color * -1);
            
        }
    }

}