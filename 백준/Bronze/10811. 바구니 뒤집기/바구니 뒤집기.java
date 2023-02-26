import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];

        for (int a = 1; a <= N; a++) {
            arr[a] = a;
        }

        while(M --> 0){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            while(i < j){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++; j--;
            }
        }
        for(int i = 1; i <= N; i++){
            System.out.print(arr[i] + " ");
        }

    }
}