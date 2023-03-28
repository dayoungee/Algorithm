import javax.xml.parsers.DocumentBuilderFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static ArrayList<ArrayList<Integer>> list;
    static boolean[] visited;
    static int cnt = 0;
    static int[] answer;
    public static void main(String[] args) throws IOException {
        list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 정점
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        for(int i = 0; i <= v; i++) list.add(new ArrayList<>());
        visited = new boolean[v+1];
        answer = new int[v+1];

        for(int i = 0; i < e; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }

        for(int i = 0; i <= v; i++)list.get(i).sort(null);

        DFS(start);

        StringBuilder sb= new StringBuilder();
        for(int i = 1; i <= v; i++) sb.append(answer[i]).append("\n");
        System.out.println(sb);
    }

    private static void DFS(int start) {
        visited[start] = true;
        answer[start] = ++cnt;
        Iterator<Integer> iter = list.get(start).iterator();
        while(iter.hasNext()){
            int n = iter.next();
            if(!visited[n]){
                DFS(n);
            }
        }
    }


}
