import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        Map<Character, Double> map = new HashMap<>();
        for(char c : arr){
            if( c >= 'A' && c <='Z' && !map.containsKey(c)){
                map.put(c, Double.parseDouble(br.readLine()));
            }
        }

        Stack<Double> stack = new Stack<>();
        for (char c : arr) {
            if ('A' <= c && c <= 'Z') stack.push(map.get(c));
            else if (stack.size()>=2) {
                double temp1 = stack.pop();
                double temp2 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(temp2 + temp1);
                        break;
                    case '-':
                        stack.push(temp2 - temp1);
                        break;
                    case '*':
                        stack.push(temp2 * temp1);
                        break;
                    case '/':
                        stack.push(temp2 / temp1);
                        break;
                }
            }
        }
        System.out.println(String.format("%.2f",stack.pop()));
    }
}
