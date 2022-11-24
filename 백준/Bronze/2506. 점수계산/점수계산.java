import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try{
            // scanner 보다 속도가 빠름
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            ArrayList ar = new ArrayList();
            for(int i = 0; st.hasMoreTokens(); i++ )
            {
                ar.add(Integer.parseInt(st.nextToken()));
            }
            Main T = new Main();
            System.out.println(T.solution(ar));
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

    private int solution(ArrayList<Integer> n) {
        int result = 0;
        int score = 0;
        for(int num : n){
            if(num == 1) score++;
            else score = 0;
            result += score;
        }
        return result;
    }
}