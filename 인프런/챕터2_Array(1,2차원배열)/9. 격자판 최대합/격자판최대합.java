import java.util.Scanner;

public class 격자판최대합 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num = in.nextInt();
        int [][] temp = new int[num][num];
        for(int i = 0; i < num; i++) {
            for(int j = 0; j<num; j++){
                temp[i][j] = in.nextInt();
            }
        }
        격자판최대합 t = new 격자판최대합();
        System.out.println(t.solution(temp, num));
    }
    public int solution(int[][] arr, int size){
        int result = 0;
        // 대각선은 두개
        int cross1 = 0, cross2 = 0;
        int i, j;

        for(i = 0; i <size; i++){
            int row = 0, col = 0;

            for(j = 0; j <size; j++){
                row += arr[i][j];
                col += arr[j][i];
            }
            cross1 += arr[i][i];
            cross2 += arr[i][(size-1)-i];

            result = Math.max(result, col);
            result = Math.max(result, row);
        }
        result = Math.max(result, cross1);
        result = Math.max(result, cross2);

        return result;
    }
}
