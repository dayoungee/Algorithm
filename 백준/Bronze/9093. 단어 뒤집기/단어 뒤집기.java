

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            sb.append(reversString(String.valueOf(br.readLine()))).append("\n");
        }

        System.out.print(sb);

    }
    public static String reversString(String str){
        String reversStr = "";
        String[] arr = str.split(" ");
        StringBuffer sb;
        for(String s : arr){
            sb = new StringBuffer(s);
            String revers = sb.reverse().toString();
            reversStr += revers + " ";
        }
        return reversStr;
    }

}