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
    static int answer = 0;
    static ArrayList<Integer> answerArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        int v = Integer.parseInt(br.readLine());

        visited = new boolean[v][v];
        map = new int[v][v];
        answerArr = new ArrayList<>();

        StringTokenizer st;

        for(int i = 0; i < v; i++) {
            st = new StringTokenizer(br.readLine());
            String[] strTemp = st.nextToken().split("");
            for(int j = 0; j < v; j++){
                map[i][j] = Integer.parseInt(strTemp[j]);
            }
        }

        Main T = new Main();

        for(int i = 0; i < v; i++){
            for(int j = 0; j < v; j++){
                if(map[i][j] == 1 && !visited[i][j]){
                    answer = 1;
                    T.DFS(i, j);
                    answerArr.add(answer);
                }
            }
        }
        
        Collections.sort(answerArr);
        StringBuilder sb = new StringBuilder();

        sb.append(answerArr.size()).append("\n");
        for(int temp : answerArr){
            sb.append(temp).append("\n");
        }

        System.out.print(sb);

    }

    public void DFS(int x, int y){
        visited[x][y] = true;
        for(int i = 0; i < dx.length; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= map.length || nx < 0 || ny >= map[nx].length || ny < 0 || visited[nx][ny]) continue;
            if(map[nx][ny] == 1){
                answer++;
                DFS(nx, ny);
            }
        }

    }

}
