import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        String str = st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        while(n-- > 0){
            sb.append(str);   
        }
        System.out.println(sb.toString());
    }
}