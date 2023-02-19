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

        if (A!=B && B!=C && A!=C){
            int max;
            if(A>B){
                if(A>C){
                    max = A;
                } else max = C;

            } else if (B>C) {
                max = B;
            } else max = C;

            sb.append(max * 100);

        } else if(A==B && A==C) {
            sb.append(10000+A * 1000); // 틀린 곳  sb.append(10000+A + 1000);

        } else if(A==B || A==C){
            sb.append(1000+ A * 100); //  sb.append(1000+ A + 100);
            /*if(B==C){
                sb.append(1000+B*100);
            }*/
        }else if ( B == C){
            sb.append(1000+B*100);
        }
        System.out.println(sb);


    }


}