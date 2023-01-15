import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Edge implements Comparable<Edge>{
    int vex1;
    int vex2;
    int cost;
    // 크루스칼 알고리즘에 사용할 생성자
    Edge(int vex1, int vex2, int cost){
        this.vex1 = vex1;
        this.vex2 = vex2;
        this.cost = cost;
    }
    // 프림 알고리즘에 사용할 생성자
    Edge(int vex, int cost){
        this.vex1 = vex;
        this.cost = cost;
    }
    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}

class Kruskal{
    ArrayList<Edge> list;
    int[] unf;
    int minimumCost;
    Kruskal(int v){
        unf = new int[v+1];
        list = new ArrayList<>();
        minimumCost = 0;
        for(int i = 1; i <= v; i++) unf[i] = i;
    }
    public int Find(int v){
        if(unf[v] == v) return unf[v];
        else            return unf[v] = Find(unf[v]);
    }
    public void Union(int a, int b){
        int fa = Find(a);
        int fb = Find(b);
        if(a != b) unf[fa] = fb;
    }

    public void spanningTree(){
        for(Edge e : list){
            int fa = Find(e.vex1);
            int fb = Find(e.vex2);
            if(fa != fb){
                minimumCost += e.cost;
                Union(e.vex1, e.vex2);
            }
        }
    }

}

class Prim{
    int minimumCost;
    int[] ch;
    ArrayList<ArrayList<Edge>> graph;
    PriorityQueue<Edge> pQ;
    Prim(int v){
        minimumCost = 0;
        ch = new int[v+1];
        graph = new ArrayList<>();
        pQ = new PriorityQueue<>();
        for(int i=0; i<=v; i++){
            graph.add(new ArrayList<Edge>());
        }
    }

    public void spanningTree() {
        pQ.offer(new Edge(1,0));
        while(!pQ.isEmpty()){
            Edge tmp = pQ.poll();
            int ev = tmp.vex1;
            if(ch[ev] == 0){
                ch[ev] = 1;
                minimumCost += tmp.cost;
                for(Edge ob : graph.get(ev)){
                    if(ch[ob.vex1]==0) pQ.offer(new Edge(ob.vex1, ob.cost));
                }
            }
        }
    }

}
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int v = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        Kruskal kruskal = new Kruskal(v);
        Prim prim = new Prim(v);

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            // a정점
            int a = Integer.parseInt(st.nextToken());
            // b정점
            int b = Integer.parseInt(st.nextToken());
            // 가중치
            int c = Integer.parseInt(st.nextToken());
            kruskal.list.add(new Edge(a, b, c));
            prim.graph.get(a).add(new Edge(b, c));
            prim.graph.get(b).add(new Edge(a, c));
        }
        Collections.sort(kruskal.list);

        kruskal.spanningTree();
        prim.spanningTree();

        System.out.println(kruskal.minimumCost);
        //System.out.println(prim.minimumCost);
    }

}