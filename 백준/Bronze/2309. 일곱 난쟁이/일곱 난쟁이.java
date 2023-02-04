import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int arr[] = new int[9];
        int sum = 0;

        for(int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        for(int i = 0; i < 9; i++){
            for(int j = i + 1; j < 9; j++){
                if(100 == sum - arr[i] - arr[j]){
                    arr[i] = 0;
                    arr[j] = 0;
                    Arrays.sort(arr);
                    for(int k = 0; k < 9; k ++){
                        if(arr[k] != 0) sb.append(arr[k]).append("\n");
                    }
                    System.out.print(sb);
                    return;
                }
            }
        }


    }
}
