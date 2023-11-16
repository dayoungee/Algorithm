import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

class Graph{
    int v;
    ArrayList<ArrayList<Integer>> adj;

    Graph(int v){
        this.v = v;
        adj = new ArrayList<>();
        for(int i = 0; i < v + 1; i++){
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int v, int w){    adj.get(v).add(w);    }
}

public class Main {
    static Graph graph;
    static int answer = 0;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 노드(컴터)
        int v = Integer.parseInt(br.readLine());
        // 간선(같은넼)
        int e = Integer.parseInt(br.readLine());

        graph = new Graph(v);
        visited = new boolean[v+1];

        StringTokenizer st;
        for(int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int sv = Integer.parseInt(st.nextToken());
            int se = Integer.parseInt(st.nextToken());
            // 연결돼있는지 확인해야하기 때문에 양방향일듯?
            graph.addEdge(sv,se);
            graph.addEdge(se,sv);
        }

        Main T = new Main();
        T.DFS(1);
        System.out.print(answer);
    }

    public void DFS(int node){
        visited[node] = true;
        Iterator<Integer> it = graph.adj.get(node).listIterator();
        while(it.hasNext()){
            int n = it.next();
            if(!visited[n]){
                visited[n] = true;
                DFS(n);
                answer ++;
            }
        }

    }

}
