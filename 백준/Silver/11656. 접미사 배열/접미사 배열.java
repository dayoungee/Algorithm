
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<String> pq = new PriorityQueue<>();
        String str = br.readLine();
        
        for(int i = 0; i <str.length(); i++){
            pq.add(str.substring(i));
        }

        StringBuilder sb = new StringBuilder();
        int length = pq.size();
        for(int i = 0; i < length; i++){
            sb.append(pq.poll()).append("\n");
        }
        System.out.println(sb);
    }
}
