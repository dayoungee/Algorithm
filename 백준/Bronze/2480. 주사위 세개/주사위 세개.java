import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int max = 0;
        if (A!=B && B!=C && A!=C){
            max = Math.max(max,A);
            max = Math.max(max,B);
            max = Math.max(max,C);
            sb.append(max * 100);

        } else if(A==B && A==C) {
            sb.append(10000 + A * 1000);

        } else if(A==B || A==C){
            sb.append(1000 + A * 100);
        }else{
            sb.append(1000+B*100);
        }
        System.out.println(sb);


    }


}