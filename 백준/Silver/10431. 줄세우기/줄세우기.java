import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i<=n; i++){
            int[] arr = new int[20];
            int cnt = 0;
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            for(int j = 0; j < 20; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }

            for(int k = 1; k < 20; k++){
                int temp = arr[k], f;
                for(f = k-1; f >= 0; f--){
                    if(arr[f] > temp){
                        arr[f+1] = arr[f];
                        cnt++;
                    } else break;
                }
                arr[f+1] = temp;
            }

            System.out.println(i + " "+ cnt);

        }
    }
}
