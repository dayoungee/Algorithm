import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int answer;
    static ArrayList<Integer> answerArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        Main T = new Main();

        for(int i = 0; i < testCase; i++){
            answer = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken()); // 행
            int w = Integer.parseInt(st.nextToken()); // 열
            int n = Integer.parseInt(st.nextToken()); // 배추

            visited = new boolean[h][w];
            map = new int[h][w];

            for(int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                int v = Integer.parseInt(st.nextToken());
                int e = Integer.parseInt(st.nextToken());
                map[v][e] = 1;
            }

            for(int j = 0; j < h; j++){
                for(int k = 0; k < w; k++){
                    if(map[j][k] == 1 && !visited[j][k]){
                        T.DFS(j, k);
                        answer++;
                    }
                }
            }

            System.out.println(answer);
        }
    }

    public void DFS(int x, int y){
        visited[x][y] = true;
        for(int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= map.length || nx < 0 || ny >= map[nx].length || ny < 0 || visited[nx][ny]) continue;
            if (map[nx][ny] == 1) {
                DFS(nx, ny);
            }
        }
    }

}
