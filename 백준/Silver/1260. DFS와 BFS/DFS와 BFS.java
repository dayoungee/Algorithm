import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Graph{
    int v;
    ArrayList<ArrayList<Integer>> adj;

    Graph(int v){
        this.v =v;
        adj = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i <= v; i++){
            adj.add(new ArrayList<Integer>());
        }
    }

    void addEdge(int v, int w){  adj.get(v).add(w); }

    // 최솟값부터 들리기 때문에 정렬함
    void sortNode(){
        for(int i = 1; i <= this.v; i++){
            Collections.sort(adj.get(i));
        }
    }

    void DFS(int v){
        boolean [] visited = new boolean[this.v + 1];

        DFSUtil(v, visited);
    }

    void DFSUtil(int v, boolean[] visited){
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> it = adj.get(v).listIterator();
        while(it.hasNext()){
            int n = it.next();
            if(!visited[n]){
                DFSUtil(n, visited);
            }
        }
    }

    void BFS(int s){
        boolean [] visited = new boolean[this.v+1];
        Queue<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.offer(s);

        while(!queue.isEmpty()){
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> it = adj.get(s).listIterator();
            while(it.hasNext()){
                int n = it.next();

                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}

public class Main {

    Graph graph;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 노드
        int v = Integer.parseInt(st.nextToken());
        // 간선
        int w = Integer.parseInt(st.nextToken());
        // 출발점
        int s = Integer.parseInt(st.nextToken());

        Main T = new Main();
        T.graph = new Graph(v);

        for(int i = 0; i < w; i++){
            st = new StringTokenizer(br.readLine());
            int adv = Integer.parseInt(st.nextToken());
            int adw = Integer.parseInt(st.nextToken());
            // 양방향
            T.graph.addEdge(adv, adw);
            T.graph.addEdge(adw, adv);
         }

        T.graph.sortNode();
        T.graph.DFS(s);
        System.out.println();
        T.graph.BFS(s);
    }

}
