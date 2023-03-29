
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    static int[] distance = new int[100001];
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        BFS(n, m);
        System.out.print(distance[m]);

    }

    private static void BFS(int n, int m) {
        Queue<Integer> q = new LinkedList<>();
        distance[n] = 0;
        q.add(n);
        if(n == m) return;
        while(!q.isEmpty()){
            int temp = q.poll();
            for(int i = 0; i < 3; i++){
                int next;
                if(i == 0)      next = temp + 1;
                else if(i == 1) next = temp - 1;
                else            next = temp * 2;
                if(next < 0 || next >= distance.length || distance[next] != 0) continue;
                q.add(next);
                distance[next] = distance[temp] + 1;
                if(next == m) return;
            }
        }
    }

}
