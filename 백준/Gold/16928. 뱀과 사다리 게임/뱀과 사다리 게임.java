
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Point {
    int x;
    int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    static int[] map = new int[101];
    static Map<Integer, Integer> snake = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        while(n --> 0){
            st = new StringTokenizer(br.readLine());
            snake.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        BFS(1);

        System.out.print(map[100]);
    }

    private static void BFS(int x) {
        map[1] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(x);

        while(!q.isEmpty()){
            int temp = q.poll();
            for(int i = 1; i <=6; i++){
                int next = temp; next += i;
                if(snake.containsKey(next)) next = snake.get(next);
                if(next > 100 || map[next] != 0) continue;
                q.add(next);
                map[next] = map[temp] + 1;
                if(next == 100) return;
            }
        }
    }


}
