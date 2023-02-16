import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i = 0; i < n; i++) queue.add(i+1);
        int cnt = 0;
        sb.append("<");
        while(!queue.isEmpty()){
            cnt++;
            int num = queue.poll();
            if(cnt == m){
                sb.append(num);
                if(!queue.isEmpty()) sb.append(", ");
                cnt = 0;
            }
            else queue.add(num);
        }
        sb.append(">");
        System.out.print(sb);
    }
}
