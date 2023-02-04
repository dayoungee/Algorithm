import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static char[][] board;
    static int max = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        board = new char[n][n];

        for(int i = 0; i < n; i++){
            String str = br.readLine();
            for(int j = 0; j < n; j++){
                board[i][j] = str.charAt(j);
            }
        }
        solution();
        System.out.print(max);
    }

    public static void solution(){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length-1; j++){
                swap(i,j,i,j+1);
                checkMax();
                swap(i,j+1,i,j);

                swap(j,i,j+1,i);
                checkMax();
                swap(j+1,i,j,i);
            }
        }
    }

    public static void swap(int x, int y, int tranX, int tranY){
        char temp = board[x][y];
        board[x][y] = board[tranX][tranY];
        board[tranX][tranY] = temp;
    }

    public static void checkMax(){
        for(int i = 0; i < board.length; i++){
            int countX = 1;
            int countY = 1;
            for(int j = 0; j < board.length - 1; j++){
                if(board[i][j] == board[i][j+1]) countX++;
                else   countX = 1;
                if(board[j][i] == board[j+1][i]) countY++;
                else   countY = 1;

                max = Math.max(countX, max);
                max = Math.max(countY, max);
            }
        }
    }
}
