
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static int answer = 0;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        powerSet(arr, new Stack<>(), m, 0);
        System.out.println(answer);

    }

    private static void powerSet(int[] arr, Stack<Integer> stack, int m, int idx) {
        if(idx >= arr.length){
            int sum = stack.stream().mapToInt(n -> n).sum();
            if(sum == m && !stack.isEmpty()){
                answer++;
            }
        }else{
            stack.push(arr[idx]);
            powerSet(arr, stack, m, idx+1);
            stack.pop();
            powerSet(arr, stack, m, idx+1);
        }
    }


}
