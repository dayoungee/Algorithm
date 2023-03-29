
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
    static int[][] map;
    static Point arrivePoint;
    static boolean[] visited;
    static int[] dX = { -1, -2, -2, -1, 1, 2, 2, 1 };
    static int[] dY = { -2, -1, 1, 2, 2, 1, -1, -2 };
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        while(T --> 0){
            int n = Integer.parseInt(br.readLine());
            map = new int[n][n];
            st = new StringTokenizer(br.readLine());
            Point myPoint = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

            st = new StringTokenizer(br.readLine());
            arrivePoint = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

            BFS(myPoint);
            System.out.println(map[arrivePoint.x][arrivePoint.y]);
        }
    }

    private static void BFS(Point myPoint) {
        Queue<Point> q = new LinkedList<>();
        q.add(myPoint);
        if(myPoint.x == arrivePoint.x && myPoint.y == arrivePoint.y) return;
        while(!q.isEmpty()){
            Point tempP = q.poll();
            for(int i = 0; i < dX.length; i++){
                int nextX = tempP.x + dX[i];
                int nextY = tempP.y + dY[i];
                if(nextX < 0 || nextY < 0 || nextY >= map.length || nextX >= map[nextY].length || map[nextX][nextY] != 0) continue;
                q.add(new Point(nextX, nextY));
                map[nextX][nextY] = map[tempP.x][tempP.y] + 1;
                if(nextX == arrivePoint.x && nextY == arrivePoint.y) return;
            }
        }
    }


}
