import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(n-->0){
            int m = Integer.parseInt(br.readLine());
            String str = solution(m);
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }

    private static String solution(int m) {
        String binaryString = Integer.toBinaryString(m);
        char[] arr = binaryString.toCharArray();
        String str = "";
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] == '1') str += arr.length - 1 - i +" ";
        }
        return str;
    }

}
