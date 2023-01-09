
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 배열 넣기
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(arr[i], max);
        }
        System.out.println(solution(arr));
    }
    static public int solution(int[] arr){
        int answer = 0;
        boolean[] primeCheck = new boolean[max+1];
        // 예외처리
        if(max < 2) return answer;
        primeCheck[1] = true;

        for(int i = 2; i <= Math.sqrt(max); i++){
            if(primeCheck[i] == false){
                for(int j = i*i; j <= max; j= j+i){
                    primeCheck[j] = true;
                }
            }
        }

        for(int n : arr){
            if(primeCheck[n] == false) answer++;
        }
        return answer;
    }

}
