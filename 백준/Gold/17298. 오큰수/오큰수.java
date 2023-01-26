
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

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
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