
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i = 1; i <=num; i++)
        {
            int temp = in.nextInt();
            array.add(temp);
        }
        Main T = new Main();
        T.solution(array);
    }

    private void solution(ArrayList array) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int beforeNum = 0;
        for(int i = 0; i < array.size(); i ++)
        {
            int n = (int)array.get(i);
            if(n > array.size())
            {
                System.out.println("NO");
                return;
            }
            if(beforeNum < n) {
                for (int j = beforeNum + 1; j <= n; j++) {
                    sb.append('+').append('\n');
                    stack.push(j);
                }
                beforeNum = n;
            }
            if (stack.pop() == n)  sb.append('-').append('\n');
            else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println(sb);
    }
}