
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static int answer = 1;
    static StringBuilder sb = new StringBuilder();
    static int[][] map;
    static int disY[] = {-1,0,1,0};  // 북동남서
    static int disX[] = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        // 0: 북쪽 1: 동쪽  2: 남쪽 3: 서쪽
        int dis = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(x, y, dis);
        System.out.println(answer);
    }

    public static void dfs(int r, int c, int dis){

        map[r][c] = -1; // 청소함
        for(int i = 0; i < disX.length; i++){
            dis = (dis + 3) % 4; // 반시계방향 90도 회전

            int ny = r + disY[dis];
            int nx = c + disX[dis];
            if(ny >=0 && ny < map.length && nx >= 0 && nx < map[r].length && map[ny][nx] == 0){
                answer++;
                // 청소했다면 그 자리에서 다시 검사함
                dfs(ny,nx, dis);
                return;
            }
        }

        int back = (dis + 2) % 4;
        int by = r + disY[back];
        int bx = c + disX[back];

        if(by>=0 && by<map.length && bx>=0 && bx<map[r].length && map[by][bx] != 1) {
            dfs(by,bx,dis);
        }
    }

}
