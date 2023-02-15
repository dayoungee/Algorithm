import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.OptionalInt;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();
        while(n --> 0){
            arr.add(Integer.parseInt(st.nextToken()));
        }
        // mapToInt: Stream에서 Int 원시 스트림으로 변환한다.
        // orElseThrow(): 과가 없는 경우에는 NoSuchElementException 예외를 throw한다
        int max = arr.stream().mapToInt(x->x).max().orElseThrow(NoSuchElementException::new);
        int min = arr.stream().mapToInt(x->x).min().orElseThrow(NoSuchElementException::new);

        System.out.println(min + " " + max);
    }

}
