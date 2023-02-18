import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(n-->0){
            int m = Integer.parseInt(st.nextToken());
            max = Math.max(m, max);
            min = Math.min(m, min);
        }
        System.out.println(min + " "+ max);

    }

}
