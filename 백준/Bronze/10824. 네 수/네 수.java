
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] arr = new String[4];
        for(int i = 0; i < arr.length; i++){
            arr[i] = st.nextToken();
        }
        
        System.out.println(Long.parseLong(arr[0]+arr[1])+Long.parseLong(arr[2]+arr[3]));
    }
}
