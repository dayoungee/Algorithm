
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int price = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        int sumPrice = 0;
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int subPrice = Integer.parseInt(st.nextToken());
            int cnt = Integer.parseInt(st.nextToken());
            sumPrice += (subPrice * cnt);
        }
        if(sumPrice == price) System.out.print("Yes");
        else                  System.out.print("No");
    }
}
