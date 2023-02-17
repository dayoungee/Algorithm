import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        //A; 고정비용
        //b: 제품을 만드는덷는비용
        //c: 판매가격
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b =Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if(b>=c){
            System.out.print("-1");
        }
        else{
            System.out.println((a/(c-b))+1);
        }

    }

}
