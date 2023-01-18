
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("push_front")){
                int tmp = Integer.parseInt(st.nextToken());
                deque.addFirst(tmp);
            }
            else if(command.equals("push_back")){
                int tmp = Integer.parseInt(st.nextToken());
                deque.addLast(tmp);
            }
            else if(command.equals("pop_front")){
                int num = deque.isEmpty() ? -1 : deque.pollFirst();
                sb.append(num).append("\n");
            }
            else if(command.equals("pop_back")){
                int num = deque.isEmpty() ? -1 : deque.pollLast();
                sb.append(num).append("\n");
            }
            else if(command.equals("size")){
                sb.append(deque.size()).append("\n");
            }
            else if(command.equals("empty")){
                int num = deque.isEmpty() ? 1 : 0;
                sb.append(num).append("\n");
            }
            else if(command.equals("front")){
                int num = deque.isEmpty() ? -1 : deque.peekFirst();
                sb.append(num).append("\n");
            }
            else if(command.equals("back")){
                int num = deque.isEmpty() ? -1 : deque.peekLast();
                sb.append(num).append("\n");
            }
        }

        System.out.print(sb);

    }
}