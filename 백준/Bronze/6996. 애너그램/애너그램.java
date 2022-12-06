import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // test case
        int n = Integer.parseInt(st.nextToken());
        Main T = new Main();
        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String str1 = st.nextToken();
            String str2 = st.nextToken();
            T.solution(str1.toCharArray(), str2.toCharArray());
        }

    }

    public void solution(char[] arr, char[] arr2) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        for(char c : arr)   map1.put(c,map1.getOrDefault(c, 0)+1);
        for(char c : arr2)   map2.put(c,map2.getOrDefault(c, 0)+1);

        sb.append(String.valueOf(arr) + " & " + String.valueOf(arr2) +" are");
        if(!map1.equals(map2)) sb.append(" NOT");
        sb.append(" anagrams.");

        System.out.println(sb);


    }

}