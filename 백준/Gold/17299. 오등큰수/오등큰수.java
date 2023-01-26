
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
        }

        for(int i = 0; i < n; i++){
            while( !stack.isEmpty() && map.get(arr[stack.peek()]) < map.get(arr[i])){
                int top = stack.pop();
                arr[top] = arr[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty()){
            int top = stack.pop();
            arr[top] = -1;
        }

        for(int nge : arr){
            sb.append(nge).append(" ");
        }

        System.out.print(sb);
    }
}