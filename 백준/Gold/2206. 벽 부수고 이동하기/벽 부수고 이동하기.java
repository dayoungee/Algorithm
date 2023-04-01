import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point{
    int x;
    int y;
    int cnt;
    int broken;
    public Point(int x, int y, int cnt, int broken) {
        this.x = x;
        this.y = y;
        this.cnt = cnt;
        this.broken = broken;
    }
}
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        int[][] map = new int[n][m];
        int[][] visited = new int[n][m];
        for(int i = 0; i < n; i++){
            String str = br.readLine();
            for(int j = 0; j < m; j++){
                map[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
                visited[i][j] = Integer.MAX_VALUE;
            }
        }
        if(n-1 == 0 && m-1 == 0){
            System.out.println(1);
            return;
        }
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(0, 0, 1, 0));
        visited[0][0] = 0; // 벽을 부순 횟수
        while(!q.isEmpty()){
            Point temp = q.poll();
            if(n-1 == temp.y && m-1 == temp.x){
                System.out.println(temp.cnt);
                return;
            }
            for(int i = 0; i < dx.length; i++){
                int nX = temp.x + dx[i];
                int nY = temp.y + dy[i];
                if(nX < 0 || nY < 0|| nX >= m || nY >= n || visited[nY][nX] <= temp.broken) continue;
                if(map[nY][nX] == 1) {
                    // 벽을 부순 적이 없다면
                    if(temp.broken == 0){
                        visited[nY][nX] = temp.broken + 1; // 벽을 부수며 방문
                        q.add(new Point(nX, nY, temp.cnt + 1, temp.broken+1));
                    }
                }else {
                    visited[nY][nX] = temp.broken;
                    q.add(new Point(nX, nY, temp.cnt + 1, temp.broken));
                }
            }
        }
        System.out.println(-1);
    }

}