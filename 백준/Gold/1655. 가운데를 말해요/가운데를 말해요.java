import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if(maxPq.size() == minPq.size()) maxPq.add(num);
            else minPq.add(num);

            if(!minPq.isEmpty() && !maxPq.isEmpty())
                if(minPq.peek() < maxPq.peek()){
                    int tmp = maxPq.poll();
                    maxPq.add(minPq.poll());
                    minPq.add(tmp);
                }

            sb.append(maxPq.peek()).append("\n");
        }
        System.out.println(sb);
    }
}