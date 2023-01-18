

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        int lastValue = 0;

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("push")){
                int tmp = Integer.parseInt(st.nextToken());
                lastValue = tmp;
                queue.offer(tmp);
            }
            else if(command.equals("pop")){
                int num = queue.isEmpty() ? -1 : queue.poll();
                sb.append(num).append("\n");
            }
            else if(command.equals("size")){
                sb.append(queue.size()).append("\n");
            }
            else if(command.equals("empty")){
                int num = queue.isEmpty() ? 1 : 0;
                sb.append(num).append("\n");
            }
            else if(command.equals("front")){
                int num = queue.isEmpty() ? -1 : queue.peek();
                sb.append(num).append("\n");
            }
            else if(command.equals("back")){
                int num = queue.isEmpty() ? -1 : lastValue;
                sb.append(num).append("\n");
            }
        }

        System.out.print(sb);

    }
}