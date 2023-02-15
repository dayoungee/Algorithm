import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.OptionalInt;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = 9;
        ArrayList<Integer> arr = new ArrayList<>();
        while(n --> 0){
            arr.add(Integer.parseInt(br.readLine()));
        }
        int max = arr.stream().mapToInt(x->x).max().orElseThrow(NoSuchElementException::new);
        //타겟을 찾지 못하면 -1 반환
        int index = (IntStream.range(0, arr.size())
                .filter(i -> max == arr.get(i))
                .findFirst()
                .orElse(-1)) + 1; 

        System.out.println(max + " " + index);
    }

}
