
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [][] arr = new int[n][5];
        for(int i = 0; i < n; i++){
            for(int j = 0; j <5; j++){
                arr[i][j] = in.nextInt();
            }
        }
        Main T = new Main();
        System.out.println(T.solution(n, arr));
    }

    private int solution(int n, int[][] arr) {
        int result = 0;

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                for(int k =0; k<5; k++)
                {
                    if(arr[i][k] == arr[j][k]){
                        count++;
                        break;
                    }
                }
            }
            if(count > max){
                max = count;
                result = i+1;
            }
        }
        return result;
    }
}