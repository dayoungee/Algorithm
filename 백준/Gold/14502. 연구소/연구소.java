
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static int[][] map;
    static int answer = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        map = new int[n][m];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0);

        System.out.println(answer);

    }

    private static void dfs(int wallCnt) {
        if(wallCnt == 3){
            bfs();
            return;
        }
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){
                if(map[i][j] == 0){
                    map[i][j] = 1;
                    dfs(wallCnt+1);
                    map[i][j] = 0;
                }
            }
        }
    }

    private static void bfs() {
        Queue<Point> q = new LinkedList<>();
        int[] disX = {-1, 1, 0, 0};
        int[] disY = {0 ,0 ,-1, 1};
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                if(map[i][j] == 2) q.add(new Point(i, j));
            }
        }

        int copyMap[][] = new int[map.length][map[0].length];

        for (int i = 0; i < map.length; i++) {
            copyMap[i] = map[i].clone();
        }

        while(!q.isEmpty()){
            Point p = q.poll();
            int x = p.x;
            int y = p.y;
            for(int i = 0; i < disX.length; i++){
                int nX = x + disX[i];
                int nY = y + disY[i];

                if(0 > nX || 0 > nY || map.length <= nX || map[0].length <= nY) continue;

                if(copyMap[nX][nY] == 0){
                    q.add(new Point(nX, nY));
                    copyMap[nX][nY] = 2;
                }
            }
        }

        checkSafeZone(copyMap);
    }

    private static void checkSafeZone(int[][] copyMap) {
        int safeZone = 0;
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){
                if(copyMap[i][j] == 0) safeZone++;
            }
        }
        answer = Math.max(answer, safeZone);
    }

}

class Point{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
