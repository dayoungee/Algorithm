import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> map = new HashMap<>();
        String str = br.readLine();
        str = str.toUpperCase();
        for(int i = 0; i < str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
        }

        int max = 0;
        int dummy = 0;
        char answer = ' ';
        for(Character c : map.keySet()){
            int n = map.get(c);
            if(n == max) dummy = n;
            if(max < n){
                max = n;
                answer = c;
            }
        }

        if(dummy == max){
            System.out.print("?");
            return;
        }
        System.out.print(answer);

    }

}
