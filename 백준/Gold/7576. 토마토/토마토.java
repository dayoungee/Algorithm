import java.io.*;
import java.util.*;


class Point{
    int x;
    int y;
    Point(int x, int y) {   this.x = x; this.y = y;     }
}

public class Main {
    static int[][] board;
    static int[] disX = {-1, 0, 1, 0}, disY = {0, 1, 0, -1};
    static int answer = 0, n, m;
    static Queue<Point> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[m][n];

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
                if(board[i][j] == 1) q.offer(new Point(i,j));
            }
        }

        BFS(0, 0);

        if(isCollect()) System.out.println(answer);
        else                    System.out.println(-1);
    }

    // 모두 익은 토마토인가? 체크
    public static boolean isCollect(){
        for(int i = 0; i < board.length; i++){
            for(int x : board[i]){
                if(x == 0) return false;
            }
        }
        return true;
    }
    public static void BFS(int x, int y){
        // 토마토가 영향을 받고 익었는지 유무 플래그
        boolean flag = false;

        while(!q.isEmpty()){
            int len = q.size();
            for(int j = 0; j <len; j++){
                Point p = q.poll();
                for(int i = 0; i < 4; i++){
                    int X = p.x + disX[i];
                    int Y = p.y + disY[i];
                    if(X >= m || Y >= n || X < 0 || Y < 0) continue;
                    if(board[X][Y] != 0) continue;
                    board[X][Y] = 1;
                    flag = true;
                    q.offer(new Point(X, Y));
                }
            }
            if(flag){
                answer++;
                flag = false;
            }
        }
    }


}

