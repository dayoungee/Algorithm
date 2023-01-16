
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        
        if(n > 0){
            if(m > 0) System.out.println(1);
            else System.out.println(4);
        }
        else{
            if(m > 0) System.out.println(2);
            else System.out.println(3);
        }
    }

}