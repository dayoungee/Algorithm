import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i = 0; i < n; i++)  arr.add(Integer.parseInt(br.readLine()));

        Stack<Integer> stack = new Stack<>();
        int beforeNum = 0;
        for(int i = 0; i < arr.size(); i ++) {
            int num = (int)arr.get(i);
            if(num > arr.size()){
                System.out.print("NO");
                return;
            }

            if(beforeNum < num){
                for (int j = beforeNum + 1; j <= num; j++) {
                    sb.append('+').append('\n');
                    stack.push(j);
                }
                beforeNum = num;
            }
            if (stack.pop() == num)  sb.append('-').append('\n');
            else{
                System.out.print("NO");
                return;
            }
        }
        System.out.print(sb);

    }
}
