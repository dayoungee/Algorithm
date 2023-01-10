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

class Main {
    static int[] unf;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int v = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        //System.out.println(Kruskal(v, n));
        System.out.println(Prim(v, n));
    }
    public static int Find(int v){
        if(unf[v] == v) return unf[v];
        else            return unf[v] = Find(unf[v]);
    }
    public static void Union(int a, int b){
        int fa = Find(a);
        int fb = Find(b);
        if(a != b) unf[fa] = fb;
    }
    // 크루스칼 알고리즘
    public static int Kruskal(int v, int n) throws IOException{
        StringTokenizer st;
        ArrayList<Edge> list = new ArrayList<>();
        unf = new int[v+1];
        for(int j = 1; j <= v; j++) unf[j]=j;
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            // a정점
            int a = Integer.parseInt(st.nextToken());
            // b정점
            int b = Integer.parseInt(st.nextToken());
            // 가중치
            int c = Integer.parseInt(st.nextToken());
            list.add(new Edge(a, b, c));
        }
        int answer = 0;
        Collections.sort(list);
        for(Edge e : list){
            int fa = Find(e.vex1);
            int fb = Find(e.vex2);
            if(fa != fb){
                answer += e.cost;
                Union(e.vex1, e.vex2);
            }
        }
        return answer;
    }

    // 프림 알고리즘
    public static int Prim(int v, int n) throws IOException{
        int answer = 0;
        int[] ch = new int[v+1];
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        PriorityQueue<Edge> pQ = new PriorityQueue<>();

        StringTokenizer st;
        for(int i=0; i<=v; i++){
            graph.add(new ArrayList<Edge>());
        }
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            // a정점
            int a = Integer.parseInt(st.nextToken());
            // b정점
            int b = Integer.parseInt(st.nextToken());
            // 가중치
            int c = Integer.parseInt(st.nextToken());
            graph.get(a).add(new Edge(b, c));
            graph.get(b).add(new Edge(a, c));
        }
        pQ.offer(new Edge(1,0));
        while(!pQ.isEmpty()){
            Edge tmp = pQ.poll();
            int ev = tmp.vex1;
            if(ch[ev] == 0){
                ch[ev] = 1;
                answer += tmp.cost;
                for(Edge ob : graph.get(ev)){
                    if(ch[ob.vex1]==0) pQ.offer(new Edge(ob.vex1, ob.cost));
                }
            }
        }

        return answer;
    }
}