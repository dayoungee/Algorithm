import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 28;
        boolean[] arr = new boolean[31];
        ArrayList<Integer> no = new ArrayList<>();
        while(n --> 0){
            arr[Integer.parseInt(br.readLine())] = true;
        }

        for(int i = 1; i < 31; i++){
            if(!arr[i]) no.add(i);
        }

        Collections.sort(no);
        System.out.println(no.get(0));
        System.out.println(no.get(1));
    }

}
