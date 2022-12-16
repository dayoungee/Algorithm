import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Main T = new Main();
        System.out.print(T.solution(n));
    }
    public int solution(int n){
        if(n == 1|| n == 2) return 1;
        else if(n == 0) return 0;
        else return solution(n-2) + solution(n-1);
    }

}